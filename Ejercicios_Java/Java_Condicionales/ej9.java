package Java_Condicionales;

import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        System.out.println("Dime una nota entera del 0 al 10");
        Scanner sc = new Scanner(System.in);
        int nota = sc.nextInt();

        if (nota >= 0 && nota <= 4) {
            System.out.println("Insuficiente");
        } 
        if (nota >= 5 && nota <= 7) {
            System.out.println("Suficiente");
        }
        if (nota >= 7 && nota <= 8) {
            System.out.println("Notable");
        }
        if (nota >= 9 && nota <= 10) {
            System.out.println("Sobresaliente");
        }
        sc.close();
    }
}
