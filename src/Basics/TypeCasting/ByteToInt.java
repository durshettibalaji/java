package src.Basics.TypeCasting;

public class ByteToInt {
    public static void main(String[] args) {
        // it will do modulo with 256
        // if value is less than 256 and greater than 127 it will give  ( value - 256 )
        // if lessthan 128 it will give that value 
        int b = 128;
        byte a = 12;
        a = (byte)b;
        System.out.println(a);
    }

}
