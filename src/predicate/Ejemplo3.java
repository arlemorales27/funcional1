package predicate;

import java.util.function.Predicate;

public class Ejemplo3 {
    public static void main(String[] args) {
        // Create a predicate that checks if a number is greater than 10.
        Predicate<Integer> isGreaterThanTen = n -> n > 10;

        // Check if 10 is greater than 10.
        boolean isTenGreaterThanTen = isGreaterThanTen.test(10);
        System.out.println(isTenGreaterThanTen); // false

        // Check if 20 is greater than 10.
        boolean isTwentyGreaterThanTen = isGreaterThanTen.test(20);
        System.out.println(isTwentyGreaterThanTen); // true
    }
}
