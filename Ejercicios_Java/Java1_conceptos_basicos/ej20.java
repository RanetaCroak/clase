package Java1_conceptos_basicos;

import java.util.Scanner;

public class ej20 {
    public static void main(String[] args) {
        System.out.println("Dime la altura del cono");
        Scanner sc = new Scanner(System.in);
        int altura = sc.nextInt();
        System.out.println("Ahora dime el radio del cono");
        int radio = sc.nextInt();
        final float pi = 3.1415f;
        float area = pi*radio*radio*altura/3;

        System.out.println("El area es de "+area);
        sc.close();
    }
}
