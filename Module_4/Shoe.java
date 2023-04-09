/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
 Nguyen, L. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/
//Create Shoes class with no parameters
public class Shoe extends Product {

private double size;

//  default values
public Shoe() {
    this("", "", 0, 0);
}
// the constructor for the Shoe class with four parameters
public Shoe(String code, String description, double price, double size) {
    super(code, description, price);
    this.size = size;
}
// returns the value of the size field of the Shoe object
public double getSize() {
return size;
}
//  sets the value of the size field of the Shoe object
/**
 * @param size
 */
public void setSize(double size) {
    this.size = size;  }
    
// This method overrides the toString() to add the size of the Shoe object
@Override
public String toString() {
return super.toString() + "\n  Size: " + size;
}
}// End Shoe