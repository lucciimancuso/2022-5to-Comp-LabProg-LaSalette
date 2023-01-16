package ejerciciotriple1;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EjercicioTriple1 {
    public static void main(String[] args) {
       Scanner scanf = new Scanner(System.in);
       
       PartidoFutbol p1 = new PartidoFutbol();
       System.out.println("Ingrese el equipo 1 del partido" + 1);
       p1.setEquipoLocal(scanf.nextLine());
       System.out.println("Ingrese el equipo 2 del partido" + 1);
       p1.setEquipoVisitante(scanf.nextLine());
       System.out.println("Ingrese los goles del equipo 1 del partido" + 1);
       p1.setGolesLocal(scanf.nextInt());
       System.out.println("Ingrese los goles del equipo 2 del partido" + 1);
       p1.setGolesVisitante(scanf.nextInt());
       
       PartidoFutbol p2 = new PartidoFutbol();
       System.out.println("Ingrese el equipo 1 del partido" + 2);
       p2.setEquipoLocal(scanf.nextLine());
       System.out.println("Ingrese el equipo 2 del partido" + 2);
       p2.setEquipoVisitante(scanf.nextLine());
       System.out.println("Ingrese los goles del equipo 1 del partido" + 2);
       p2.setGolesLocal(scanf.nextInt());
       System.out.println("Ingrese los goles del equipo 2 del partido" + 2);
       p2.setGolesVisitante(scanf.nextInt());
      
       PartidoFutbol p3 = new PartidoFutbol();
       System.out.println("Ingrese el equipo 1 del partido" + 3);
       p3.setEquipoLocal(scanf.nextLine());
       System.out.println("Ingrese el equipo 2 del partido" + 3);
       p3.setEquipoVisitante(scanf.nextLine());
       System.out.println("Ingrese los goles del equipo 1 del partido" + 3);
       p3.setGolesLocal(scanf.nextInt());
       System.out.println("Ingrese los goles del equipo 2 del partido" + 3);
       p3.setGolesVisitante(scanf.nextInt());
       
       PartidoFutbol p4 = new PartidoFutbol();
       System.out.println("Ingrese el equipo 1 del partido" + 4);
       p4.setEquipoLocal(scanf.nextLine());
       System.out.println("Ingrese el equipo 2 del partido" + 4);
       p4.setEquipoVisitante(scanf.nextLine());
       System.out.println("Ingrese los goles del equipo 1 del partido" + 4);
       p4.setGolesLocal(scanf.nextInt());
       System.out.println("Ingrese los goles del equipo 2 del partido" + 4);
       p4.setGolesVisitante(scanf.nextInt());
       
       PartidoFutbol p5 = new PartidoFutbol();
       System.out.println("Ingrese el equipo 1 del partido" + 5);
       p5.setEquipoLocal(scanf.nextLine());
       System.out.println("Ingrese el equipo 2 del partido" + 5);
       p5.setEquipoVisitante(scanf.nextLine());
       System.out.println("Ingrese los goles del equipo 1 del partido" + 5);
       p5.setGolesLocal(scanf.nextInt());
       System.out.println("Ingrese los goles del equipo 2 del partido" + 5);
       p5.setGolesVisitante(scanf.nextInt());
       
        System.out.println("RESULTADOS DE LOS PARTIDOS");
        System.out.println(p1.getEquipoLocal() + p1.getGolesLocal() + p1.getGolesVisitante() + p1.getEquipoVisitante());
        System.out.println(p2.getEquipoLocal() + p2.getGolesLocal() + p2.getGolesVisitante() + p2.getEquipoVisitante());
        System.out.println(p3.getEquipoLocal() + p3.getGolesLocal() + p3.getGolesVisitante() + p3.getEquipoVisitante());
        System.out.println(p4.getEquipoLocal() + p4.getGolesLocal() + p4.getGolesVisitante() + p4.getEquipoVisitante());
        System.out.println(p5.getEquipoLocal() + p5.getGolesLocal() + p5.getGolesVisitante() + p5.getEquipoVisitante());
    }
    
}
