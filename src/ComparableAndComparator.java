package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//in comparable we will impliments the comparable interface and override comparaTo function add we will give logic in compareTo function

//in comparator we will create a new classs and use them according ly

public class ComparableAndComparator {
    public static void  main(String[] args){
        ArrayList<Student> listOfStudents =  new ArrayList<>();
        listOfStudents.add(new Student(21,1,"abc"));
        listOfStudents.add(new Student(26,3,"bcgd"));
        listOfStudents.add(new Student(28,2,"wsed"));
        Collections.sort(listOfStudents);
        for(Student student:listOfStudents)
        {
            System.out.print("RollNo of Student = "+student.rollNo+"    ");
            System.out.print("Age of Student = "+student.age+"    ");
            System.out.print("Name of Student = "+student.name+"    ");
        }
        Collections.sort(listOfStudents,new asscendingRollNo());
        System.out.println("\n\n\n");
        for(Student student:listOfStudents)
        {
            System.out.print("RollNo of Student = "+student.rollNo+"    ");
            System.out.print("Age of Student = "+student.age+"    ");
            System.out.print("Name of Student = "+student.name+"    ");
        }

        Collections.sort(listOfStudents,new decendingRollNo());
        System.out.println("\n\n\n");
        for(Student student:listOfStudents)
        {
            System.out.print("RollNo of Student = "+student.rollNo+"    ");
            System.out.print("Age of Student = "+student.age+"    ");
            System.out.print("Name of Student = "+student.name+"    ");
        }


    }
}
class Student implements  Comparable<Student>{
    public  int age;
    public  int rollNo;
    public  String name;


    Student(int age,int rollNo,String name){
        this.age=age;
        this.rollNo=rollNo;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        if(this.rollNo< o.rollNo)
            return -1;
        return 0;
    }
}


class asscendingRollNo implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.rollNo< o2.rollNo)
            return -1;
        if(o1.rollNo< o2.rollNo)
            return 1;
        return 0;
    }
}

class decendingRollNo implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.rollNo< o2.rollNo)
            return 1;
        if(o1.rollNo< o2.rollNo)
            return -1;
        return 0;
    }
}