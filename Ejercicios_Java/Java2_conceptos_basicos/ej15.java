package Java2_conceptos_basicos;

import java.util.Scanner;

public class ej15 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dado el polinomio: \n\ny = ax² + bx +C");
        System.out.println("\nIntroduce el valor de a");
        int a = sc.nextInt();

        System.out.println("\nIntroduce el valor de b");
        int b = sc.nextInt();

        System.out.println("\nIntroduce el valor de c");
        int c = sc.nextInt();

        System.out.println("\nIntroduce el valor de x");
        int x = sc.nextInt();

        int y = a*x*x + b*x + c;

        System.out.println("El valor de y es "+y);
        sc.close();
    }

}
