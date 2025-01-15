package src.Basics.TypeCasting;

public class IntAndFloat {
    public static void main(String[] args) {
        int i = 10;
        float f= 12f;
        System.out.println("before :"+"  int :"+i+"  float :"+f);
        f=i;
        System.out.println("float = int "+"  int :"+i+"  float :"+f);
        i = (int)f;
        System.out.println("int = (int)float "+"  int :"+i+"  float :"+f);
    }
}
