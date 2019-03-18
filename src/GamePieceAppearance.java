public class GamePieceAppearance
{
    // Instance variables
    private Shape shape;
    private Color color;

    // Constructor with color and shape
    public GamePieceAppearance(Color color, Shape shape)
    {
        // Setting parameters equal to instance variables
        this.color = color;
        this.shape = shape;
    }

    // Getter to get color
    public Color getColor()
    {
        return color;
    }

    // Getter to get shape
    public Shape getShape()
    {
        return shape;
    }
}
