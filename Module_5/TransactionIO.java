/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by P. Gold 2023
 Nguyen, L. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

// Defining a public class named TransactionIO
public class TransactionIO {
    // Defining a private static final String constant named FILE_NAME with a value of "expenses.txt"
    private static final String FILE_NAME = "expenses.txt";
    // Defining a private static File variable named file that is initialized to a new File object with a name of FILE_NAME
    private static File file = new File(FILE_NAME);

    // Defining a public static method named bulkInsert that takes an ArrayList of Transaction objects as a parameter and throws an IOException
    public static void bulkInsert(ArrayList<Transaction> transactions) throws IOException {
        // Initializing a PrintWriter object named output to null
        PrintWriter output = null;
        // Checking if the file exists
        if (file.exists()) {
            // If the file exists, initialize the PrintWriter object named output to write to the existing file
            output = new PrintWriter(new FileOutputStream(new File(FILE_NAME), true));
        } else {
            // If the file does not exist, initialize the PrintWriter object named output to write to a new file with the name of FILE_NAME
            output = new PrintWriter(FILE_NAME);
        }
        // Looping through each Transaction object in the ArrayList named transactions
        for (Transaction tran : transactions) {
            // Writing the date, description, and amount of the current Transaction object to the PrintWriter object named output
            output.print(tran.getDate() + " ");
            output.print(tran.getDescription() + " ");
            output.print(tran.getAmount() + " ");
            output.println();
        }
        // Closing the PrintWriter object named output
        output.close();
    }

    // Defining a public static method named findAll that returns an ArrayList of Transaction objects and throws an IOException
    public static ArrayList<Transaction> findAll() throws IOException {
        // Initializing an ArrayList of Transaction objects named transactions
        ArrayList<Transaction> transactions = new ArrayList<>();
        // Initializing a Scanner object named input to read from the file
        Scanner input = new Scanner(file);
        // Looping through each line in the file
        while (input.hasNext()) {
            // Reading the next line of the file into a String variable named line
            String line = input.nextLine();
            // Splitting the line into an array of String tokens based on whitespace
            String[] tokens = line.split(" ");
            // Creating a new Transaction object using the date, description, and amount from the tokens array
            Transaction transaction = new Transaction(tokens[0], tokens[1], Double.parseDouble(tokens[2]));
            // Adding the new Transaction object to the transactions ArrayList
            transactions.add(transaction);
        }
        // Closing the Scanner object named input
        input.close();
        // Returning the transactions ArrayList
        return transactions;
    }
} // End TransactionIO
