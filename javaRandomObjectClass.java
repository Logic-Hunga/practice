/**import java scanner  */
import java.util.*;

/** main class*/ 
public class javaRandomObjectClass {

    /** main method */
    public static void main (String[] args) {

        /**main method body */
        // java input object scanner
        Scanner input = new Scanner(System.in);

        // prompt the user to enter the seed
        System.out.println("Enter type of the value:(eg 4 means four digit numbers will be generated): ");
        int randomNumberSeed = input.nextInt();

        // prompt the user the enter the number of values to be generated
        System.out.print("Enter number of values to be generated(eg 4 mean four numbers will be generated: ");
        int numberOfValues = input.nextInt();

        // prompt the user to enter the range of numbers to generate
        System.out.print("Enter range of random numbers (eg 1000 means last values is 999: ");
        int range = input.nextInt();

        // Creating the random object from the java library
        java.util.Random randomNumbers = new java.util.Random(randomNumberSeed);
        
        System.out.println("The random numbers are: ");
        for (int i = 0; i < numberOfValues; i ++) {
            System.out.print(randomNumbers.nextInt(range) + " ");
        }
        System.out.println();
        // Other numbers include of double type
        for (int i = 0; i < numberOfValues; i ++) {
            System.out.print(randomNumbers.nextDouble() + " ");
        }
    }
}