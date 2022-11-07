package interfacebasic;

public class Circle implements Shape{


    /** Initialises class variables.
     * @param radius the radius of the circle
     */
    private final double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}