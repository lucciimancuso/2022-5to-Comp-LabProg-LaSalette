package evaluacion.pkg2;

public class Consultor extends Empleados {

    private int hora;
    private double tarifa;

    public Consultor (int hora,double tarifa,String nombre,String domicilio,int telefono,int dni) {
        super(nombre,domicilio,telefono,dni);

        this.hora=hora;
        this.tarifa=tarifa;
    }

    public int getHora() {
        return hora;
    }

    public double getTarifaxh() {
        return tarifa;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public int getDni() {
        return dni;
    }
}
 
   