package evaluacion.pkg2;

public class Constructor extends Empleados {
 
    private double Sueldo;
    private double Impuestos;
    
    public Constructor (double Sueldo,double Impuestos,String Nombre,String Domicilio,int Telefono,int Dni) {
        super(Nombre,Domicilio,Telefono,Dni);
        
        this.Sueldo=Sueldo;
        this.Impuestos=Impuestos;
    } 

    @Override
    public String toString() {
        return "Constructor{" + "Sueldo=" + Sueldo + ", Impuestos=" + Impuestos + ",Nombre" + Nombre + ", Domicilio" + Domicilio +", Telefono" + Telefono + ", Dni" + Dni +'}';
    }

    public double getSueldo() {
        return Sueldo;
    }

    public double getImpuestos() {
        return Impuestos;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public int getTelefono() {
        return Telefono;
    }

    public int getDni() {
        return Dni;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public void setImpuestos(double Impuestos) {
        this.Impuestos = Impuestos;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }
    
            public double plata (){
        return Sueldo - Impuestos;
        }
        
        public double pagar (){
            double plata = Sueldo - Impuestos;
        return Sueldo-plata;
        }
}
 