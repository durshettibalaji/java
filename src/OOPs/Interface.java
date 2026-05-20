package src.OOPs;

public class Interface {
    public static void main(String[] args) {
        // Interface1 obj = new IntfaceClass();
        // obj.method3();                           // interface1 reference variable can only access method1 and method2
        Interface2 obj2 = new InterfaceClass();
        obj2.method1();
        // obj2.method6();                          // interface2 reference variable can only access method1, method2, method3 and method4
        InterfaceClass obj3 =  new InterfaceClass();
        obj3.method1();
        obj3.method6();      
        System.out.println(obj3.getClass().getInterfaces());                    // interface class reference variable can access all the methods of the class
    }
}

interface Interface1 {
  void method1();
  void method2();  
}

interface Interface2 extends Interface1 {
    void method3();
    void method4();
}

interface Interface3 {
    void method5();
    void method6();
}


class InterfaceClass implements  Interface2 , Interface3 {
    public void method1() {
        System.out.println("Method 1");
    }
    public void method2() {
        System.out.println("Method 2");
    }
    public void method3() {
        System.out.println("Method 3");
    }
    public void method4() {
        System.out.println("Method 4");
    }
    @Override
    public void method5() {
        System.out.println("Method 5");
    }
    @Override
    public void method6() {
        System.out.println("Method 6");
    }

}