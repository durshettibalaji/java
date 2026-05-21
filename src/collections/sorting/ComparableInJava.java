package src.collections.sorting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class ComparableInJava {
    public static void main(String[] args) {
        ArrayList<Student1> arr = new ArrayList<>();
        arr.add(new Student1("A", 30));
        arr.add(new Student1("B", 25)); 
        arr.add(new Student1("D", 28));
        arr.add(new Student1("C", 22));
        System.out.println("before sorting");
        for(Student1 s: arr){
            System.out.println(s.name+" "+s.age);
        }
        Collections.sort(arr);
        System.out.println("after sorting");
        for(Student1 s: arr){
            System.out.println(s.name+" "+s.age);
        }

    }
}

class Student1 implements Comparable<Student1>{
    String name;
    int age;

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student1 obj) {
        return this.age - obj.age;
    }

}
