package src.collections.set;
import  java.util.*;


//A TreeSet is a collection class that stores unique elements in a sorted order. It is part of java.util package that implements the SortedSet interface, and internally uses a Red-Black tree to maintain sorting.
//
//Does not allow duplicates and null values. From JDK 7 onward, inserting null throws NullPointerException.
//Implements the NavigableSet interface and provides navigation methods like higher(), lower(), ceiling() and floor().
//TreeSet is not synchronized. it must be synchronized using Collections.synchronizedSet().



public class TreeSetClass {
    public static void main(String[] args){

        // Creating an object of NavigableSet with reference
        // to TreeSet class
        NavigableSet<String> ts = new TreeSet<>();

        // Elements are added using add() method
        ts.add("Geek");
        ts.add("For");
        ts.add("Geeks");
        ts.add("A");
        ts.add("B");
        ts.add("Z");

        System.out.println("Initial TreeSet " + ts);

        // Removing a specific existing element inserted
        // above
        ts.remove("B");

        // Printing the updated TreeSet
        System.out.println("After removing element " + ts);

        // Now removing the first element using pollFirst()
        // method
        ts.pollFirst();

        // Again printing the updated TreeSet
        System.out.println("After removing first " + ts);

        // Removing the last element using pollLast() method
        ts.pollLast();

        System.out.println("After removing last " + ts);
    }
}
