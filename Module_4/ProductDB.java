/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
 Nguyen, L. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/
// Create ProductDB class 
public class ProductDB {
    // This method returns a GenericQueue object containing products with a specified code
    public static GenericQueue<Product> getProducts(String code) {
        // Create a new GenericQueue of Product objects.
        GenericQueue<Product> products = new GenericQueue<>();
        // Check if the code parameter equals "b".
        if (code.equalsIgnoreCase("b")) {
            // If true, create a new Ball object and set its properties.
            Ball ball1 = new Ball();
            ball1.setCode("B500");
            ball1.setDescription("Phaze III");
            ball1.setPrice(154.99);
            ball1.setColor("Purple and Green");
            // Add the Ball object to the products queue.
            products.enqueue(ball1);
            // Repeat the above process for four more Ball objects.
            Ball ball2 = new Ball();
            ball2.setCode("B400");
            ball2.setDescription("Force Unleashed");
            ball2.setPrice(139.99);
            ball2.setColor("Red and White");
            // Add the Ball object to the products queue.
            products.enqueue(ball2);
            // Repeat the above process for four more Ball objects.
            Ball ball3 = new Ball();
            ball3.setCode("B300");
            ball3.setDescription("Proton Physix");
            ball3.setPrice(174.95);
            ball3.setColor("Pink and Purple");
            // Add the Ball object to the products queue.
            products.enqueue(ball3);
            // Repeat the above process for four more Ball objects.
            Ball ball4 = new Ball();
            ball4.setCode("B200");
            ball4.setDescription("Axiom Pearl");
            ball4.setPrice(154.95);
            ball4.setColor("Blue and Red");
            // Add the Ball object to the products queue.
            products.enqueue(ball4);
            // Repeat the above process for four more Ball objects.
            Ball ball5 = new Ball();
            ball5.setCode("B100");
            ball5.setDescription("Black Widow 2.0");
            ball5.setPrice(144.95);
            ball5.setColor("Black and Red");
            // Add the Ball object to the products queue.
            products.enqueue(ball5);
            // Repeat the above process for four more Ball objects.
        
            // Check if the code parameter equals "s".
        } else if (code.equalsIgnoreCase("s")) {
             // If true, create a new Shoes object and set its properties.
            Shoe shoe1 = new Shoe();
            shoe1.setCode("S500");
            shoe1.setDescription("Youth Skull Green/Black");
            shoe1.setPrice(39.99);
            shoe1.setSize(3.0);
            // Add the Shoes object to the products queue.
            products.enqueue(shoe1);
            // Repeat the above process for four more Shoes objects.
            Shoe shoe2 = new Shoe();
            shoe2.setCode("S400");
            shoe2.setDescription("Men's Tribal White");
            shoe2.setPrice(26.99);
            shoe2.setSize(8.5);
            // Add the Shoes object to the products queue.
            products.enqueue(shoe2);
            // Repeat the above process for four more Shoes objects.
            Shoe shoe3 = new Shoe();
            shoe3.setCode("S300");
            shoe3.setDescription("Women's Path Lite Seamless Mesh");
            shoe3.setPrice(54.99);
            shoe3.setSize(6.0);
            // Add the Shoes object to the products queue.
            products.enqueue(shoe3);
            // Repeat the above process for four more Shoes objects.
            Shoe shoe4 = new Shoe();
            shoe4.setCode("S200");
            shoe4.setDescription("Women's Rise Black/Hot Pink");
            shoe4.setPrice(39.99);
            shoe4.setSize(7.0);
            // Add the Shoes object to the products queue.
            products.enqueue(shoe4);
            // Repeat the above process for four more Shoes objects.
            Shoe shoe5 = new Shoe();
            shoe5.setCode("S100");
            shoe5.setDescription("Men's Ram Black");
            shoe5.setPrice(39.99);
            shoe5.setSize(10.5);
            // Add the Shoes object to the products queue.
            products.enqueue(shoe5);
            // Repeat the above process for four more Shoes objects.

        // Check if the code parameter equals "a".
        }else if (code.equalsIgnoreCase("a")) {
            // If true, create a new Bag object and set its properties.
            Bag bag1 = new Bag();
            bag1.setCode("A300");
            bag1.setDescription("Silver/Royal Blue");
            bag1.setPrice(74.99);
            bag1.setType("Triple");
             // Add the Bag object to the products queue.
            products.enqueue(bag1);
            // Repeat the above process for four more Bag objects.
            Bag bag2 = new Bag();
            bag2.setCode("A200");
            bag2.setDescription("Prime Roller Black/Royal Blue");
            bag2.setPrice(54.99);
            bag2.setType("Double");
             // Add the Bag object to the products queue.
            products.enqueue(bag2);
            // Repeat the above process for four more Bag objects.
            Bag bag3 = new Bag();
            bag3.setCode("A100");
            bag3.setDescription("Path Pro Deluxe");
            bag3.setPrice(34.99);
            bag3.setType("Single");
             // Add the Bag object to the products queue.
            products.enqueue(bag3);
            // Repeat the above process for four more Bag objects.
        }

        return products;

} 
} //End ProductDB