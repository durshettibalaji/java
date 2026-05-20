package src.ErrorHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Finally {
    public static void main(String[] args) {
        
        try{
        // GeneralExample ge = new GeneralExample();
        // ge.method1();
        TakingInput us = new TakingInput();
        us.takingInput();
         NewWayOfFinally nwf = new NewWayOfFinally();
         nwf.takingInput();
        }
        catch(Exception e){
            System.out.println(e);
    }
}
}


class TakingInput{
    void takingInput() throws IOException {
        int num=0;
        BufferedReader bf = null;
        try {
            InputStreamReader in = new InputStreamReader(System.in);
             bf = new BufferedReader(in);
            num = Integer.parseInt(bf.readLine());
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            bf.close();
            System.out.println("i will execute always   :" + num);
        }
    }
}


class NewWayOfFinally{
    void takingInput() throws IOException {
        int num=0;
        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            num = Integer.parseInt(bf.readLine());
            System.out.println(num);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}


class GeneralExample{
    void method1()  throws IOException {
        int a=10;
        int b=0;
        int c=9;
        try{
            c=a/b;
        }
        // catch(ArithmeticException e){
        //     System.out.println("should not be divisible by 0  :"+e.getMessage());
        // }
        finally{
            System.out.println("i will execute always   :" + c);
        }
    }
}