/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
 Nguyen, L. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/
import java.util.Scanner;
// Create TestCustomerAccountApp
public class TestCustomerAccountApp {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Account account = new Account(); // create an Account object
        Customer customer; // declare a Customer variable
        System.out.println("  Welcome to Customer Account App");
        
        // prompt the user to enter a customer number
        System.out.print("\n  Enter a customer ID:\n    ex: 1007, 1008, 1009>: ");
        int customerId = input.nextInt();
        
        // get the customer using the CustomerDB class
        customer = CustomerDB.getCustomer(customerId);
        
       char choice;
        do {
              // display the account menu
            account.displayMenu();
            // prompt the user to select an option
            System.out.print("    Enter an option>: ");
            choice = Character.toLowerCase(input.next().charAt(0));
            
            switch (choice) {
                case 'd':
                    // deposit money into the account
                    System.out.print("\n  Enter deposit amount: ");
                    double depositAmt = input.nextDouble();
                    account.deposit(depositAmt);
                    break;
                case 'w':
                    // withdraw money from the account
                    System.out.print("\n  Enter withdraw amount: ");
                    double withdrawAmt = input.nextDouble();
                    account.withdraw(withdrawAmt);
                    break;
                case 'b':
                    // display the account balance
                    System.out.printf("\n  Account balance: $%,6.2f", account.getBalance());
                    break;
                default:
                    // invalid option
                    System.out.println("\n  Error: Invalid Option.");
                    break;
            } 
            
            // prompt the user to continue or exit the menu
            System.out.print("\n  Continue? (y/n): ");
            choice = Character.toLowerCase(input.next().charAt(0));
            
        } while (choice != 'n');
        
        // display the customer's details and account balance
        System.out.println(customer.toString());
        System.out.printf("\n  Balance as of "+account.getTransactionDate()+" is: $%,6.2f", account.getBalance());
        System.out.println("\n\n  End of line...");
        input.close(); // close the scanner
    }// end Main
}// end TestCustomerAccountApp
