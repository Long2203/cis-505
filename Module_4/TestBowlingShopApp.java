/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
 Nguyen, L. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/
import java.util.Scanner;
//Create TestBowlingShopApp
public class TestBowlingShopApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// Create a Scanner object for user input
        char choice;// Declare a character variable for user's menu choice
        System.out.println("  Welcome to the Bowling Shop\n"); // print the Welcome Message
        do {
        // Start a do-while loop for user to choose options
            displayMenu();
             // Get the user's choice and convert it to lowercase
            choice = input.nextLine().toLowerCase().charAt(0);
            // Use a switch statement to handle the user's choice
            switch (choice) {
                case 'b':
                    // Get the bowling balls from the database
                    System.out.println("\n  --Product Listing--");
                    GenericQueue<Product> ball = ProductDB.getProducts("b");
                    displayProducts(ball);// Call the method to display the products
                    break;
                case 'a':
                    System.out.println("\n  --Product Listing--");
                    GenericQueue<Product> bag = ProductDB.getProducts("a");// Get the bowling bags from the database
                    displayProducts(bag);// Call the method to display the products
                    break;
                case 's':
                    System.out.println("\n  --Product Listing--");
                    GenericQueue<Product> shoe = ProductDB.getProducts("s");// Get the bowling shoes from the database
                    displayProducts(shoe);// Call the method to display the products
                    break;
                case 'x':
                    System.out.println("\n  End of line...");// Print a message to indicate the end of the program
                    break;
                default:
                    System.out.println("\n  Invalid option. Please try again.");// Print an error message for invalid choice
                    break;
            }
	//
        } while (choice != 'x');// Continue the loop until the user chooses to exit
    }

    public static void displayMenu() {
        System.out.print(
        		"\n  MENU OPTIONS\n" +
                "    1. <b> Bowling Balls\n" +
                "    2. <a> Bowling Bags\n" +
                "    3. <s> Bowling Shoes\n" +
                "    4. <x> To exit\n\n" +
                "  Please choose an option: ");// Print the menu options for the user
            }

    public static void displayProducts(GenericQueue<Product> queue) {
    	while (queue.size() > 0) {// Loop through the products in the queue
            Product product = queue.dequeue();// Dequeue the product from the queue
            System.out.println(product.toString() +"\n");// Print the product details

    }

    }// End Main
}// End TestBowlingShopApp
