package src.OOPs;

class Student{
    String name;
    int rollNo;
    Student(String name, float rollNo){
        setAge(38);
        name = name;
        rollNo = rollNo;
    }
    void setAge(int rollNo){
         rollNo = rollNo;
    }
}

public class BasicQuestions {
    public static void main(String[] args) {
        Student s1 = new Student("A",4);
        s1.setAge(15);
        System.out.println(s1.name);
        System.out.println(s1.rollNo);
    }
    
}
