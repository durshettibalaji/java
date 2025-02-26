package src;

public class StaticThing {
    public static void main(String[] args) throws ClassNotFoundException {
        StaticVariable sv = new StaticVariable();
        StaticVariable.a=30;
        sv.b=15;
        sv.c=85;
        StaticVariable sv1 = new StaticVariable();
        StaticVariable.a=41;
        sv.b=45;
        sv.c=95;
        sv1.show();
        sv.show();
        
        StaticBlock s1 = new StaticBlock();
        // StaticBlock s2 = new StaticBlock();
        StaticBlock.staticMethod(s1);
        // Class.forName("StaticVariable");
    }
   
}

 class StaticVariable {

    static int a=10;
    int b=20;
    int c=30;
    void show(){
        System.out.println("a "+a+"  b "+b+" c "+c);
    }
}

class StaticBlock {
    int a;
    int b;
    static int c;
    static{
        c=100;
        System.out.println("in static block ");
    }
    StaticBlock(){
        a= 20;
        b=30;
        System.out.println("in constructor ");
    }


    // can not use not static variable in static method as they are part of object
    // static void staticMethod(){
    //     System.out.println(a+"   "+b+"     "+c);
    // } 



    static void staticMethod(StaticBlock obj){
        System.out.println(obj.a+"   "+obj.b+"     "+c);
    } 


}