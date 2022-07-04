public class Videojuego implements Entregable {
  

    private final static int HORAS_ESTIMADAS_DEF=100;
  
   
    public final static int MAYOR=1;
  
   
    public final static int MENOR=-1;
  
 
    public final static int IGUAL=0;
  
  
    private String titulo;
  
  
    private int horasEstimadas;
  
    private boolean entregado;
  
    private String genero;
  
    private String compa�ia;
  
 
    public String getTitulo() {
        return titulo;
    }
  
  
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
  
   
    public int getHorasEstimadas() {
        return horasEstimadas;
    }
  
  
  
    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }
  

    public String getGenero() {
        return genero;
    }
  
  
    public void setGenero(String genero) {
        this.genero = genero;
    }
  
  
    public String getcompa�ia() {
        return compa�ia;
    }
  
 
    public void setcompa�ia(String compa�ia) {
        this.compa�ia = compa�ia;
    }
  
  
   
    public void entregar() {
        entregado=true;
    }
  
 
   
    public void devolver() {
        entregado=false;
    }
  
   
    public boolean isEntregado() {
        if(entregado){
            return true;
        }
        return false;
    }
  
  
   
    public int compareTo(Object a) {
        int estado=MENOR;
  
        
        Videojuego ref=(Videojuego)a;
        if (horasEstimadas>ref.getHorasEstimadas()){
            estado=MAYOR;
        }else if(horasEstimadas==ref.getHorasEstimadas()){
            estado=IGUAL;
        }
  
        return estado;
    }
  
   
    public String toString(){
        return "Informacion del videojuego: \n" +
                "\tTitulo: "+titulo+"\n" +
                "\tHoras estimadas: "+horasEstimadas+"\n" +
                "\tGenero: "+genero+"\n" +
                "\tcompa�ia: "+compa�ia;
    }
  

    public boolean equals(Videojuego a){
        if (titulo.equalsIgnoreCase(a.getTitulo()) && compa�ia.equalsIgnoreCase(a.getcompa�ia())){
            return true;
        }
        return false;
    }
  
 
    public Videojuego(){
        this("",HORAS_ESTIMADAS_DEF, "", "");
    }
  

    public Videojuego(String titulo, String compa�ia){
        this(titulo,HORAS_ESTIMADAS_DEF, "", compa�ia);
    }
  

    public Videojuego(String titulo, int horasEstimadas, String genero, String compa�ia){
        this.titulo=titulo;
        this.horasEstimadas=horasEstimadas;
        this.genero=genero;
        this.compa�ia=compa�ia;
        this.entregado=false;
    }
 
  
}

  
    

