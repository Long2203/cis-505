/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by P. Gold 2023
 Nguyen, L. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//Define a class named Transaction
public class Transaction {
    private String date;
    private String description;
    private double amount;

 // Default constructor for Transaction
    public Transaction() {
        // Set the transaction date to today's date
        setDate(LocalDate.now().format(DateTimeFormatter.ofPattern("MM-dd-yyyy")));
        setDescription("");
        setAmount(0);
    }

    // Argument constructor for Transaction
    public Transaction(String date, String description, double amount) {
        // Set the date, description, and amount for the transaction
        setDate(date);
        setDescription(description);
        setAmount(amount);
    }

    // Accessor methods for Transaction
    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    // Mutator methods for Transaction
    public void setDate(String date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Override toString method for Transaction
    @Override
    public String toString() {
        // Return a string representation of the transaction
        return String.format("\n  Date: " + getDate() +
                "\n  Description: " + getDescription() +
                "\n  Amount: $%,6.2f", getAmount());
    } 
} //End Transaction
