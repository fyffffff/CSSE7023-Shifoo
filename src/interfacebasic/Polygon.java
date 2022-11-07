package interfacebasic;

/**
 * Represents a multi-sided shape. Each side is has the same length.
 */
public class Polygon implements Shape{


    /** Initialises class variables.
     * @param numberSides the number sides the polygon has. e.g. a Hexagon has 6 sides
     * @param sideLength the length of each side (in metres)
     */
    private final int numberSides;
    private final double sideLength;

    public Polygon(int numberSides, double sideLength) {
        this.numberSides = numberSides;
        this.sideLength = sideLength;
    }


    @Override
    public double calculateArea() {
        return (Math.pow(sideLength, 2) * numberSides) /
                (4 * Math.tan(Math.PI/numberSides));
    }
}
