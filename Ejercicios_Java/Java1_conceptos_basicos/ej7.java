package Java1_conceptos_basicos;

import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        System.out.println("Dime el radio de la circunferencia");
        Scanner sc = new Scanner(System.in);
        float radio = sc.nextFloat();
        final float pi = 3.1415f;
        
        System.out.println("El area es igual a "+(radio*radio*pi));
        System.out.println("La circunferencia es igual a "+(pi*pi*radio));

        sc.close();
    }
}
