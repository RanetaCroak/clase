package Java3_Metodos;

import java.util.Scanner;

public class ej3 {

    public static int potencia(int base, int exponente) {
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = 0;
        int exponente = 0;
        System.out.println("Introduce una base menor de 50");
        do {
            base = sc.nextInt();
        } while (base > 49);
        System.out.println("Introduce un exponente de menos de 10");
        do {
            exponente = sc.nextInt();
        } while (exponente > 10);
        sc.close();
        System.out.println(potencia(base, exponente));
    }
}
