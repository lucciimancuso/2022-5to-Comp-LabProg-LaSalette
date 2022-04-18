package evaluacion;
public class Evaluacion3 {
 String nombre;
String domicilio;
int Telefono;
int DNI;   
Double Sueldo;
Double Impuestos;

    public Evaluacion3(String nombre, String domicilio, int Telefono, int DNI, Double Sueldo, Double Impuestos) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.Telefono = Telefono;
        this.DNI = DNI;
        this.Sueldo = Sueldo;
        this.Impuestos = Impuestos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public Double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(Double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public Double getImpuestos() {
        return Impuestos;
    }

    public void setImpuestos(Double Impuestos) {
        this.Impuestos = Impuestos;
    }


}
