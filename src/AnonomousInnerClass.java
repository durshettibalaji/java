package src;

public class AnonomousInnerClass {
    public static void main(String[] args) {
        Abc obj = new Abc() {
            void show() {
                System.out.println("in new show ");
            }
        };
        obj.show();

        Bcd obj1 = new Bcd() {
            void show() {
                System.out.println("object that modified the abstract class and abstract method and i am an Anonymous class ");
            }
        };
        obj1.show();
    }
}

class Abc {
    void show() {
        System.out.println("in class Ab");
    }
}

abstract class Bcd {
    abstract void show();
}