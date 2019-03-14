public enum Color
{
        RED(255,0,0), GREEN(0, 255, 0), BLUE(0, 0, 255), CYAN(0,255, 255), MAGENTA(255, 0, 255), YELLOW(255, 255, 0);
    
    private int r, g, b;

    private Color(int r, int g, int b) {
  
        this.r = r;
        this.g = g;
        this.b = b;
    }
    
    public int getR() {
        return r;
    }
    
    public int getB() {
        return b;
    }
    
    public int getG() {
        return g;
    }
}