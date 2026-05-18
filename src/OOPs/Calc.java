package src.OOPs;

public class Calc {
    public static void main(String[] args) {
CalculatorMethods cal = new CalculatorMethods();
cal.add(10, 20);
cal.sub(10, 20);
cal.mul(10, 20);    
cal.div(10, 20);
    }
}

class CalculatorMethods {
    public static void add(int a, int b) {
        System.out.println("The sum of " + a + " and " + b + " is " + (a + b));
    }

    public static void sub(int a, int b) {
        System.out.println("The difference of " + a + " and " + b + " is " + (a - b));
    }

    public static void mul(int a, int b) {
        System.out.println("The product of " + a + " and " + b + " is " + (a * b));
    }

    public static void div(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed");
            return;
        }
        System.out.println("The quotient of " + a + " and " + b + " is " + (a / b));
    }
}
