package biConsumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class EjemploBiconsumer2 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("apple", "banana", "orange");
        List<String> list2 = Arrays.asList("grape", "kiwi", "pineapple");

        List<String> result = new ArrayList<>();

        BiConsumer<String, String> biConsumer = (s1, s2) -> result.add(s1 + " " + s2);
        // Combina las dos listas utilizando el BiConsumer
        for(int i=0; i<list1.size(); i++) {
            biConsumer.accept(list1.get(i), list2.get(i));
        }
        System.out.println(result); // [apple grape, banana kiwi, orange pineapple]
    }
}
