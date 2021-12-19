/**java scanner */
import java.util.*;


/**main class */
public class circlesDrive {

    /**main method */
    public static void main(String[] args) {

        // java input  object Scanner
        Scanner input = new Scanner (System.in);

        // prompt the user to enter the pin to run the program
        System.out.print("Enter the security pin: ");
        int userPin = input.nextInt();
        System.out.println("4 attempts remaining.\n");

        // System.out.println("The class pin is " + circles.classPin);

        int pinAttempts = 1;
        while (userPin != circles.classPin) {
            System.out.print("Invalid Pin.Try again: \n");
            userPin = input.nextInt();
            pinAttempts++;

            if  (pinAttempts == 2) {
                System.out.println("3 attempts remaining.\n");
            }
            else if (pinAttempts == 3) {
                System.out.println("2 attempts remaining.\n");
            }
            else if (pinAttempts == 4) {
                System.out.println("1 attempt remaining.\n");
            }
            else if (pinAttempts == 5) {
                System.out.println("Program exited.");
                System.exit(0);
            }

        }
        circles myCircle = new circles();

        // Display the area of the circle
        System.out.println("The area of the circle is " + myCircle.getArea());
        // Display the circumference of the circle
        System.out.println("The circumference of the circle is " + myCircle.getCircumference());
    }
}