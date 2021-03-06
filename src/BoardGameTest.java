import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class BoardGameTest
{

    @Test
    public void testBoardGame() {
        //AddPlayer test
        BoardGame bg = new BoardGame();
        
      bg.addPlayer("Paul", GamePiece.BLUE_BOOT, Location.BALLROOM);
        Assert.assertEquals("AddPlayer method returned incorrect value", true, bg.addPlayer("Harry", GamePiece.BLUE_RACER, Location.BALLROOM));
        Assert.assertEquals("AddPlayer method returned incorrect value", false, bg.addPlayer("Harry", GamePiece.BLUE_BOOT, Location.BILLIARD_ROOM));
 
        //GetPlayerGamePiece test
       Assert.assertEquals("GetPlayerGamePiece incorrect", GamePiece.BLUE_BOOT, bg.getPlayerGamePiece("Paul"));
        
        //GetPlayerWithGamePiece test
        Assert.assertEquals("GetPlayerWithGamePiece incorrect", "Paul", bg.getPlayerWithGamePiece(GamePiece.BLUE_BOOT));
        Assert.assertEquals("GetPlayerWithGamePiece incorrect", null, bg.getPlayerWithGamePiece(GamePiece.RED_RACER));

        //MovePlayer and getPlayersLocation Test
        bg.movePlayer("Paul", Location.BILLIARD_ROOM);
        Assert.assertEquals("MovePlayer incorrect", Location.BILLIARD_ROOM, bg.getPlayersLocation("Paul"));
        
        //Move Two Players Test (Doesn't need rearrangement)
      bg.addPlayer("Ralph", GamePiece.GREEN_BOOT, Location.DINING_ROOM);
        String[] names = {"Paul", "Ralph"};
        Location[] locations = {Location.BALLROOM, Location.DINING_ROOM};
        Assert.assertArrayEquals("MoveTwoPlayers incorrect", names, bg.moveTwoPlayers(names, locations));
       
        //Move Two Players Test (Needs rearrangement)
        String[] names2 = {"Ralph","Paul"};
        Location[] locations2 = {Location.DINING_ROOM, Location.BALLROOM};
        Assert.assertArrayEquals("MoveTwoPlayers Incorrect", names, bg.moveTwoPlayers(names2, locations2));
        
        //GetPlayersAtLocation test *NOT PASSING*
      bg.addPlayer("Bob", GamePiece.MAGENTA_RACER, Location.HALL);
      bg.addPlayer("Bill", GamePiece.RED_THIMBLE, Location.HALL);
        ArrayList<String> expPlayers = new ArrayList<String>();
        expPlayers.add("Bob");
        expPlayers.add("Bill");
        Assert.assertEquals("GetPlayersAtLocation incorrect", expPlayers.get(0), bg.getPlayersAtLocation(Location.HALL).get(0));
     Assert.assertEquals("GetPlayersAtLocation incorrect", expPlayers.get(1), bg.getPlayersAtLocation(Location.HALL).get(1));
        
        //GetGamePiecesAtLocation Test
        ArrayList<GamePiece> expPieces = new ArrayList<GamePiece>();
        expPieces.add(GamePiece.MAGENTA_RACER);
        expPieces.add(GamePiece.RED_THIMBLE);
        Assert.assertEquals("GetGamePiecesAtLocation incorrect", GamePiece.MAGENTA_RACER, bg.getGamePiecesAtLocation(Location.HALL).get(0));
        Assert.assertEquals("GetGamePiecesAtLocation incorrect", GamePiece.RED_THIMBLE, bg.getGamePiecesAtLocation(Location.HALL).get(1));
 
        
        //GetPlayers test
        Assert.assertTrue(bg.getPlayers().contains("Bob"));
        Assert.assertTrue(bg.getPlayers().contains("Paul"));
        Assert.assertTrue(bg.getPlayers().contains("Ralph"));
        Assert.assertTrue(bg.getPlayers().contains("Bill"));

        //GetplayerLocations
        Assert.assertTrue(bg.getPlayerLocations().contains(Location.HALL));
        Assert.assertTrue(bg.getPlayerLocations().contains(Location.DINING_ROOM));
        Assert.assertTrue(bg.getPlayerLocations().contains(Location.BALLROOM));

        
        
        //GetplayerPieces
        Assert.assertTrue(bg.getPlayerPieces().contains(GamePiece.MAGENTA_RACER));
        Assert.assertTrue(bg.getPlayerPieces().contains(GamePiece.RED_THIMBLE));
        Assert.assertTrue(bg.getPlayerPieces().contains(GamePiece.GREEN_BOOT));
        Assert.assertTrue(bg.getPlayerPieces().contains(GamePiece.BLUE_BOOT));

        
    }

}
