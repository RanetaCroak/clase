package Java_Bucles;

import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        System.out.println("Dime un número del 1 al 10 y te muestro su tabla de multiplicar");
        Scanner sc = new Scanner(System.in);

        int n = 0;

        do {
            n = sc.nextInt();
            if (n > 0 && n < 11) {           
                for (int i = 1; i <= 10; i++) {
                    System.out.println(n+" x "+i+" = "+n*i);
                }
            } else {
                System.out.println("Rango incorrecto");
                System.out.println("Introduce un número entre 1 y 10");
            }

        } while (n < 1 || n > 10);
            sc.close();
    }
}
