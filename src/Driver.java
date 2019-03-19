import org.junit.Assert;
import org.junit.Test;

public class Driver
{

    /*
     * TESTS CHECKLIST Shape Enum DONE 
     * Location Enum DONE 
     * Color enum DONE
     * GamePieceAppearance DONE
     * GamePiece 
     * BoardGame
     */
    public static void main(String[] args)
    {
        GamePiece a = GamePiece.BLUE_BOOT;
        System.out.println(a.toString());
        }

    @Test
    public void testColorValues()
    {
        Color col = null;
        // RED:
        col = Color.RED;
        Assert.assertEquals(" Incorrect  rgb  value  in  color  " + col.name(), 255, col.getR());
        Assert.assertEquals(" Incorrect  rgb  value  in  color  " + col.name(), 0, col.getG());
        Assert.assertEquals(" Incorrect  rgb  value  in  color  " + col.name(), 0, col.getB());

        // GREEN:
        col = Color.GREEN;
        Assert.assertEquals(" Incorrect  rgb  value  in  color  " + col.name(), 0, col.getR());
        Assert.assertEquals(" Incorrect  rgb  value  in  color  " + col.name(), 255, col.getG());
        Assert.assertEquals(" Incorrect  rgb  value  in  color  " + col.name(), 0, col.getB());

        // BLUE:
        col = Color.BLUE;
        Assert.assertEquals(" Incorrect  rgb  value  in  color  " + col.name(), 0, col.getR());
        Assert.assertEquals(" Incorrect  rgb  value  in  color  " + col.name(), 0, col.getG());
        Assert.assertEquals(" Incorrect  rgb  value  in  color  " + col.name(), 255, col.getB());

        // CYAN:
        col = Color.CYAN;
        Assert.assertEquals(" Incorrect  rgb  value  in  color  " + col.name(), 0, col.getR());
        Assert.assertEquals(" Incorrect  rgb  value  in  color  " + col.name(), 255, col.getG());
        Assert.assertEquals(" Incorrect  rgb  value  in  color  " + col.name(), 255, col.getB());

        // MAGENTA:
        col = Color.MAGENTA;
        Assert.assertEquals(" Incorrect  rgb  value  in  color  " + col.name(), 255, col.getR());
        Assert.assertEquals(" Incorrect  rgb  value  in  color  " + col.name(), 0, col.getG());
        Assert.assertEquals(" Incorrect  rgb  value  in  color  " + col.name(), 255, col.getB());

        // YELLOW:
        col = Color.YELLOW;
        Assert.assertEquals(" Incorrect  rgb  value  in  color  " + col.name(), 255, col.getR());
        Assert.assertEquals(" Incorrect  rgb  value  in  color  " + col.name(), 255, col.getG());
        Assert.assertEquals(" Incorrect  rgb  value  in  color  " + col.name(), 0, col.getB());

    }

    // Location Enum test cases
    @Test
    public void testLocation()
    {
        Assert.assertEquals("Location enum values incorrect. ", Location.KITCHEN, Location.valueOf("KITCHEN"));
        Assert.assertEquals("Location enum values incorrect. ", Location.CONSERVATORY,
                Location.valueOf("CONSERVATORY"));
        Assert.assertEquals("Location enum values incorrect. ", Location.DINING_ROOM, Location.valueOf("DININGROOM"));
        Assert.assertEquals("Location enum values incorrect. ", Location.BALLROOM, Location.valueOf("BALLROOM"));
        Assert.assertEquals("Location enum values incorrect. ", Location.STUDY, Location.valueOf("STUDY"));
        Assert.assertEquals("Location enum values incorrect. ", Location.HALL, Location.valueOf("HALL"));
        Assert.assertEquals("Location enum values incorrect. ", Location.LOUNGE, Location.valueOf("LOUNGE"));
        Assert.assertEquals("Location enum values incorrect. ", Location.LIBRARY, Location.valueOf("LIBRARY"));
        Assert.assertEquals("Location enum values incorrect. ", Location.BILLIARD_ROOM,
                Location.valueOf("BILLIARD_ROOM"));
    }

    @Test
    public void testShapeToString()
    {
        Assert.assertEquals("Shape toString incorrect . ", "thimble", Shape.THIMBLE.toString());
        Assert.assertEquals("Shape toString incorrect . ", "boot", Shape.BOOT.toString());
        Assert.assertEquals("Shape toString incorrect . ", "racecar", Shape.RACECAR.toString());
    }

