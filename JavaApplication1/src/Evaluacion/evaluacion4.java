package evaluacion;
public class Evaluacion4 {
    String nombre;
String domicilio;
int Telefono;
int DNI;
String Constructor;
int Hora;

    public Evaluacion4(String nombre, String domicilio, int Telefono, int DNI, String Constructor, int Hora) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.Telefono = Telefono;
        this.DNI = DNI;
        this.Constructor = Constructor;
        this.Hora = Hora;
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

    public String getConstructor() {
        return Constructor;
    }

    public void setConstructor(String Constructor) {
        this.Constructor = Constructor;
    }

    public int getHora() {
        return Hora;
    }

    public void setHora(int Hora) {
        this.Hora = Hora;
    }



}