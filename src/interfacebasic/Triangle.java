package interfacebasic;

/**
 * Represents a right-angle triangle.
 */
public class Triangle implements Shape{

    /** Initialises class variables.
     * @param base the base of the triangle
     * @param height the height of the triangle
     */
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}