package ejerciciotriple3;
import java.util.ArrayList;

public class PartidoFutbol {
    ArrayList<String> equipoLocal = new ArrayList();
    ArrayList<String> equipoVisitante = new ArrayList();
    ArrayList<Integer> golesLocal = new ArrayList();
    ArrayList<Integer> golesVisitante = new ArrayList();
    
    public PartidoFutbol(String equipoLocal, String equipoVisitante, int golesLocal, int golesVisitante) {
        this.equipoLocal.add(equipoLocal);
        this.equipoVisitante.add(equipoVisitante);
        this.golesLocal.add(golesLocal);
        this.golesVisitante.add(golesVisitante);
    }
    public void setEquipoLocal(String equipoLocal) { this.equipoLocal.add(equipoLocal); }
    public void setEquipoVisitante(String equipoVisitante) { this.equipoLocal.add(equipoVisitante); }
    public void setGolesLocal(String golesLocal) { this.equipoLocal.add(golesLocal); }
    public void setGolesVisitante(String golesVisitante) { this.equipoLocal.add(golesVisitante); }
    
    public void imprimirResultados() {
        int i;
        for (i=0; i<5; i++)  {
            System.out.println(equipoLocal.get(i) + golesLocal.get(i) + golesVisitante.get(i) + equipoVisitante.get(i));
        }
    }
}