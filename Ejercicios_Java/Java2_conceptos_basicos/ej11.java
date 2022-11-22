package Java2_conceptos_basicos;

import java.util.Scanner;

public class ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la base imponible");
        float base = sc.nextFloat();

        System.out.println("Dime el IVA");
        int iva = sc.nextInt();

        float ivaProducto = (float) base/100*iva;
        float total = ivaProducto + base;

        System.out.println("El importe es de "+total+" euros y el IVA aplicado de "+ivaProducto+" euros");

        sc.close();
    }
}
