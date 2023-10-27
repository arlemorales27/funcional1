package consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Ejemplo1Consumer {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");

        Consumer<String> consumer = nombre -> System.out.println("Hola " + nombre + "!");
        nombres.forEach(consumer);
    }
}

