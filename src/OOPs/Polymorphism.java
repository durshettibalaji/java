package src.OOPs;

public class Polymorphism {
    public static void main(String[] args) {
    Overloading obj1= new Overloading();
    obj1.function1();
    obj1.function1(10,20, 0);
    obj1.function1(10,20);

    Child c= new Child(); 
    c.show();

    }
}


class Overloading {
    void function1(int n ,int m){
        System.out.println("function1 with 2 parameters ");
    }
    void function1(int n ,int m ,int p){
        System.out.println("function1 with 3 parameters ");
    }
   public void function1(){
        System.out.println("function1 with no parameters ");
    }
}


class Parent {
void show(){
    System.out.println("Parent class");
}
}

class Child extends Parent {
  void show(){                            // child show is overriding the parent show 
    System.out.println("Inside child");
}
}