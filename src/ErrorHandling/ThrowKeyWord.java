package src.ErrorHandling;

public class ThrowKeyWord {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try{
            int c=a/b;
        if(a<b){
            throw  new CustomException("a should be greater than b");
        }
    }
    catch(ArithmeticException e){
        System.out.println("denominator should not be 0");
    }
    catch(CustomException e){
        System.out.println(e);
    }
    catch(Exception e){
        System.out.println(e);
    }
    }
}


class CustomException extends Exception{
    public CustomException(String str){
        super(str);
    }
}
