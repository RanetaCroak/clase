package Java1_conceptos_basicos;

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("La variable \"Short\" solo almacena valores entre -32768 y 32767");
        System.out.println("Prueba a introducir un valor fuera de ese rango y verás que da error");
        
        short prueba = sc.nextShort();

        // Se espera que el programa de error aquí

        System.out.println("Parece que no se ha roto nada, el valor "+prueba+" es válido");
        sc.close();

    }
}
