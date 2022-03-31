/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author PC01
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b=13, i;
        
           Scanner scanf = new Scanner (System.in);
  System.out.println("Intenta adivinar el numero: ");
  a=scanf.nextInt();
  
    if (b<a){
     System.out.println("El numero ingresado es mayor");
     
  }else if (b>a){
    System.out.println("El numero ingresado es menor");
    
  }else {
    System.out.println("Felicidades! El numero correcto era "+a);
      
    }
  }
}
