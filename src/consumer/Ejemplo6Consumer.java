package consumer;

import java.util.function.Consumer;

public class Ejemplo6Consumer {
    public static void main(String[] args) {
        // Crear un Consumer
        Consumer<String> consumer = x -> {
            System.out.println("Procesando: " + x);
        };

        // Utilizar el Consumer
        consumer.accept("Hola mundo!");
    }
}
