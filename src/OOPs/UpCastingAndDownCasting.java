package src.OOPs;

public class UpCastingAndDownCasting {
    public static void main(String ar[]){
        Parent obj = new Child23(); // upcasting
        int a= obj.sum();
        System.out.println(a);

        Child23 obj2 = (Child23) obj; // downcasting
        int b = obj2.sum();
        System.out.println(b);
    }
    
}
