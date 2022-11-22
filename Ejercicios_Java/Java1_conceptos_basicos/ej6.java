package Java1_conceptos_basicos;

import java.util.Scanner;

public class ej6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime dos notas y calcularé la media");
        
        System.out.println("Nota 1");
        float nota1 = sc.nextFloat();
        
        System.out.println("Nota2");
        float nota2 = sc.nextFloat();

        float media = (nota1 + nota2) / 2;

        System.out.println("Tu nota media es de "+media);
        sc.close();
    }
}