package Java2_conceptos_basicos;

import java.util.Scanner;

public class ej19 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número de entradas infantiles");
        int entradaInfantil = sc.nextInt();
            
        System.out.println("Introduce el número de entradas de adultos");
        int entradaAdulto = sc.nextInt();

        float precioInfantil = 15.50f;
        float precioAdulto = 20f;

        float total = (precioInfantil*entradaInfantil)+(precioAdulto*entradaAdulto);
        if (total >= 100) {
            total *= 0.95f; // Descuento 5%
            System.out.println("Descuento del 5% aplicado");
        }
        System.out.println("El precio total es "+total+" euros");


        sc.close();
    }
}
