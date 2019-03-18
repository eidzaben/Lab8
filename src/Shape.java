public enum Shape
{
    // Possible shape enums
    THIMBLE, BOOT, RACECAR;

    // toString overridden returning lowercase name
    public String toString()
    {
        return this.name().toLowerCase();
    }
}
