package Java2_conceptos_basicos;

import java.util.Scanner;

public class ej12 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un número para ver si es múltiplo de 7");
        int n = sc.nextInt();

        int suma = 7 - n%7;
        if (suma == 7) {
            System.out.println("El número es múltiplo de 7");
        }
        else
            System.out.println("Para que el número sea múltiplo, hay que sumarle "+suma);
        
        sc.close();
    }
}

