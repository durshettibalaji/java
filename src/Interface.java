package src;

public class Interface {
    public static void main(String[] args) {
        // Interface1 obj= new Interface1();     same like the abstract class can not create the object for the interface
        Main obj = new Main();
        System.out.println(Interface1.age);
        obj.display(); // calling the method of interface

        NeedOfInterface devaApp = new NeedOfInterface();
        devaApp.appDev();
    }
}

class Main implements Interface1,Interface2{
    public void methodFrom2() {
        System.out.println("in methodFrom2 method");
    }
    public void display() {
        System.out.println("in display method");

    }
    public void add() {
        System.out.println("in add method");
    }

}

class InterfaceExtends implements Ax{
    public void display() {
        System.out.println("i am in extened interface method ,  display");
    }
    public void add() {
        System.out.println("i am in extened interface method , add");
    }

}
interface Interface1{
    int age =10; // age is final and static , we can not change the age value 
    void display();  // display is abstrac method and dont have the statement 
    void add();
}

interface Interface2{
    int age=30;
    void methodFrom2();
}

interface Ax extends Interface1 {

}


class NeedOfInterface {

    interface Computer  {
        void show();
    }
    class Devloper 
    {
        public void work(Computer com){
            com.show();
        }
    }
    class Laptop implements Computer{
        public void show() {
        System.out.println("i am using laptop to code ");
        }
    }

    class Desktop implements Computer{
        public void show() {
        System.out.println("i am using Descktop to work");
        }
    }

    public void appDev(){
        Laptop lap = new Laptop();
        Desktop desk = new Desktop();
        Devloper dev = new Devloper();
        dev.work(desk);
        dev.work(lap);
        System.out.println(lap.getClass());
    }

}