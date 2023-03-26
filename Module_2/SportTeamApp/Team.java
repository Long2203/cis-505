/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
 Nguyen, L. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/
// This class represents a sports team.
public class Team {
// Private data fields to store the team name, players, and player count.
	private String teamName;
	private String[] players = new String[20];
	private int playerCount;
	// Constructor that initializes the team name.
	public Team(String teamName) {
	    this.teamName = teamName;
	}
	
	// Method to add a player to the team and increment the player count.
	public void addPlayer(String playerName) {
	    players[playerCount] = playerName;
	    playerCount++;
	}
	
	// Method to get the players on the team.
	public String[] getPlayers() {
	    // Create a new string array of size playerCount to store the players.
	    String[] result = new String[playerCount];
	    // Loop through the players array and add each player to the result array.
	    for (int i = 0; i < playerCount; i++) {
	        result[i] = players[i];
	    }
	    // Return the result array.
	    return result;
	}
	
	// Method to get the player count on the team.
	public int getPlayerCount() {
	    return playerCount;
	}
	
	// Method to get the team name.
	public String getTeamName() {
	    return teamName;
	}

}
