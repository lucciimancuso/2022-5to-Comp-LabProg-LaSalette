/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author PC01
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b, sum=0, i;
        
        Scanner scanf = new Scanner (System.in);
  System.out.println("Escribi un numero: ");
  a=scanf.nextInt();
  System.out.println("Escribi otro numero: ");
  b=scanf.nextInt();
    
    for (i=a+1; i<b; i++){
        if (i%5==0){
        sum=sum+i;
        
        }
        
    }
  
         System.out.println("la suma de los multiplos de 5 es: " +sum);       
    
    }
    
}
