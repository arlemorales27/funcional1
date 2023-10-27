package biConsumer;

public class Empleado2 {
    private String nombre;
    private String apellidos;
    private String  cedula;
    private String ciudadResidencia;

    public Empleado2(String nombre, String apellidos, String cedula, String ciudadResidencia) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.ciudadResidencia = ciudadResidencia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }
}
