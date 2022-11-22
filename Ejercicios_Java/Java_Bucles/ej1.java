package Java_Bucles;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce números, para parar pulsa 0");
   
        int n = sc.nextInt();
        while (n!=0) {
            if (n%2==0) {
                System.out.println("El número es par");
            } else {
                System.out.println("El número no es par");
            }
            if (n<0) {
                System.out.println("El número es negativo");
            } else {
                System.out.println("El número es positivo");
            }
            System.out.println("Su cuadrado es "+n*n);

            System.out.println("Introduce el siguiente número");
            n = sc.nextInt();
        }
        System.out.println("Saliendo...");
        sc.close();
    }
}
