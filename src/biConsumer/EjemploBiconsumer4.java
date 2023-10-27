package biConsumer;

import java.util.function.BiConsumer;

public class EjemploBiconsumer4 {
    public static void main(String[] args) {
        Empleado2 empleado2 = new Empleado2("Juan", "Pérez", "12345678A", "Madrid");

        // Creamos un objeto CiudadResidencia
        CiudadResidencia ciudad = new CiudadResidencia("Barcelona");

        // Actualizamos la ciudad de residencia del Empleado utilizando el BiConsumer
        BiConsumer<Empleado2, CiudadResidencia> biConsumer = (emp, ciu) -> emp.setCiudadResidencia(ciu.getNombre());
        biConsumer.accept(empleado2, ciudad);

        // Imprimimos los detalles del Empleado actualizados
        System.out.println("Nombre: " + empleado2.getNombre());
        System.out.println("Apellidos: " + empleado2.getApellidos());
        System.out.println("Cedula: " + empleado2.getCedula());
        System.out.println("Ciudad de residencia: " + empleado2.getCiudadResidencia());
    }
}
