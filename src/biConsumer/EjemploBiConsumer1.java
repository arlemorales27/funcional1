package biConsumer;

import java.util.function.BiConsumer;

public class EjemploBiConsumer1 {
    public static void main(String[] args) {
        BiConsumer<String, Integer> printDetails = (name, age) -> System.out.println(name + " tiene " + age + " años ");
        printDetails.accept("John", 25);
        printDetails.accept("Ana", 17);
    }
}