    @Test
    public void testGamePieceAppearance()
    {
        GamePieceAppearance ex = new GamePieceAppearance(Color.RED, Shape.THIMBLE);
        Assert.assertEquals("GPA getColor incorrect", ex.getColor(), Color.RED);
        Assert.assertEquals("GPA getShape incorrect", ex.getShape(), Shape.THIMBLE);
    }
    
    @Test
    public void testGamePiece() {
        GamePiece gp = null;
        gp = GamePiece.BLUE_BOOT;
        Assert.assertEquals("GamePiece color incorrect" + gp.name(), Color.BLUE, gp.getColor());
        Assert.assertEquals("GamePiece shape incorrect" + gp.name(), Shape.BOOT, gp.getShape());
        //Expected toString might be incorrect
        Assert.assertEquals("GamePiece toString incorrect" + gp.name(), "BLUE_BOOT: a BLUE boot with priority 5", gp.toString());
       
        gp = GamePiece.RED_RACER;
        Assert.assertEquals("GamePiece color incorrect" + gp.name(), Color.RED, gp.getColor());
        Assert.assertEquals("GamePiece shape incorrect" + gp.name(), Shape.RACECAR, gp.getShape());
        //Expected toString might be incorrect
        Assert.assertEquals("GamePiece toString incorrect" + gp.name(), "RED_RACER: a RED racecar with priority 0", gp.toString());
     
        gp = GamePiece.BLUE_RACER;
        Assert.assertEquals("GamePiece color incorrect" + gp.name(), Color.BLUE, gp.getColor());
        Assert.assertEquals("GamePiece shape incorrect" + gp.name(), Shape.RACECAR, gp.getShape());
        //Expected toString might be incorrect
        Assert.assertEquals("GamePiece toString incorrect" + gp.name(), "BLUE_RACER: a BLUE racecar with priority 2", gp.toString());
        
        gp = GamePiece.MAGENTA_RACER;
        Assert.assertEquals("GamePiece color incorrect" + gp.name(), Color.MAGENTA, gp.getColor());
        Assert.assertEquals("GamePiece shape incorrect" + gp.name(), Shape.RACECAR, gp.getShape());
        //Expected toString might be incorrect
        Assert.assertEquals("GamePiece toString incorrect" + gp.name(), "MAGENTA_RACER: a MAGENTA racecar with priority 1", gp.toString());
        
        gp = GamePiece.RED_THIMBLE;
        Assert.assertEquals("GamePiece color incorrect" + gp.name(), Color.RED, gp.getColor());
        Assert.assertEquals("GamePiece shape incorrect" + gp.name(), Shape.THIMBLE, gp.getShape());
        //Expected toString might be incorrect
        Assert.assertEquals("GamePiece toString incorrect" + gp.name(), "RED_THIMBLE: a RED thimble with priority 10", gp.toString());
        
        gp = GamePiece.GREEN_BOOT;
        Assert.assertEquals("GamePiece color incorrect" + gp.name(), Color.GREEN, gp.getColor());
        Assert.assertEquals("GamePiece shape incorrect" + gp.name(), Shape.BOOT, gp.getShape());
        //Expected toString might be incorrect
        Assert.assertEquals("GamePiece toString incorrect" + gp.name(), "GREEN_BOOT: a GREEN boot with priority 8", gp.toString());
       
        gp = GamePiece.YELLOW_BOOT;
        Assert.assertEquals("GamePiece color incorrect" + gp.name(), Color.YELLOW, gp.getColor());
        Assert.assertEquals("GamePiece shape incorrect" + gp.name(), Shape.BOOT, gp.getShape());
        //Expected toString might be incorrect
        Assert.assertEquals("GamePiece toString incorrect" + gp.name(), "YELLOW_BOOT: a YELLOW boot with priority 7", gp.toString());
       
        //Testing movesFirst method
        GamePiece prior10 = GamePiece.RED_THIMBLE;
        GamePiece prior2 = GamePiece.BLUE_RACER;
        
        Assert.assertEquals("Wrong game piece moving first", prior2, gp.movesFirst(prior10, prior2));
        
    }

}
