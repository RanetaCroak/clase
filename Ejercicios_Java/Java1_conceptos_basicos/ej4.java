package Java1_conceptos_basicos;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime el año actual");
        int anyo = sc.nextInt();
        System.out.println("Dime tu año de nacimiento");
        int nacimiento = sc.nextInt();

        System.out.println("Tu edad es de "+(anyo-nacimiento));
        sc.close();
    }
}
