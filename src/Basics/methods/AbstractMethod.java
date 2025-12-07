package src.Basics.methods;

public class AbstractMethod extends  class1 {
    @Override
    void method1() {
        System.out.println("method 1");
    }
     int sum(){
        System.out.println("sum method ");
        return  1;
    }
    public static void main(String[] args){
        AbstractMethod ab =new AbstractMethod();
        ab.sum();
        System.out.println(ab.mul());
    }
}

abstract  class class1 {
 abstract  void method1();
 abstract  int sum();
 int mul(){
     return 20;
 }

}
