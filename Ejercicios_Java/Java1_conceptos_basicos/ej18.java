package Java1_conceptos_basicos;

import java.util.Scanner;

public class ej18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la base de la factura");
        float base = sc.nextFloat();
        final int iva = 21;

        System.out.println("Con el IVA, el precio pasa a ser de "+(base+(base/100*iva))+" euros");
        sc.close();
    }
}
