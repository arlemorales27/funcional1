package supplier;

import java.util.function.Supplier;

public class EjemploSupplier1 {
    public static void main(String[] args) {
            Supplier<Integer> randomNumSupplier = () -> (int) (Math.random() * 100);
            int randomNum = randomNumSupplier.get();
            System.out.println("El número aleatorio es: " + randomNum);
        }
    }

