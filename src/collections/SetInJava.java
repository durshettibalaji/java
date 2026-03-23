package src.collections;
import java.util.*;

public class SetInJava {
    public static void main(String[] args) {
        Set<Integer> ar = new HashSet<Integer>();
        ar.add(1);
        ar.add(2);
        ar.add(2);
        ar.add(5);
        System.out.println(ar);
    }
}
