package evaluacion.pkg2;

public class Empleados {
    
    protected String nombre;
    protected String domicilio;
    protected String telefono;
    protected String dni;

    public Empleados(String nombre, String domicilio, String telefono, String dni) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDni() {
        return dni;
    }
}
