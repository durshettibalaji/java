package src.Basics.methods;

public class variableParameters {
    static int add(int... numbers){
        int i=0;
        for(int num : numbers)
            System.out.print(num+" ");
        System.out.println();
        return i;
    }
    public static void main(String[] at){
        add(1,2,3,4,5,6,7);
        add(1,2,3);
        add(4,58,56);
    }
}
