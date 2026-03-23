package src.collections;

import java.util.TreeSet;

public class TreeSetInJava {
    public static void main(String[] args) {
        TreeSet<Integer> tr = new TreeSet<>();
        tr.add(10);
        tr.add(20);
        tr.add(15);
        tr.add(5);
        tr.add(30);
        tr.add(15);
        tr.add(35);
        tr.add(40);
        System.out.println(tr.add(15));
    }
}
