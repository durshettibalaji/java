package src.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorInJava {
    public static void main(String[] args) {

        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i,Integer j){
                if(i%10 > j%10)
                return 1;
                else
                return -1;
            }
        };

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(13);
        arr.add(21);
        arr.add(32);
        Collections.sort(arr,com);
        System.out.println(arr);
    }
}
