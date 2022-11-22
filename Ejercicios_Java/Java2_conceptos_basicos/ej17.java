package Java2_conceptos_basicos;

import java.util.Scanner;

public class ej17 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una medida en milimetros");
        int mm = sc.nextInt();

        System.out.println("Introduce una medida en centimetros");
        int cm = sc.nextInt();

        System.out.println("Introduce una medida en metros");
        int m = sc.nextInt();

        int total = mm*10 + cm + m/10;
        System.out.println("El total es "+total+" cm");

        sc.close();
    }
}
