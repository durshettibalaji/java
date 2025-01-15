package src.Basics.Operators;

public class Assignment {
   public static void main(String[] args) {
    int a= 10;
    int b= 5;
     b = b+10;
     a += 10;
     System.out.println(a+"     "+b);
     //post increment 
    //  it will assign a value to c and then increase the value by 1
    int c = a++;
    System.out.println(c);
    // pree increament 
    // it will first increase the value by 1 and then assign it to d
    int d = ++b;
    System.out.println(d);
   // same way for decreament
    
   } 
}
