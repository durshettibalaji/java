package src.collections.list;
import  java.util.LinkedList;


//LinkedList is a part of the Java Collection Framework and is present in the java.util package. It implements a doubly-linked list data structure where elements are not stored in contiguous memory. Each node contains three parts: the data, a reference to the next node, and a reference to the previous node
//
//Dynamic Size: LinkedList grows or shrinks dynamically at runtime.
//Maintains Insertion Order: Elements are stored in the order they are added.
//Allows Duplicates: Duplicate elements are allowed.
//Not Synchronized: By default, LinkedList is not thread-safe. To make Thread-safe use of Collections.synchronizedList().
//Efficient Insertion/Deletion: Adding or removing elements at the beginning or middle is faster compared to ArrayList.


public class LinkedListClass {
    public static void main(String args[])
    {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Geeks");
        ll.add("Geeks");
        ll.add(1, "For");

        // Using the Get method and the for loop
        for (int i = 0; i < ll.size(); i++) {

            System.out.print(ll.get(i) + " ");
        }

        System.out.println();

        // Using the for each loop
        for (String str : ll)
            System.out.print(str + " ");
    }
}
