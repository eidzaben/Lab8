import org.junit.Assert;
import org.junit.Test;

public class GamePieceAppearanceTest
{

    @Test
    public void testGamePieceAppearance()
    {
        GamePieceAppearance ex = new GamePieceAppearance(Color.RED, Shape.THIMBLE);
        Assert.assertEquals("GPA getColor incorrect", ex.getColor(), Color.RED);
        Assert.assertEquals("GPA getShape incorrect", ex.getShape(), Shape.THIMBLE);
    }

}
