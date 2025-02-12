/*
 * Mason Beale
 * Date: February 12, 2025
 * 
 * HelloWorld.java
 * 
 * Prints a hello world message, the current date, and the amount of free memory.
 */

package Lab_3_COS_420;
import java.time.*;

public class HelloWorld {
    
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        Runtime runtime = Runtime.getRuntime();
        long mem = runtime.freeMemory();
        // Printing
        System.out.println("Hello World!");
        System.out.println("It is currently " + date);
        System.out.println("Current free memory: " + mem/1000000 + "MB");
    }
}
