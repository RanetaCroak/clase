package Java2_conceptos_basicos;

import java.util.Scanner;

public class ej20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número para calcular su raíza cuadrada");
        int n = sc.nextInt();
        System.out.println("La raiz cuadrada de "+n+" es "+java.lang.Math.sqrt(n)); 

        sc.close();
    }
}
