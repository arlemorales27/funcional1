package supplier;

import java.util.function.Supplier;

public class Usuario {
    private String nombreUsuario;

    public Usuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Juan");
        Supplier<String> usernameSupplier = usuario::getNombreUsuario;
        String username = usernameSupplier.get();
        System.out.println("Nombre de usuario: " + username);
    }
}
