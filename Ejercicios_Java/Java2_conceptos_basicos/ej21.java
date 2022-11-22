package Java2_conceptos_basicos;

import java.util.Scanner;

public class ej21 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número");
        int a = sc.nextInt();

        System.out.println("Ahora dime otro");
        int b = sc.nextInt();

        System.out.println(a==b);
        sc.close();
    }
}
