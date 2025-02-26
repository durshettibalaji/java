package src.OOPs;

public class Constructor {
    public static void main(String[] args) {
    ConstructorHelper obj = new ConstructorHelper(10);

    }
    
}


class ConstructorHelper {
    int a;
    int b;
    public ConstructorHelper(int a) {
        this.a = a;
    }
}