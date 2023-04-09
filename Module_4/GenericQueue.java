/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
 Nguyen, L. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/
import java.util.LinkedList;
// Create Genericqueue generic queue that can hold elements of any type E
public class GenericQueue<E> {
    // Declare a LinkedList object to store the elements in the queue
    private LinkedList<E> list = new LinkedList<>();
     //adds the specified element to the front of the queue
    public void enqueue(E item) {
        list.addFirst(item);
    }
// removes and returns the element at the back of the queue
    public E dequeue() {
        return list.removeLast();
    }
//  returns the number of elements in the queue
    public int size() {
        return list.size();
    }
}
