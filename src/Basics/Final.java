package src.Basics;

public class Final {
    
}


class FinalVariable {
    final int a = 10;
    void changeA(){
    // a = 20;   can not assign any value to the final variable 
    }
}

class FinalMethodA {
    final void display() {
        System.out.println("Hello, I am final method");
    }
}

class FinalMethodB extends FinalMethodA {
    // void display(){                           can not override the final method 
    //     System.out.println("Hello, I am overridden method");
    // }
}

final class FinalClassA {

}

// class FinalClassB extends FinalClassA {                  can not extend the final class
// }