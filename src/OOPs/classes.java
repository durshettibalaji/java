package src.OOPs;

class NewClass {
    int sum(int a, int b) {
        System.out.println("in new class and sum method " + (a + b));
        return a + b;
    }
}

public class classes {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        NewClass obj = new NewClass();
        int result = obj.sum(a, b);
        System.out.println(result);
    }
}
