/**import java Scanner */
import java.util.*;

/**main class */
public class circlesDriveAnonymousObject {

    /**main method */
    public static void main(String[] args) {

        // java input scanner object
        Scanner input = new Scanner(System.in);

        // Creating the anonymous number
        new circles();

        // Display the area of the circle
        System.out.println("The area of circles is " + new circles(10).getArea());
    }
}