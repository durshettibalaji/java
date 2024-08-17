package General.Variable;

final class cal {

    public void show() {
        System.out.println(" final class can not be inherited ");
    }
}

class FinalMethod {

    final void show() {
        System.out.println("final method can not be override");
    }
}

// public class Final extends cal {  
// }
class Final extends FinalMethod {
    // publc void show(){            can not override final method

    // }
    public static void main(String[] args) {
        final int a = 30;
        // a++;     can not change the value of final variable
        System.out.println(a);
    }

}
