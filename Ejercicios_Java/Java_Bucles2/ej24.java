import java.util.Scanner;

public class ej24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora de dinero");
        System.out.println("Introduce distintas cantidades de dinero (En el banco, los bolsillos, cajones, una huca...");
        System.out.println("Para parar, introduce la cantidad de 0");

        float n = 0f, dineroTotal = 0f;
        System.out.println("Dime el tipo de moneda");
        String moneda = sc.nextLine().toLowerCase();
        do {
            System.out.println("Introduce una cantidad ej.: 126,55");
            dineroTotal += n = sc.nextFloat();
        } while (n != 0);

        System.out.print("En total, dispones de ");
        System.out.printf("%.2f", dineroTotal); 
        System.out.println(" "+moneda+(moneda.charAt(moneda.length()-1)=='s'?"":"s"));
        sc.close();
    }
}
