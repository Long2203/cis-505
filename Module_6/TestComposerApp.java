/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
 Nguyen, L. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/
import java.util.Scanner;
//Create a public class named "TestComposerApp"
public class TestComposerApp {
    //creates an instance of the MemComposerDao class and assigns it to the composerDao variable.
    private static MemComposerDao composerDao = new MemComposerDao();
    //declares the main method which takes an array of Strings as its parameter.
    public static void main(String[] args) {
        //creates a Scanner object to read input from the console.
        Scanner input = new Scanner(System.in);
        //option variable to 0
        int option = 0;
        //prints a welcome message to the console.
        System.out.println("  Welcome to the Composer App");
        //creates a loop that will continue until the user chooses to exit.
        while (option != 4) {
            System.out.println("\n  MENU OPTIONS"); //prints the menu message to the console.
            System.out.println("    1. View Composers");//print the view composers message to the console.
            System.out.println("    2. Find Composer");//print Find Composer message to the console.
            System.out.println("    3. Add Composer");//print Add Composer message to the console.
            System.out.println("    4. Exit");//print Exit message to the console.
            System.out.print("\n  Please choose an option: ");//print Please choose an optionmessage to the console.
            option = input.nextInt();
            input.nextLine(); // consume the newline character
            //switch statement to perform an action based on the user's chosen option.
            switch (option) {
                case 1:
                    listComposers();
                    break;
                case 2:
                    findComposerById(input);
                    break;
                case 3:
                    addNewComposer(input);
                    break;
                case 4:
                    System.out.println("Goodbye!"); //prints the Goodbye! message to the console.
                    break;
                default:
                    System.out.println("Invalid option, please try again.");// prints the Invalid option, please try again message to the console.
                    break;
                    break;
            }
        }
    }
    //declares a private method named "listComposers".
    private static void listComposers() {
        //prints the DISPLAYING COMPOSERS message to the console.
        System.out.println("\n  --DISPLAYING COMPOSERS--");
        //iterate over the list of composers returned by the findAll method of the composerDao object, and prints each composer to the console.
        for (Composer composer : composerDao.findAll()) {
            System.out.println(composer +"\n");
        }
    }
    //declares a private method named findComposerById which takes a Scanner object as its parameter.
    private static void findComposerById(Scanner input) {
        //prompts the user to enter an id.
        System.out.print("\n  Enter an id: "); //prints the enter an Id mesasge.
        int id = input.nextInt();
        //checks if the composer variable is null, and prints a message to the console if it is.
        Composer composer = composerDao.findBy(id);
        if (composer == null) {
            System.out.println("Composer not found.");//prints Composer not found mesasge.
        } else {
        	System.out.println("\n  --DISPLAYING COMPOSERS--");//prints DISPLAYING COMPOSERS mesasge.
            System.out.println(composer);
        }
    }
    //declares a private method named addNewComposer which takes a Scanner object as its parameter.
    private static void addNewComposer(Scanner input) {
    	System.out.print("\n  Enter an id: ");//prints Enter an id mesasge.
        String id = input.nextLine();
        System.out.print("  Enter a name: ");//prints Enter a name mesasge.
        String name = input.nextLine();
        System.out.print("  Enter a genre: ");//prints Enter a genre mesasge.
        String genre = input.nextLine();
        //checks the composer variable and enter by the user.
        Composer newComposer = new Composer(Integer.parseInt(id), name, genre);
        composerDao.insert(newComposer);
    }//end main
}//end TestComposerApp
