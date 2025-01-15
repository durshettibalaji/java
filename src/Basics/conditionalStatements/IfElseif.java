package src.Basics.conditionalStatements;

public class IfElseif {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        if (a > b) {
            System.out.println("a is greater than b");
        } else if (a < b) {
            System.out.println("a is smaller than b");
        } else {
            System.out.println("a and b values are equal");
        }
    }
}