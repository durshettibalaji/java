package src.OOPs;

public class Lambda {
public static void main(String[] args) {
     
    // Lambda Expression
    LambdaInterface lambda = () -> System.out.println("This is a lambda expression");     // lambda expression is a short form of anonymous class that implements a functional interface
    lambda.method1();     // we can call the method of the functional interface using the lambda


    //Normal 
    LambdaInterface lambda2 = new LambdaInterface() {     // anonymous class that implements a functional interface
        @Override
        public void method1() {
            System.out.println("This is an anonymous class");
        }
    };
    lambda2.method1();     // we can call the method of the functional interface using the anonymous class

}    
}

@FunctionalInterface
interface LambdaInterface {
    void method1();
}

