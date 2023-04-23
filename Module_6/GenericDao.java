/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
 Nguyen, L. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/
import java.util.List;
// declares a public interface named "GenericDao" with two generic type parameters, E and K.
public interface GenericDao<E, K> {
    //returns a List of all entities of type E in the database.
    List<E> findAll();
    //returns an entity of type E from the database with a primary key value of type K.
    E findBy(K key);
    //inserts an entity of type E into the database.
    void insert(E entity);
}//end GenericDao
