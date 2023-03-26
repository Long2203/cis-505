/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
 Nguyen, L. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/

// Import the Scanner class to allow user input
import java.util.Scanner;
//Class TestSportsTeamApp contains the main method to run the program
public class TestSportsTeamApp {
	public static void main(String[] args) {
	//Creating a new instance of the Scanner class to receive input from the user
	Scanner scanner = new Scanner(System.in);
	//Initializing the continueProgram variable to "y" to start the program
	String continueProgram = "y";
	// Printing a welcome message to the console
	System.out.println("  Welcome to the Sports Team App");
	//Running the program until the user decides to exit
	while (continueProgram.equalsIgnoreCase("y")) {
	    // Prompting the user to enter a team name and receiving input
	    System.out.print("\n  Enter a team name: ");
	    String teamName = scanner.nextLine();
	
	    // Prompting the user to enter player names separated by commas and receiving input
	    System.out.print("\n  Enter the player names \n"
	    		+ "    hint: use commas for multiple playersl no spaces>:");
	    String playerNames = scanner.nextLine();
	    // Splitting the player names string into an array of individual player names
	    String[] players = playerNames.split(",");
	
	    // Creating a new instance of the Team class with the given team name
	    Team team = new Team(teamName);
	    // Adding each player in the players array to the team using the addPlayer method
	    for (String player : players) {
	        team.addPlayer(player);
	    }
	
	    // Printing a summary of the team to the console, including the number of players and their names
	    System.out.println("\n  --Team Summary--");
	    System.out.println("  Number of players in team: " + team.getPlayerCount());
	    System.out.print("  Players on team: ");
	    for (String player : team.getPlayers()) {
	        if (player != null) {
	            System.out.print(player + ",");
	        }
	    }
	    System.out.println();
	
	    // Prompting the user to continue or exit the program
	    System.out.print("\n  Continue? (y/n): ");
	    continueProgram = scanner.nextLine();
	}
	
	// Printing a message indicating the end of the program and closing the scanner
	System.out.println("\n  End of line...");
	scanner.close();
	}
}
