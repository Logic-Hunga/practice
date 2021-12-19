/**Uml(defining class) */
public class circles {

    // default static and instance data fields
    static int classPin = 747;
    static int numberOfObjects = 0;
    double radius = 1;

    // The class object constructor
    public circles() {

    }
    // Constructor
    public circles(double radius) {
        this.radius = radius;
        numberOfObjects++;
    }

    // Default class data fields mutator
    public void setRadius(double radius) {
        this.radius = (radius < 0) ? radius : 0;
    }
    
    /**Accessors*/
    public static int getClassPin() {
        return classPin;
    }
    // Access numberOfObjects
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
    // Access radius
    public double getRadius() {
        return radius;
    }

    // Access Area
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    // Access the circumference
    public double getCircumference() {
        return Math.PI * 2  * radius;
    }

}