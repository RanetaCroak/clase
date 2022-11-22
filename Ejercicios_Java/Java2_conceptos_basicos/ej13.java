package Java2_conceptos_basicos;

import java.util.Scanner;

public class ej13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número");
        int multiplo = sc.nextInt();

        System.out.println("Dime un número para ver si es múltiplo de "+multiplo);
        int n = sc.nextInt();

        int suma = multiplo - n%multiplo;
        if (suma == multiplo) {
            System.out.println("El número es múltiplo de "+multiplo);
        }
        else
            System.out.println("Para que el número sea múltiplo, hay que sumarle "+suma);
        
        sc.close();
    }
}
