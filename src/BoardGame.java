import java.util.LinkedHashMap;

public class BoardGame {
    
    protected LinkedHashMap<String, GamePiece> PlayerPieces;
    protected LinkedHashMap<String, Location> PlayerLocations;
    
    public boardGame() {
        
    }
    
    public addPlayer(String playerName, GamePiece gamePiece, Location initialLocation) {
        
    }
    
    public GamePiece getPlayerGamePiece(String playerName) {
        
    }
    
    public String getPlayerWithGamePiece(GamePiece gamePiece) {
        
    }
    
    public void movePlayer(String playerName, Location newLocation) {
        
    }
    
    public String[] moveTwoPlayers(String[] playerNames , Location[] newLocations ) {
        
    }
    
    public Location getPlayersLocation(String player) {
        
    }
    
    public ArrayList<String> getPlayersAtLocation(Location loc){
        
    }
    
    public ArrayList<GamePieces> getGamePiecesAtLocation(Location loc) {
        
    }
    
    public Set<String> getPlayers() {
        
    }
    
    public Set<Location> getPlayerLocations() {
        
    }
    
    public Set<GamePiece> getPlayerPieces() {
        
    }
}