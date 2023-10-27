package function;

import java.util.function.Function;

public class Ejemplo3Function {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan", "Pérez", 35, 1000.0);

        Function<Cliente, String> mostrarSaldo = c -> "El saldo de " + c.getNombre() + " " + c.getApellido() + " es $" + c.getSaldo() + ".";

        System.out.println(mostrarSaldo.apply(cliente));
    }
}
