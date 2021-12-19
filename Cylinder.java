/**main uml class */
public class Cylinder {

    // default static and instance data fields
    static int classPin = 1976;
    double radius = 1;
    double height = 1;

    // The uml class object constructor
    public Cylinder() {
    }
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // The mutator methods
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    // Accessor methods
    public double getRadius() {
        return radius;
    }
    public double getHeight() {
        return height;
    }
    public double getTotalSurfaceArea() {
        return 2 * Math.PI * Math.pow(radius, 2) * 2 * Math.PI * radius * height;
    }
    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}