
public class GamePieceAppearance
{
    private Shape shape;
    private Color color;
    
    public GamePieceAppearance(Color color, Shape shape) {
        this.color = color;
        this.shape = shape;
    }
   
    
    public Color getColor() {
        return color;
    }
    
    public Shape getShape() {
        return shape;
    }
}
