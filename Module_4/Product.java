/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
 Nguyen, L. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/
// Create Product Class
public class Product {
// Declare private fields to store the code, description, and price of the product
private String code;

private String description;

private double price;
// calls another constructor with default values
public Product() {
this("", "", 0);
}
// initializes the Product with the specified values
public Product(String code, String description, double price) {
    this.code = code;
    this.description = description;
    this.price = price;
}
//returns the code of the product
public String getCode() {
return code;
}
//sets the code of the product to the specified value
public void setCode(String code) {
this.code = code;
}
 // returns the description of the product
public String getDescription() {
return description;
}
// sets the description of the product to the specified value
public void setDescription(String description) {
this.description = description;
}
 // returns the price of the product
public double getPrice() {
return price;
}
// sets the price of the product to the specified value
public void setPrice(double price) {
this.price = price;
}

// Override the toString() to display the code, description, and price of the product
@Override

public String toString() {
    return String.format(  "  Product code:"+code +
    					 "\n  Description:"+description+
    					 "\n  Price: $%,6.2f", price);
}
} //End Product