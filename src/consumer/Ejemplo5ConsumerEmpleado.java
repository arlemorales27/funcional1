package consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Ejemplo5ConsumerEmpleado {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Juan", 5000));
        empleados.add(new Empleado("María", 6000));
        empleados.add(new Empleado("Pedro", 7000));

        Consumer<List<Empleado>> consumer = (listaEmpleados) -> {
            for(Empleado empleado : listaEmpleados) {
                System.out.println(empleado.getNombre() + " - " + empleado.getSalario());
            }
        };
        consumer.accept(empleados);
    }
}
