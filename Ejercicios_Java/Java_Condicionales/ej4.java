package Java_Condicionales;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número decimal");
        float n = sc.nextFloat();
        
        boolean casiCero = false;

        if (n != 0) { 
            if (n < 1 && n > 0 || n > -1 && n < 0) {
                casiCero = true;
            }
        }

        if (casiCero) {
            System.out.println("El número "+n+" es casi-cero");
        } else {
            System.out.println("El número "+n+" no es casi-cero");
        }
        sc.close();
    }
}
