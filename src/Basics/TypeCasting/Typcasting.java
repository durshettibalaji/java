package src.Basics.TypeCasting;

public class Typcasting {
   static void implicitTypeCasting(){
        int num = 10;
        double d = num; // implicit type casting
        System.out.println(d);
    }

   static  void explicitTypeCasting(){
        double d = 10.5;
        int num = (int) d; // explicit type casting
        System.out.println(num);
     }

    static void typeCastingWithObjects(){
        Object obj = "Hello"; // implicit type casting
        String str = (String) obj; // explicit type casting
        System.out.println(str);
     }

    static void typeCastingWithWrapperClasses(){
        Integer num = 10; // implicit type casting
        int n = num; // unboxing
        System.out.println(n);
     }
    public static void main(String[] args) {
       implicitTypeCasting();
       typeCastingWithObjects();
    }
}


