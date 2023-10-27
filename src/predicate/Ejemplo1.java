package predicate;

import java.util.function.Predicate;

public class Ejemplo1 {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Juan", true);
        Usuario usuario2 = new Usuario("Pedro", false);

        Predicate<Usuario> esActivo = Usuario::isActivo;

        System.out.println("Usuario 1 está activo: " + esActivo.test(usuario1));
        System.out.println("Usuario 2 está activo: " + esActivo.test(usuario2));
    }
}
