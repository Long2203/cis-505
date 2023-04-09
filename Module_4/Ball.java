/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
 Nguyen, L. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/
// Create Ball class extends the Product class
public class Ball extends Product {

// Declare a private String field to represent the color of the ball
private String color;

// This is a no-argument constructor that calls another constructor with default values
public Ball() {
this("", "", 0, "");
}
//  initializes the Ball with the specified values
public Ball(String code, String description, double price, String color) {
    super(code, description, price);
    this.color = color;
}
// returns the color of the ball
public String getColor() {
return color;
}
// sets the color of the ball to the specified value
public void setColor(String color) {
this.color = color;
}

 // Override the toString() for the Product class to include the color of the ball
@Override
public String toString() {
return super.toString() + "\n  Color: " + color;
}
} //End Ball