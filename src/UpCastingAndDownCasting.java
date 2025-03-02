package src;

public class UpCastingAndDownCasting {
    public static void main(String[] args) {
        // upCasting
        A obj = new B();
        obj.displayA();


        // down casting 
        B obj1 = (B) obj;
        obj1.displayB();
    }
}


class A{
    public void displayA(){
    System.out.println("in class A");
}

}

class B extends A{
    public void displayB(){
    System.out.println("in class B");
    }
}