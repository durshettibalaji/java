package src.OOPs;

public class Inheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.AB();
        // AdvCalc obj = new AdvCalc();
        // obj.add(10,20);

    }
}


class A {
    A(int n){
    System.out.println("A int");
}
A(){
    System.out.println("A");
}

void AB(){
    System.out.println("i am in A");
}
}

class B extends A{
   void AB(){
        System.out.println("i am in B modifying A");
    }
B(){
    // this(10);
    System.out.println("B");
}
B(int n){
    // super();
    // this(10,20);
    System.out.println("int B");
}
B(int a,int b){
    // this();
    System.out.println("int    int   B");
}
}



 
class AdvCalc extends CalculatorMethods{
   int  multiply(int a,int b){
        return a*b;
    }

}