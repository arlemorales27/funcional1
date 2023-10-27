package biFunction;

import java.util.function.BiFunction;

public class Ejemplo2BF {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Juan", 35, null);
        Medico medico = new Medico("Ana", "Cardiología");

        BiFunction<Paciente, Medico, String> asignarDiagnostico = (p, m) -> {
            p.setDiagnostico("Problemas de corazón");
            return m.getNombre() + " ha asignado el diagnóstico '" + p.getDiagnostico() + "' a " + p.getNombre() + ".";
        };

        System.out.println(asignarDiagnostico.apply(paciente, medico));
    }
}
