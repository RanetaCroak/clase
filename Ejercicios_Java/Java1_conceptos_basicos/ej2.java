package Java1_conceptos_basicos;

import java.util.Scanner;

public class ej2 { 

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
            System.out.println("Dime un número");

            int n = sc.nextInt(); 

            System.out.println("Tu número es el "+n);

        sc.close();

    }
}