package ejerciciotriple3;

import java.util.Scanner;

public class EjercicioTriple3 {
    public static void main(String[] args) {
       Scanner scanf = new Scanner(System.in);
       int i = 0;
       
       PartidoFutbol listaPartidos = new PartidoFutbol("0", "0", 0, 0);
       
       
       for (i=0; i<5; i++) {
       System.out.println("Ingrese el equipo 1 del partido" + i);
       listaPartidos.setEquipoLocal(scanf.nextLine());
       System.out.println("Ingrese el equipo 2 del partido" + i);
       listaPartidos.setEquipoVisitante(scanf.nextLine());
       System.out.println("Ingrese los goles del equipo 1 del partido" + i);
       listaPartidos.setGolesLocal(scanf.nextLine());
       System.out.println("Ingrese los goles del equipo 2 del partido" + i);
       listaPartidos.setGolesVisitante(scanf.nextLine());
       }
       listaPartidos.imprimirResultados();
    }
    
}
