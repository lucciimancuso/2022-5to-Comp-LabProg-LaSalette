package javaapplication1;
import java.util.Scanner;
import java.util.ArrayList;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int bin, i, j, t=1, dec=0;

        System.out.print("ingrese el codigo binario (8 digitos)");
        bin = scanf.nextInt();

        ArrayList<Integer> particion = new ArrayList();

        for (i=0; i<8; i++) {
            if (bin % 10 == 0) { particion.add(0); }
            else { particion.add(1); }
            bin = bin / 10;
        }

        for (i=8; i>0; i--) {
            for (j=0; j<i; j++) {
                dec = dec + particion.get(i-1) * 2;
            }
        }

        System.out.print("el numero es " + dec);






    }

}