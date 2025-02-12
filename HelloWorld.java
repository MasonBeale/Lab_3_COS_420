/*
 * Mason Beale
 * Date: February 12, 2025
 * 
 * HelloWorld.java
 * 
 * Prints a hello world message and the current date.
 */

package Lab_3_COS_420;
import java.time.*;

public class HelloWorld {
    
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        // Printing
        System.out.println("Hello World!");
        System.out.println("It is currently " + date);
    }
}
