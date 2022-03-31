/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author PC01
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n, i, n1=0, n2=1000000000, st=0, ng;
        
            Scanner scanf = new Scanner (System.in);
        System.out.println("Cuantos numeros desea ingresar? ");
        n=scanf.nextInt();
        
        for (i=1; i<=n; i++){ 
        
        
        System.out.println("Ingrese un numero: ");
        ng=scanf.nextInt();
        
            if(ng>n1){
                n1=ng;
                
            
            } else if (ng<n2){
                n2=ng;
                
            } 
            
        }
    st = n1 + n2;
    System.out.println("La suma entre el menor y el mayor de los numeros ingresados es: "+st);
    
    }
}

