import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class BoardGame
{
    // Instance Variables
    protected LinkedHashMap<String, GamePiece> PlayerPieces;
    protected LinkedHashMap<String, Location> PlayerLocations;

    // Constructor initiallizes variables
    public BoardGame()
    {
        PlayerPieces = new LinkedHashMap<String, GamePiece>();
        PlayerLocations = new LinkedHashMap<String, Location>();
    }

    //Checks whether a player already has a certain gamePiece
    //If not, the player is added to the game and false is returned
    public boolean addPlayer(String playerName, GamePiece gamePiece, Location initialLocation)
    {
        if (PlayerPieces.containsValue(gamePiece))
        {
            return false;
        } else
        {
            PlayerPieces.put(playerName, gamePiece);
            PlayerLocations.put(playerName, initialLocation);
            return true;
        }
    }

    public GamePiece getPlayerGamePiece(String playerName)
    {
        return PlayerPieces.get(playerName);
    }

    // Uses a for loop that cycles through Players
    // Then an if statement determines if each names associated gamepiece equals the
    // parameter
    public String getPlayerWithGamePiece(GamePiece gamePiece)
    {
        for (String name : PlayerPieces.keySet())
        {
            if (PlayerPieces.get(name).toString().equals(gamePiece.toString()))
            {
                return name;
            }
        }
        return null;

    }

    // Changes the players location
    public void movePlayer(String playerName, Location newLocation)
    {
        PlayerLocations.put(playerName, newLocation);
    }

    // Finds which game piece should move first by calling the movesFirst method
    //Then returns a string array of the playerNames in order
    public String[] moveTwoPlayers(String[] playerNames, Location[] newLocations)
    {
  
        GamePiece a = PlayerPieces.get(playerNames[0]);
        GamePiece b = PlayerPieces.get(playerNames[1]);
      

        GamePiece first = PlayerPieces.get(playerNames[0]).movesFirst(a, b);
        if (!first.toString().equals(PlayerPieces.get(playerNames[0]).toString()))
        {
            String temp = playerNames[0];
            playerNames[0] = playerNames[1];
            playerNames[1] = temp;
            Location tempLocation = newLocations[0];
            newLocations[0] = newLocations[1];
            newLocations[1] = tempLocation;

        }
        return playerNames;
    }

    // Returns the location of a given player
    public Location getPlayersLocation(String player)
    {
        return PlayerLocations.get(player);
    }

    /*
     * using an if statement inside a for loop inside an if statement inside another for loop, 
     * this method returns an ArrayList of Strings containing names of players
     */
    public ArrayList<String> getPlayersAtLocation(Location loc)
    {
        ArrayList<String> players = new ArrayList<String>();
        for (Location l : PlayerLocations.values())
        {
            if (l.equals(loc))
            {
                for (String p : PlayerLocations.keySet())
                {
                    if (PlayerLocations.get(p).equals(loc))
                    {
                        players.add(p);
                    }
                }
                // players.add(PlayerLocations.keySet().toString());
            }
        }
        return players;
    }

    /*
     * Goes through all the playerNames and determines which ones have a location
     * That is the same as the parameter
     */

    public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc)
    {
        ArrayList<GamePiece> gp = new ArrayList<GamePiece>();
        for (String name : PlayerLocations.keySet())
        {
            if (PlayerLocations.get(name).toString().equals(loc.toString()))
            {
                gp.add(PlayerPieces.get(name));
            }
        }
        return gp;

    }

    // Returns the player names in a set using a for loop
    public Set<String> getPlayers()
    {
        Set<String> players = new HashSet<String>();
        for (String playa : PlayerPieces.keySet())
        {
            players.add(playa);
        }
        return players;
    }

    // Returns the Locations in a set using a for loop
    public Set<Location> getPlayerLocations()
    {
        Set<Location> locations = new HashSet<Location>();
        for (Location l : PlayerLocations.values())
        {
            locations.add(l);
        }
        return locations;
    }

    // Returns gamePieces in a set using a for loop
    public Set<GamePiece> getPlayerPieces()
    {
        Set<GamePiece> gp = new HashSet<GamePiece>();
        for (GamePiece piece : PlayerPieces.values())
        {
            gp.add(piece);
        }
        return gp;
    }
}