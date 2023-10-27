package function;

import java.util.function.Function;

public class Ejemplo2Function {
    public static void main(String[] args) {
        Function<Integer, Integer> cuadrado = x -> x * x;
        int numero = 5;
        int resultado = cuadrado.apply(numero);
        System.out.println("El cuadrado de " + numero + " es " + resultado);
    }
}
