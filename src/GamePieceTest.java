import org.junit.Assert;

public class GamePieceTest
{

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
        
        GamePiece actual = GamePiece.movesFirst(prior10, prior2);
        GamePiece actualInReverse = GamePiece.movesFirst(prior2, prior10);
        
        Assert.assertEquals("Wrong game piece moving first", prior2, actual);
        Assert.assertEquals("Wrong game piece moving first", prior2, actualInReverse);
        
         
    }
}
