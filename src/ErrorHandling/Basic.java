package src.ErrorHandling;

public class Basic {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int[] arr = new int[4];
        try{
            int k = arr[5];
            int c=a/b;    //if value of b is zero we will get an exception and go to catch block 
            System.out.println("value of c is :"+c+"   "+k);
        }
        catch(ArithmeticException e){  // it will only enter for Arthmetic exceptions
            System.out.println("Arithmetic Exception Occured");
        }
        catch(ArrayIndexOutOfBoundsException e){  // it will enter only for index out of range exceptions
            System.out.println("Array Index Out of Bounds Exception Occured");
        }
        catch(Exception e){  // this is for all exceptions 
            System.out.println(e+"\nmessage :"+e.getMessage());
        }
    }
}
