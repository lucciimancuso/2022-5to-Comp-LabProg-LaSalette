

package evaluacion;

//consultador
public class Evaluacion2 {
String nombre;
String domicilio;
int Telefono;
int DNI; 
Double Horas;
Double Tarifa;

    public Evaluacion2(String nombre, String domicilio, int Telefono, int DNI, Double Horas, Double Tarifa) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.Telefono = Telefono;
        this.DNI = DNI;
        this.Horas = Horas;
        this.Tarifa = Tarifa;
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

    public Double getHoras() {
        return Horas;
    }

    public void setHoras(Double Horas) {
        this.Horas = Horas;
    }

    public Double getTarifa() {
        return Tarifa;
    }

    public void setTarifa(Double Tarifa) {
        this.Tarifa = Tarifa;
    }


}