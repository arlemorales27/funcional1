package consumer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Ejemplo4Consumer {
    public static void main(String[] args) {
        // inverso
        List<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");

        Consumer<List <String>> consumer = lista -> {
            Collections.reverse(lista);
            lista.forEach(System.out::println);
        };
        consumer.accept(nombres);
    }
    }

