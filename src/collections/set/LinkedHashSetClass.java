package src.collections.set;
import java.util.LinkedHashSet;
import java.util.Iterator;

//LinkedHashSet in Java implements the Set interface of the Collections Framework.
//
//It combines the functionalities of a HashSet with a doubly-linked list to maintain the insertion order of elements.
//LinkedHashSet stores unique elements only and allows a single null.
//        Implements Set, Cloneable and Serializable interfaces.



public class LinkedHashSetClass {
    public static void main(String[] args) {

        LinkedHashSet<String> lh = new LinkedHashSet<String>();

        lh.add("Geek");
        lh.add("For");
        lh.add("Geeks");
        lh.add("A");
        lh.add("B");
        lh.add("Z");

        Iterator itr = lh.iterator();

        while (itr.hasNext())
            System.out.print(itr.next() + ", ");

        System.out.println();

        for (String s : lh)
            System.out.print(s + ", ");
        System.out.println();
    }
}
