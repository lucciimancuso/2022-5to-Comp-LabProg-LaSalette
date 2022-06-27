package evaluacion.pkg2;

public class Operario extends Empleados {
    
    double tarifa;
    int hora_trabajadas; 

    public double getTarifa() {
        return tarifa;
    }

    public int getHora_trabajadas() {
        return hora_trabajadas;
    }

    public Operario(double tarifa, int hora_trabajadas) {
        this.tarifa = tarifa;
        this.hora_trabajadas = hora_trabajadas;
    }

}
    