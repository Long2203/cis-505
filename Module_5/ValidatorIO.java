/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by P. Gold 2023
 Nguyen, L. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/
import java.util.Scanner;

// Defining a public class named ValidatorIO
public class ValidatorIO {

    // Defining a public static method named getInt that takes a Scanner object and a String prompt as parameters
    public static int getInt(Scanner sc, String prompt) {
        // Initializing an integer variable named input with a value of 0
        int input = 0;
        // Initializing a boolean variable named isValid with a value of false
        boolean isValid = false;
        // Entering into a loop that continues until isValid is true
        while (!isValid) {
            // Printing out the prompt passed as a parameter to the method
            System.out.print(prompt);
            // Checking if the next token in the Scanner object is an integer
            if (sc.hasNextInt()) {
                // If the next token is an integer, set the input variable to that value
                input = sc.nextInt();
                // Set the isValid variable to true
                isValid = true;
            } else {
                // If the next token is not an integer, print out an error message
                System.out.println("\nError! Invalid integer value.\n");
            }
            // Consuming the remaining newline character from the input
            sc.nextLine();
        }
        // Returning the input value
        return input;
    }

    // Defining a public static method named getDouble that takes a Scanner object and a String prompt as parameters
    public static double getDouble(Scanner sc, String prompt) {
        // Initializing a double variable named input with a value of 0
        double input = 0;
        // Initializing a boolean variable named isValid with a value of false
        boolean isValid = false;
        // Entering into a loop that continues until isValid is true
        while (!isValid) {
            // Printing out the prompt passed as a parameter to the method
            System.out.print(prompt);
            // Checking if the next token in the Scanner object is a double
            if (sc.hasNextDouble()) {
                // If the next token is a double, set the input variable to that value
                input = sc.nextDouble();
                // Set the isValid variable to true
                isValid = true;
            } else {
                // If the next token is not a double, print out an error message
                System.out.println("\nError! Invalid double value.\n");
            }
            // Consuming the remaining newline character from the input
            sc.nextLine();
        }
        // Returning the input value
        return input;
    }

    // Defining a public static method named getString that takes a Scanner object and a String prompt as parameters
    public static String getString(Scanner sc, String prompt) {
        // Printing out the prompt passed as a parameter to the method
        System.out.print(prompt);
        // Returning the next line of input from the Scanner object
        return sc.nextLine();
    }
} // End ValidatorIO
