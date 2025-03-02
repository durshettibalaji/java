package src.String;

public class LamdaExpressions {
    public static void main(String[] args) {
        A obj = () -> System.out.println("hi i am using lamda expression ");
        obj.display();
    }
}


interface A {
    void display();
}