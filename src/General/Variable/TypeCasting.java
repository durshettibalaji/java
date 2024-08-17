package General.Variable;

public class TypeCasting {

    public void implistConversion() {
        int a = 200;
        long b = a;
        System.out.println("int to long " + b);
    }

    public void ExplisitConversion() {
        long a = 280;
        byte b = (byte) a;
        int c = (int) a;
        System.out.println("long to byte :" + b);
        System.out.println("long to int :-" + c);
    }

    public static void main(String[] args) {
        TypeCasting abc = new TypeCasting();
        abc.implistConversion();
        abc.ExplisitConversion();
    }

}
