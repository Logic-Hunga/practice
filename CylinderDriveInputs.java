/**java scanner  */
import java.util.*;

/**main class */
public class CylinderDriveInputs {

    /**main method */
    public static void main(String[] args) {

        // java input object Scanner 
        Scanner input = new Scanner (System.in);

        // Enter the class security key
        System.out.print("Enter the class pin: ");
        int userPin = input.nextInt();
        
        System.out.println("4 attempts remaining...");

        int attempts = 1;

        while ( userPin != Cylinder.classPin) {
            System.out.print("Invalid  pin: ");
            userPin = input.nextInt();

            attempts ++;

            if (attempts == 2) {
                System.out.println("3 attempts remaining...");
            }
            else if (attempts == 3) {
                System.out.println("2 attempts remaining...");
            }
            else if (attempts == 4) {
                System.out.println("1 attempt remaining...");
            }
            else if (attempts == 5) {
                System.out.println("Program exited");
                System.exit(1);
            }


        }

        // prompt the user to enter the radius and height ogf the cylinder
        System.out.print("Enter radius: ");
        double radius = input.nextDouble();
        
        System.out.print("Enter height:" );
        double height = input.nextDouble();

        if (radius < 1 || height < 1 ){
            System.out.println("Check inputs.No negatives.Try again");
            System.exit(0);
        }

        // creating the uml class anonymous object
        new Cylinder();

        // Creating the java date time from java library
        java.util.Date date = new java.util.Date();
        java.util.Date milliseconds = new java.util.Date();

        // Display the volume and the surface area of the cylinder
        System.out.println("The total surface area of cylinder is " + new Cylinder (radius, height).getTotalSurfaceArea());
        System.out.println("The volume is " + new Cylinder(radius,  height).getVolume());

        // Display the time and data
        System.out.println("The date today is " + date.toString());
        System.out.println("The milli seconds elapsed since 01/01/1970 is " + milliseconds.getTime());
        
    }
}