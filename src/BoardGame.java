import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class BoardGame
{
    // Instance Variables
    protected LinkedHashMap<String, GamePiece> playerPieces;
    protected LinkedHashMap<String, Location> playerLocations;

    // Constructor initiallizes variables
    public BoardGame()
    {
        playerPieces = new LinkedHashMap<String, GamePiece>();
        playerLocations = new LinkedHashMap<String, Location>();
    }

    //Checks whether a player already has a certain gamePiece
    //If not, the player is added to the game and false is returned
    public boolean addPlayer(String playerName, GamePiece gamePiece, Location initialLocation)
    {
        if (playerPieces.containsValue(gamePiece))
        {
            return false;
        } else
        {
            playerPieces.put(playerName, gamePiece);
            playerLocations.put(playerName, initialLocation);
            return true;
        }
    }

    public GamePiece getPlayerGamePiece(String playerName)
    {
        return playerPieces.get(playerName);
    }

    // Uses a for loop that cycles through Players
    // Then an if statement determines if each names associated gamepiece equals the
    // parameter
    public String getPlayerWithGamePiece(GamePiece gamePiece)
    {
        for (String name : playerPieces.keySet())
        {
            if (playerPieces.get(name).toString().equals(gamePiece.toString()))
            {
                return name;
            }
        }
        return null;

    }

    // Changes the players location
    public void movePlayer(String playerName, Location newLocation)
    {
        playerLocations.put(playerName, newLocation);
    }

    // Finds which game piece should move first by calling the movesFirst method
    //Then returns a string array of the playerNames in order
    public String[] moveTwoPlayers(String[] playerNames, Location[] newLocations)
    {
  
        GamePiece a = playerPieces.get(playerNames[0]);
        GamePiece b = playerPieces.get(playerNames[1]);
      

        GamePiece first = GamePiece.movesFirst(a,b);
        if (!first.toString().equals(playerPieces.get(playerNames[0]).toString()))
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
        return playerLocations.get(player);
    }

    /*
     * using an if statement inside a for loop inside an if statement inside another for loop, 
     * this method returns an ArrayList of Strings containing names of players
     */
    public ArrayList<String> getPlayersAtLocation(Location loc)
    {
        ArrayList<String> players = new ArrayList<String>();
        
        for (String p : playerLocations.keySet())
        {
            if (playerLocations.get(p).equals(loc))
            {
                players.add(p);
            }
        }
       /* 
        for (Location l : playerLocations.values())
        {
            if (l.equals(loc))
            {
                for (String p : playerLocations.keySet())
                {
                    if (playerLocations.get(p).equals(loc))
                    {
                        players.add(p);
                    }
                }
                // players.add(playerLocations.keySet().toString());
            }
        }
        */
        return players;
    }

    /*
     * Goes through all the playerNames and determines which ones have a location
     * That is the same as the parameter
     */

    public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc)
    {
        ArrayList<GamePiece> gp = new ArrayList<GamePiece>();
        for (String name : playerLocations.keySet())
        {
            if (playerLocations.get(name).toString().equals(loc.toString()))
            {
                gp.add(playerPieces.get(name));
            }
        }
        return gp;

    }

    // Returns the player names in a set using a for loop
    public Set<String> getPlayers()
    {
        Set<String> players = new HashSet<String>();
        for (String playa : playerPieces.keySet())
        {
            players.add(playa);
        }
        return players;
    }

    // Returns the Locations in a set using a for loop
    public Set<Location> getPlayerLocations()
    {
        Set<Location> locations = new HashSet<Location>();
        for (Location l : playerLocations.values())
        {
            locations.add(l);
        }
        return locations;
    }

    // Returns gamePieces in a set using a for loop
    public Set<GamePiece> getPlayerPieces()
    {
        Set<GamePiece> gp = new HashSet<GamePiece>();
        for (GamePiece piece : playerPieces.values())
        {
            gp.add(piece);
        }
        return gp;
    }
}