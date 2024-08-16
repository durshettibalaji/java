package General.Variable;
public class PrimitiveVariables {
    public static void main(String[] args) {
        int age = 231;  // (type of variable) (variable name) = (value of variable)
        int readableInt = 234_576; // we can use undersqore to increase the readability 
        // long longVar = 23456789566;                we should add l after the number or else it will consider the number as integer
        long longVar = 23456789566l;
        float floatVar = 2.45f;   // we nee to add f after the number so it consider it as float 
        char character = 'a';  // char stores the character
        boolean boolVar = true;  // boolean value can be true or flase

        System.out.println(age);
        System.out.println(readableInt);
        System.out.println(longVar);
        System.out.println(floatVar);
        System.out.println(character);
        System.out.println(boolVar);

    }
    
}
