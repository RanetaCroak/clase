package Java2_conceptos_basicos;

import java.util.Scanner;

public class ej18 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número de hormigas capturadas");
        int hormigas = sc.nextInt()*6;
        
        System.out.println("Introduce el número de arañas capturadas");
        int arañas = sc.nextInt()*8;

        System.out.println("Introduce el número de cochinillas capturadas");
        int cochinillas = sc.nextInt()*14;

        System.out.println("El total de patas es "+(hormigas+arañas+cochinillas));
        
        sc.close();
    }

}
