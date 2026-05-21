package src.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorInJava {
    public static void main(String[] args) {

        Comparator<Integer> compareLastNumber = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10)
                    return 1;
                else
                    return -1;
            }
        };

        Comparator<Integer> reverseOrder = (i, j) -> {
            if (i < j)
                return 1;
            else
                return -1;
        };

        Comparator<String> CompareString = (s1, s2) -> {
            if (s1.length() > s2.length())
                return 1;
            else
                return -1;
        };

        Comparator<Student123> compareByMarks = (s1, s2) -> {
            if (s1.marks < s2.marks)
                return 1;
            else
                return -1;
        };

        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("Durshetti");
        arr1.add("Balaji");
        arr1.add("Java");
        arr1.add("Comparator");
        Collections.sort(arr1, CompareString);
        System.out.println(arr1);

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(13);
        arr.add(21);
        arr.add(32);
        arr.add(44);
        arr.add(25);
        arr.add(16);
        arr.add(47);
        arr.add(38);
        Collections.sort(arr, compareLastNumber);
        System.out.println(arr);
        System.out.println();
        Collections.sort(arr, reverseOrder);
        System.out.println(arr);

        ArrayList<Student123> arr2 = new ArrayList<>();
        arr2.add(new Student123(23, "Durshetti", 89, 1));
        arr2.add(new Student123(24, "Balaji", 78, 4));
        arr2.add(new Student123(22, "Java", 90, 8));
        arr2.add(new Student123(21, "Comparator", 56, 3));
        for (Student123 s : arr2) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println();
        Collections.sort(arr2, compareByMarks);
        for (Student123 s : arr2) {
            System.out.println(s);
        }
        // System.out.println(arr2);
    }
}

class Student123 {
    int age;
    String name;
    int marks;
    int rollNo;

    public Student123(int age, String name, int marks, int rollNo) {
        this.age = age;
        this.name = name;
        this.marks = marks;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", rollNo=" + rollNo +
                '}';
    }
}