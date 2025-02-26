package src.OOPs;

public class Inheritance {
    public static void main(String[] args) {
        // B obj = new B(10,20);
        AdvCalc obj = new AdvCalc();
       System.out.println( obj.add(10,20));

    }
}


class A {
A(){
    System.out.println("A");
}
A(int n){
    System.out.println("A int");
}
}


class B extends A{
B(){
    this(10);
    System.out.println("B");
}
B(int n){
    // super();
    // this(10,20);
    System.out.println("int B");
}
B(int a,int b){
    this();
    System.out.println("int    int   B");
}
}



 
class AdvCalc extends Calc{
   int  multiply(int a,int b){
        return a*b;
    }

}