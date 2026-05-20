package src.ErrorHandling;

public class ThrowsKeyWord {
    public static void main(String a[])
    {
        Class3 obj = new Class3();
        try{
        System.out.println(obj.method4());
        }
        catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println("still i am here");
    }
}


class Class1{
    public int  method1() {
        int a=10;
        int b=5;
        return a/b;
    }
    public int method2() {
        int sum = 10 + method1();
        return sum;
    }
}


class Class2 {
public int  method3() throws IndexOutOfBoundsException {   // we can declare the exception in the method signature using throws keyword
    Class1 obj = new Class1();
    int k = obj.method2()/0;
    return k;
}
}


class Class3  {
public int  method4() throws IndexOutOfBoundsException{   // we can declare the exception in the method signature using throws keyword
    Class2 obj = new Class2();
    return obj.method3();
}
}