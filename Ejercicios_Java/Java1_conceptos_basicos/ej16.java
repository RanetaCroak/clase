package Java1_conceptos_basicos;

import java.util.Scanner;

public class ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la base");
        int base = sc.nextInt();
        System.out.println("Dime la altura");
        int altura = sc.nextInt();

        System.out.println("El area del rectángulo es de "+base*altura);
        sc.close();
    }
}
