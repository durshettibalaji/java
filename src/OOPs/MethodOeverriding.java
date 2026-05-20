package src.OOPs;

public class MethodOeverriding {
    public static void main(String ar[]){
        Child23 obj = new Child23();
        int a= obj.sum();
        System.out.println(a);
    }
}


class Child23 extends Parent{
    Child23(){
        System.out.println("object created");
    }
//    @Override
    int sum(){
        System.out.println("why i am not getting excutedb");
        return 10;
    }
}

class Parent {
    int sum(){
        return 20;
    }
}