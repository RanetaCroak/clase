package Java2_conceptos_basicos;

import java.util.Scanner;

public class ej14 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la base del triángulo");
        int base = sc.nextInt();

        System.out.println("Dime la altura del triángulo");
        int altura = sc.nextInt();

        float area = (float) (base*altura)/2;
        
        System.out.println("El area del triángulo es "+area);
        
        sc.close();
    }
}
