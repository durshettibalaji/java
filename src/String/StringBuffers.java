package src.String;

public class StringBuffers {
    public static void main(String[] args) {
        // StringBuffer is a class in Java that is used to create a mutable sequence of characters.
        String   st = "balaji";
        // System.out.println();
        StringBuffer str = new StringBuffer(st);
        str.append(" hey ");
        // System.out.println(str.capacity());
        st = str.toString();
        str.append(2);
        System.out.println(st);
    }
}
