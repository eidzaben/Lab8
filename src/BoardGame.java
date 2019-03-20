import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class BoardGame {
    
    protected LinkedHashMap<String, GamePiece> PlayerPieces;
    protected LinkedHashMap<String, Location> PlayerLocations;
    
    public BoardGame() {
        PlayerPieces = new LinkedHashMap<String, GamePiece>();
        PlayerLocations = new LinkedHashMap<String, Location>();
    }
    
    public boolean addPlayer(String playerName, GamePiece gamePiece, Location initialLocation) {
        if (PlayerLocations.containsValue(initialLocation)) {
            return false;
        } else {
            PlayerPieces.put(playerName, gamePiece);
            PlayerLocations.put(playerName, initialLocation);
            return true;
        }
    }
    
    public GamePiece getPlayerGamePiece(String playerName) {
        return PlayerPieces.get(playerName);
    }
    
    //NOT COMPLETE, How do I retrieve the key using value??
    //Update, possibly complete
    public String getPlayerWithGamePiece(GamePiece gamePiece) {
        for (String name : PlayerPieces.keySet()) {
            if (PlayerPieces.get(name).toString().equals(gamePiece.toString())){
                return name;
            } 
        }
        return null;
      
    }
    
    public void movePlayer(String playerName, Location newLocation) {
        PlayerLocations.put(playerName, newLocation);
    }
    
    public String[] moveTwoPlayers(String[] playerNames , Location[] newLocations ) {
    // GamePiece first = new GamePiece();
      //       first = first.movesFirst(a, b)movesFirst(PlayerPieces.get(playerNames[0]),PlayerPieces.get(playerNames[1]));
        //      if (first)
        GamePiece a = null;
        GamePiece b = null;
                  for (String players : PlayerPieces.keySet()) {
                      if(players.equalsIgnoreCase(playerNames[0])) {
                          a = PlayerPieces.get(players);
                      }
                      if(players.equalsIgnoreCase(playerNames[1])) {
                          b = PlayerPieces.get(players);
                       }
                      
                  }
              
                 GamePiece first =  PlayerPieces.get(playerNames[0]).movesFirst(a,b);
                 if (!first.toString().equals(PlayerPieces.get(playerNames[0]).toString())) {
                     String temp = playerNames[0];
                     playerNames[0] = playerNames[1];
                     playerNames[1] = temp;
                     Location tempLocation = newLocations[0];
                     newLocations[0] = newLocations[1];
                     newLocations[1] = tempLocation;
                     
                 }
                  return playerNames;
     }
    
    public Location getPlayersLocation(String player) {
       return PlayerLocations.get(player);
    }
    
    //This method is definitely wrong
    public ArrayList<String> getPlayersAtLocation(Location loc){
        ArrayList<String> players = new ArrayList<String>();
        for (Location l : PlayerLocations.values()) {
            if (l.equals(loc)) {
                //FIX THIS LINE
                players.add(PlayerLocations.keySet().toString());
            }
        }
        return players;
    }
    
    //Still dont know how to retrieve keys using value
    //UPDATE, Possibly correct, needs testing.
    public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc) {
        ArrayList<GamePiece> gp = new ArrayList<GamePiece>();
        for (String name : PlayerLocations.keySet()) {
            if (PlayerLocations.get(name).toString().equals(loc.toString())){
               gp.add(PlayerPieces.get(name));
            } 
        }
        return gp;
        
    }
    
    public Set<String> getPlayers() {
        Set<String> players = new HashSet<String>();
        for (String playa : PlayerPieces.keySet()) {
            players.add(playa);
        }
        return players;
    }
    
    public Set<Location> getPlayerLocations() {
        Set<Location> locations = new HashSet<Location>();
        for (Location l : PlayerLocations.values()) {
            locations.add(l);
        }
        return locations;
    }
    
    public Set<GamePiece> getPlayerPieces() {
        Set<GamePiece> gp = new HashSet<GamePiece>();
        for (GamePiece piece : PlayerPieces.values()) {
            gp.add(piece);
        }
        return gp;
    }
}