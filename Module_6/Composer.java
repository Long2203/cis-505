/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
 Nguyen, L. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/
//create the class Composer
public class Composer {
    //private instance variables for the Composer class.
    private int id;
    private String name;
    private String genre;
    //initializes the instance variables to default values.
    public Composer() {
        this.id = 0;
        this.name = "";
        this.genre = "";
    }
    //parameters and initializes the instance variables to their respective values.
    public Composer(int id, String name, String genre) {
        this.id = id;
        this.name = name;
        this.genre = genre;
    }
    //returns the value of the id instance variable.
    public int getId() {
        return id;
    }
    //sets the value of the id instance variable to the value of the parameter passed in.
    public void setId(int id) {
        this.id = id;
    }
    //returns the value of the name instance variable.
    public String getName() {
        return name;
    }
    //sets the value of the name instance variable to the value of the parameter passed in.
    public void setName(String name) {
        this.name = name;
    }
    //returns the value of the genre instance variable.
    public String getGenre() {
        return genre;
    }
    //sets the value of the genre instance variable to the value of the parameter passed in.
    public void setGenre(String genre) {
        this.genre = genre;
    }
    //return a String representation of the Composer object.
    @Override
    public String toString() {
        return "  Id: " + id + "\n  Name: " + name + "\n  Genre: " + genre;
    }
}//end Composer
