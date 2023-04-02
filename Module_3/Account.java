/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
 Nguyen, L. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
// Create Account class
public class Account {
    
    // private data field to store the account balance
    private double balance = 200;
    
    // accessor method to get the balance
    public double getBalance() {
        return balance;
    }
    
    // method to deposit money into the account
    public void deposit(double amt) {
        balance += amt;
    }
    
    // method to withdraw money from the account
    public void withdraw(double amt) {
        if (balance >= amt) {
            balance -= amt;
        }
    }
    
    // method to display a menu for the account
    public void displayMenu() {
        System.out.println("\n  Account Menu");
        System.out.println("  Enter <D/d> for deposit");
        System.out.println("  Enter <W/w> for withdraw");
        System.out.println("  Enter <B/b> for balance");
    }
    
    // method to get the current transaction date in MM-dd-yyyy format
    public String getTransactionDate() {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        return date.format(formatter);
    }
}// end Account

