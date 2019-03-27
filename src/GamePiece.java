public enum GamePiece
{
    // Setting each gamePiece with parameters
    RED_RACER(new GamePieceAppearance(Color.RED, Shape.RACECAR), 0),
    BLUE_RACER(new GamePieceAppearance(Color.BLUE, Shape.RACECAR), 2),
    MAGENTA_RACER(new GamePieceAppearance(Color.MAGENTA, Shape.RACECAR), 1),
    RED_THIMBLE(new GamePieceAppearance(Color.RED, Shape.THIMBLE), 10),
    BLUE_BOOT(new GamePieceAppearance(Color.BLUE, Shape.BOOT), 5),
    GREEN_BOOT(new GamePieceAppearance(Color.GREEN, Shape.BOOT), 8),
    YELLOW_BOOT(new GamePieceAppearance(Color.YELLOW, Shape.BOOT), 7);

    // Instance variables
    private GamePieceAppearance appearance;
    private int priority;

    // Constructor with parameters
    private GamePiece(GamePieceAppearance appearance, int priority)
    {
        this.appearance = appearance;
        this.priority = priority;

    }

    // Getter for color
    public Color getColor()
    {
        return appearance.getColor();
    }

    // Getter for shape
    public Shape getShape()
    {
        return appearance.getShape();
    }

    // Determines which piece moves first depending on each pieces priority
    public static GamePiece movesFirst(GamePiece a, GamePiece b)
    {
        if (a.priority > b.priority)
        {
            return b;
        } else
        {
            return a;
        }
    }

    // Overrides the previous toString
    public String toString()
    {
        // Formatted using Javadoc
        return String.format("%s: a %s %s with priority %d", this.name(), this.getColor(), this.getShape(),
                this.priority);
    }

}
