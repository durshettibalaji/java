package src.collections.set;
import  java.util.HashSet;
import  java.util.Iterator;


//HashSet in Java implements the Set interface of the Collections Framework. It is used to store the unique elements, and it doesn't maintain any specific order of elements.
//
//HashSet does not allow duplicate elements.
//Uses HashMap internally which is an implementation of hash table data structure.
//Also implements Serializable and Cloneable interfaces.
//HashSet is not thread-safe. To make it thread-safe, synchronization is needed externally.


//Capacity of HashSet
//Capacity refers to the number of buckets in the hash table. The default capacity of a HashSet is 16 and the load factor is 0.75.
//
//When the number of elements exceeds the capacity automatically increases (resizes) to maintain performance.
//
//        new capacity = old capacity × 2
//
//Load Factor
//Load Factor is a measure that controls how full the HashSet can get before resizing. Default Load Factor = 0.75. If the number of elements exceeds the threshold, the capacity is doubled.
//
//        Threshold = capacity × load factor


public class HashsetClass {
    public static void main(String[] args)
    {

        HashSet<String> hs = new HashSet<String>();

        // Adding elements to above Set using add() method
        hs.add("Geek");
        hs.add("For");
        hs.add("Geeks");
        hs.add("A");
        hs.add("A");
        hs.add("B");
        hs.add("Z");

        HashSet<String> abc =  new HashSet<>(hs);
        System.out.println("HashSet abc : " + abc);
        System.out.println("HashSet : " + hs);

        // Removing the element B
        hs.remove("B");

        // Printing the updated HashSet elements
        System.out.println("HashSet after removing element : " + hs);

        // Returns false if the element is not present
        System.out.println("B exists in Set : " + hs.remove("B"));

        System.out.print("Using iterator : ");
        Iterator<String> iterator = hs.iterator();

        // Traversing HashSet
        while (iterator.hasNext())
            System.out.print(iterator.next() + ", ");

        System.out.println();

        // Using enhanced for loop to iterate Over the HashSet
        System.out.print("Using enhanced for loop : ");
        for (String element : hs)
            System.out.print(element + " , ");
    }
}
