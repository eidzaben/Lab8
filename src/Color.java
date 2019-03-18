public enum Color
{
    // Setting enums for possible colors
    RED(255, 0, 0), GREEN(0, 255, 0), BLUE(0, 0, 255), CYAN(0, 255, 255), MAGENTA(255, 0, 255), YELLOW(255, 255, 0);

    // Declaring int values for colors
    private int r, g, b;

    // Constructor for each color
    private Color(int r, int g, int b)
    {

        this.r = r;
        this.g = g;
        this.b = b;
    }

    // Getter for red
    public int getR()
    {
        return r;
    }

    // Getter for blue
    public int getB()
    {
        return b;
    }

    // Getter for green
    public int getG()
    {
        return g;
    }
}