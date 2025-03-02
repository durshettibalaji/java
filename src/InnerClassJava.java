package src;

public class InnerClassJava {
    public static void main(String[] args) {
        Ab obj = new Ab();
        obj.outterShow();
        Ab.Bc in = new Ab().new Bc();
        in.show();


        Ab.Bc obj1 = obj.new Bc();
        obj1.show();
        // A.B obj = new A().new B();
    }
}

class Ab {
    public void outterShow(){
        System.out.println("Outer Class");
    }
    class Bc {
        public void show() {
            System.out.println("In a nested class method");
        }
    }
}

// class out {
//     class in {
//         public void show() {
//             System.out.println("In a nested class method");
//         }
//     }
// }
