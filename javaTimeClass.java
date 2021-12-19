/**main class */
public class javaTimeClass {

    // main method
    public static void main(String[] args) {

        // java date time object
        java.util.Date currentDate = new java.util.Date();
        
        // get the current date and time
        System.out.println("The current time and date is " + currentDate.toString());
        System.out.println("The seconds elapsed since 01/01/1970 is" + currentDate.getTime());
    }
}