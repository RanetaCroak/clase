package Java1_conceptos_basicos;

import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime tu edad");
        int edad = sc.nextInt();

        boolean mayorEdad;
        if (edad<18) {
            mayorEdad = false;
        }
        else
            mayorEdad = true;
        
        if (mayorEdad) {
            System.out.println("Eres mayor de edad");
        }
        else
            System.out.println("No eres mayor de edad");

        sc.close();
    }
}
