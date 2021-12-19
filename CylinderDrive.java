/**Java Scanner  */
import java.util.*;

/**main class */
public class CylinderDrive {

    /**main method */
    public static void main(String[] args) {
        
        // java input scanner object
        Scanner scanner = new Scanner(System.in);

        // The java date object from the java class file
        java.util.Date date = new java.util.Date(); // for date
        java.util.Date milliseconds  = new java.util.Date(); // for the the seconds

        // creating the class object
        Cylinder Cylinder1 = new Cylinder(24, 30);
        System.out.println("The volume is " + Cylinder1.getVolume());

        // displaying the seconds since 01/01/1970
        System.out.println("The seconds elapsed since 01/01/1970 is " + milliseconds.getTime() + " ms");
        System.out.println("The date to day is " + date.toString()); 
    }
}