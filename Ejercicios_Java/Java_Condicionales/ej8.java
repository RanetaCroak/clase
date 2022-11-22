package Java_Condicionales;

import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número entre 0 y 99.999");
        int n = sc.nextInt();
        if (n < 0 || n > 99999) {
            System.out.println("El número se sale del rango");
        } else  {
            int aux = n, cifras = 1;
            while (aux/10>=1) { // Mientras dividir no dé decimal
                aux/=10;
                cifras++;
            }
            System.out.println("El número "+n+" tiene "+cifras+" cifras");
        }
        sc.close();
    }
}
