package predicate;

import java.util.function.Predicate;

public class Ejemplo2 {
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo(true);

        Predicate<Semaforo> estaEncendido = Semaforo::isEncendido;
        if (estaEncendido.test(semaforo)) {
            System.out.println("El semáforo está encendido");
        } else {
            System.out.println("El semáforo está apagado");
        }
    }
}
