package src.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSort {
    public static void main(String[] args) {
        Student s = new Student();
        s.sort();
    }
}

class Student{
    void sort(){
        List<Integer> s = new ArrayList<>();
        s.add(34);
        s.add(23);
        s.add(56);
        s.add(12);
        s.add(89);
        System.out.println("normal list "+s);
        Collections.sort(s);
        System.out.println("sorted list "+s);
    }
}