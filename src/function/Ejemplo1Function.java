package function;


import java.util.function.Function;

public class Ejemplo1Function {
    public static void main(String[] args) {
        // Create a Function that converts a string to uppercase.
        Function<String, String> toUpper = str -> str.toUpperCase();
        String uppercaseString = toUpper.apply("hello");
        System.out.println("The uppercase string is " + uppercaseString);
    }
}
