/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
 Nguyen, L. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/
import java.util.ArrayList;
import java.util.List;
// Define a public class named MemComposerDao that implements the ComposerDao interface
public class MemComposerDao implements ComposerDao {
    private List<Composer> composers;
    // Define a constructor that initializes the list of composers with a few sample composers
    public MemComposerDao() {
        this.composers = new ArrayList<>();
        this.composers.add(new Composer(1007, "Ludwig van Beethoven", "Classical"));
        this.composers.add(new Composer(1008, "Johann Sebastian Bach", "Classical"));
        this.composers.add(new Composer(1009, "Wolfgang Amadeus Mozart", "Classical"));
        this.composers.add(new Composer(1010, "Johannes Brahms", "Classical"));
        this.composers.add(new Composer(1011, "Joseph Haydn", "Classical"));
    }
    // Override the findAll() method from the ComposerDao interface to return all composers in the list
    @Override
    public List<Composer> findAll() {
        return composers;
    }
    // Override the findBy() method from the ComposerDao interface to find a composer by their ID

    @Override
    public Composer findBy(Integer id) {
             // Loop through the list of composers and return the composer with the matching ID
        for (Composer c : composers) {
            if (c.getId() == id) {
                return c;
            }
        }
          // If no matching composer is found, return null
        return null;
    }
   // Override the insert() method from the ComposerDao interface to add a new composer to the list 
    @Override
    public void insert(Composer composer) {
        composers.add(composer);
    }
}//end MemcomposerDao
