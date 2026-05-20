package src.ErrorHandling;

public class ThrowKeyWord {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=0;
        try{
             c=a/b;
        if(a<b){
            c= 1;
            throw  new CustomException("a should be greater than b");
        }
        // if(a>b){
        //     throw  new ArithmeticException("a should be less than b");
        // }
        
    }
    catch(ArithmeticException e){
        System.out.println("should not be divisible by 0  :"+e.getMessage());
    }
    catch(CustomException e){
        System.out.println(e);
    }
    catch(Exception e){
        System.out.println(e);
    }
    System.out.println(c);
    
    }
}


class CustomException extends Exception{
    public CustomException(String str){
        super(str);
    }
}

// class ArithmeticException extends Exception{
//     public ArithmeticException(String str){
//         super(str);
//     }
// }

