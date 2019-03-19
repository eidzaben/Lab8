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
        // TODO Auto-generated method stub

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

}
