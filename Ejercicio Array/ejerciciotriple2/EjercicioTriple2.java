package EjercicioTriple2;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EjercicioTriple2 {
    public static void main(String[] args) {
       Scanner scanf = new Scanner(System.in);
       int i = 0;
       PartidoFutbol p1 = new PartidoFutbol();
       
       for (i=0; i<5; i++) {
       System.out.println("Ingrese el equipo 1 del partido" + i);
       p1.setEquipoLocal(i, scanf.nextLine());
       System.out.println("Ingrese el equipo 2 del partido" + i);
       p1.setEquipoVisitante(i, scanf.nextLine());
       System.out.println("Ingrese los goles del equipo 1 del partido" + i);
       p1.setGolesLocal(i, scanf.nextInt());
       System.out.println("Ingrese los goles del equipo 2 del partido" + i);
       p1.setGolesVisitante(i, scanf.nextInt());
       }
       
       System.out.println("RESULTADOS DE LOS PARTIDOS");
       for (i=0; i<=5; i++) {
        System.out.println(p1.getEquipoLocal(i) + p1.getGolesLocal(i) + p1.getGolesVisitante(i) + p1.getEquipoVisitante(i));
       }
       
       
       
    }
}
    