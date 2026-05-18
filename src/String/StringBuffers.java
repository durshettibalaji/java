package src.String;

public class StringBuffers {
    public static void main(String[] args) {
        // StringBuffer is a class in Java that is used to create a mutable sequence of characters.
        String   st = "balaji";
        // System.out.println();
        StringBuffer str = new StringBuffer(st);
        System.out.println(str.capacity());
        str.append(" hey  how are how is your day how life is going on ");
         System.out.println(str.capacity());
        st = str.toString();
        str.append(2000);
        System.out.println(str.capacity());
        System.out.println(st);
    }
}
