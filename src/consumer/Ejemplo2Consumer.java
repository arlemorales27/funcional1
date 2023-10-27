package consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Ejemplo2Consumer {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        Consumer<Integer> consumer = numero -> numeros.set(numeros.indexOf(numero), numero * 2);
        numeros.forEach(consumer);

        System.out.println(numeros);
    }
}
