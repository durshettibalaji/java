package src.Basics;

import java.util.ArrayList;

class Student{
    String name;
    int rollNo;
    int sub1 ;
    int sub2 ;
    int sub3 ;
    String grade;
    Student(String name, int rollNo, int sub1, int sub2, int sub3){
        this.name = name;
        this.rollNo = rollNo;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }
    private String CalculateGrade(){
        int totalMarks = getTotalMarks();
        if(totalMarks >= 270){
            return "A";
        } else if(totalMarks >= 240){
            return "B";
        } else if(totalMarks >= 210){
            return "C";
        } else {
            return "D";
        }
    }   
      int getTotalMarks(){
        return sub1 + sub2 + sub3;
    }
    public float getAverageMarks() {
        return getTotalMarks()/3;
    }
    public String getGrade() {
        return CalculateGrade();
    }
    public String failOrPass() {
       if(sub1 < 35 || sub2 < 35 || sub3 < 35){
        return "Fail";
       } else {
        return "Pass";
       }
    }
     
}

public class MiniProject {
    public static void main(String[] args) {
         ArrayList<Student> students = new ArrayList<>();
            Student s1 = new Student("A",1,90,80,70);
            Student s2 = new Student("B",2,85,75,65);
            students.add(s1);
            students.add(s2);
        //  for(Student s : students){
        //     System.out.print("Name: " + s.name);
        //     System.out.print("      Roll No: " + s.rollNo);
        //     System.out.print("      Subject 1 Marks: " + s.sub1);
        //     System.out.print("      Subject 2 Marks: " + s.sub2);
        //     System.out.print("      Subject 3 Marks: " + s.sub3);
        //     System.out.println();
        //  }
        System.out.println("Total Marks of " + s1.name + ": " + s1.getTotalMarks()+"      Average Marks: " + s1.getAverageMarks() + "      Grade: " + s1.getGrade()+"       failOrPass: " + s1.failOrPass());
    }
   
}
