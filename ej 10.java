/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC01
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanf = new Scanner(System.in);
        
        int codigo, i, a;
        double total;
        ArrayList<Integer> sueldo = new ArrayList();
        ArrayList<Integer> horas = new ArrayList();
   
        for (i=0; i<5; i++) {
                System.out.print("ingrese el sueldo por hora de el empleado nro  "+i);
                a = scanf.nextInt();
                sueldo.add(a);
                System.out.print("ingrese las horas trabajadas por empleado nro "+i);
                a = scanf.nextInt();
                horas.add(a);
                        }
        
        for (i=0; i<5; i++) {
            if (horas.get(i) <= 40) { total = horas.get(i) * sueldo.get(i); }
            else { total = 40 * sueldo.get(i) + (horas.get(i) - 40) * sueldo.get(i) * 1.5; }
            System.out.print("el sueldo del empleado es " + total);
        }                
    }   
}
    
    

   