package Java2_Condicionales;

import java.util.Scanner;

public class ej17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la base de un triángulo");
        float base = sc.nextFloat();
        System.out.println("Introduce la altura del triángulo");
        float altura = sc.nextFloat();
        
        if (base < 0 || altura < 0) {
            System.out.println("Los parámetros no pueden ser negativos!");
        } else {
            System.out.println("El area es de "+base*altura/2);
        }
        sc.close();
    }
}
