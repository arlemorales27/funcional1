package consumer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.function.Consumer;

public class Ejemplo3Consumer {
    public static void main(String[] args) {
        Consumer<String> consumer = linea -> {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("datos.txt", true));
                writer.write(linea);
                writer.newLine();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        };
        consumer.accept("Hola mundo");
        consumer.accept("Este es un ejemplo");
    }
    }

