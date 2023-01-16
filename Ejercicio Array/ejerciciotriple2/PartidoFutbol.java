package ejerciciotriple2;

public class PartidoFutbol {
    	private String equipoLocal[] = new String[5];
	private String equipoVisitante[] = new String[5];
	private int golesLocal[] = new int[5];
	private int golesVisitante[] = new int[5];
        
        public PartidoFutbol (String equipoLocal, String equipoVisitante, int golesLocal, int golesVisitante, int numPartido) {
            this.equipoLocal[numPartido] = equipoLocal;
            this.equipoVisitante[numPartido] = equipoVisitante;
            this.golesLocal[numPartido] = golesLocal;
            this.golesVisitante[numPartido] = golesVisitante;
        }
        
        
        

	public void setEquipoLocal(int numPartido, String equipoLocal) {
        this.equipoLocal[numPartido] = equipoLocal;
}
        public void setEquipoVisitante(int numPartido, String equipoVisitante) {
        this.equipoVisitante[numPartido] = equipoVisitante;
}
        public void setGolesLocal(int numPartido, int golesLocal) {
        this.golesLocal[numPartido] = golesLocal;
}
        public void setGolesVisitante(int numPartido, int golesVisitante) {
        this.golesVisitante[numPartido] = golesVisitante;
}
        
        public String getEquipoLocal(String equipoLocal, int numPartido) {
            equipoLocal = this.equipoLocal[numPartido];
            return equipoLocal;
        }
        
        public String getEquipoVisitante(String equipoVisitante, int numPartido) {
            this.equipoVisitante[numPartido] = equipoVisitante;
            return equipoVisitante;
        }
        
        public int getGolesLocal(int golesLocal, int numPartido) {
            golesLocal = this.golesLocal[numPartido];
            return golesLocal;
        }
        
        public int getGolesVisitante(int golesVisitante, int numPartido) {
            golesVisitante = this.golesVisitante[numPartido];
            return golesVisitante;
        }
}
