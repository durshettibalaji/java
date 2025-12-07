package src.solid_principles;

import java.util.HashSet;
import java.util.Set;

public class Student {
    private  String firstName;
    private  String lastName;
    private  String email;
    private  int rollNo;

    public Student(){
    }

    public Student(int a){
        this.rollNo = a;
        this.firstName ="a";
        this.lastName = "b";
    }

    public Student(String first,String last){
        this.firstName = first;
        this.lastName = last;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getRollNo(){
        return this.rollNo;
    }

    public String getLastName() {
        return lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static void main(){
        long start = System.currentTimeMillis();
        Student st1 = new Student();
        Student st2 = st1;      // (st1 and st2 have same hashcode )
        st1.setFirstName("balaji");
        st1.setLastName("Durshetti");
        st2.setFirstName("Balaji Balaji");
        System.out.println(st1);
        System.out.println(st2);

        Student student1 = new Student("one","two");
        Student student2 = new Student("one","two");
        System.out.println(student1.equals(student2));
        checkHashCode();
        System.out.println(System.currentTimeMillis()-start);
    }


    // if we not override the toString in will give hash code and class
    @Override
    public String toString(){
        return this.firstName+"   "+this.lastName+"    "+this.rollNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;                      // same object
        if (o == null || getClass() != o.getClass())     // null or different class
            return false;

        Student other = (Student) o;
        return this.firstName != null && this.firstName.equals(other.getFirstName()) && this.lastName.equals(other.getLastName()); //  && this.rollNo == other.getRollNo();
    }

    public  int hashCode(){
//        System.out.println(this.getRollNo() %10);
        return  this.getRollNo()%10;
    }


    private static  boolean checkHashCode() {
        Set<Student> hs = new HashSet<>();
//        Student a=new Student(i);
        for(int i=0;i<10000;i++){
            hs.add(new Student(i));
        }
        System.out.println(hs.size());
        System.out.println(hs);
        return  true;
    }
}
