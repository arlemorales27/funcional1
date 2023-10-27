package biFunction;

import java.util.function.BiFunction;

public class Ejemplo1BF {
    public static void main(String[] args) {
        // Create a BiFunction that adds two numbers together.
        BiFunction<Integer, Integer, Integer> addNumbers = (a, b) -> a + b;

        int sum = addNumbers.apply(10, 20);
        System.out.println("The sum of 10 and 20 is " + sum);
    }
}
