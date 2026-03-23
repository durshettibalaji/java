package src.ErrorHandling;

public class ThrowsKeyWord {
    public static void main(String a[])
    {
        Class1 obj = new Class1();
        try{
        System.out.println(obj.method2());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}


class Class1{
    public int  method1() throws Exception{
        int a=10;
        int b=0;
        return a/b;
    }
    public int method2() throws Exception{
        int sum = 10 + method1();
        return sum;
    }
}