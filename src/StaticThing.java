package src;

public class StaticThing {
    public static void main(String[] args) {
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