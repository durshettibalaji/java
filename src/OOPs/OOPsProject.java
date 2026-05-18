package src.OOPs;

public class OOPsProject {
    public static void main(String[] args) {
        System.out.println("Welcome to OOPs Project");
        StuMethods s1 = new Stu("A", 1, 20, 85, 90, 95);
        Stu s2 = new Stu("B", 2, 21, 75, 80, 85);
       System.out.println( s1.totalMarks()+"          :"+s2.totalMarks());
       System.out.println(s1.percentage());
       System.out.println(s1.grade());

    }
}

abstract class StuMethods {
    abstract int totalMarks();

    abstract float percentage();

    abstract String grade();

    abstract String passFail();
}

class Stu extends StuMethods {
    private String name;
    private int rollNo;
    private int age;
    private int subject1;
    private int subject2;
    private int subject3;

    Stu(){}

    Stu(String name, int rollNo, int age, int subject1, int subject2, int subject3) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    Stu(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getS1() {
        return subject1;
    }

    public void setS1(int s1) {
        this.subject1 = s1;
    }

    public int getS2() {
        return subject2;
    }

    public void setS2(int s2) {
        this.subject2 = s2;
    }

    public int getS3() {
        return subject3;
    }

    public void setS3(int s3) {
        this.subject3 = s3;
    }

    int totalMarks() {
        return subject1 + subject2 + subject3;
    }

    float percentage() {
        return (totalMarks() / 300.0f) * 100;
    }

    String grade() {
        float per = percentage();
        if (per >= 90) {
            return "A";
        } else if (per >= 80) {
            return "B";
        } else if (per >= 70) {
            return "C";
        } else if (per >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    String passFail() {
        return percentage() >= 35 ? "Pass" : "Fail";
    }

}
