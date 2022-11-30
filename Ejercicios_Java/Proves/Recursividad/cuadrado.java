package Proves.Recursividad;

import java.util.Scanner;

public class cuadrado {

    public static void pedirDatos(Scanner sc) {
        
        System.out.println("Dime el tamaño del cuadrado");
        int lado = sc.nextInt();

        imprimir(0, lado, 1);
    }

    public static void imprimir(int n, int lado, int veces) {
        if (n < lado) {
            System.out.print("* ");
            imprimir(n+1, lado, veces);
        } else {
            if (veces < lado) {
                
                System.out.println();
                imprimir(0, lado, veces+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pedirDatos(sc);
    }
}
