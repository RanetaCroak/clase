package Java_Strings1;

import java.util.Scanner;

public class ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce números. Te diré cuántos no se han ordenado ascendentemente");
        System.out.println("Para parar, introduce un número negativo.");

        int n = 0, ultimoNum = 0, nDesordenados = 0;

        while ((n = sc.nextInt()) >= 0) { 
            if (n < ultimoNum) {
                nDesordenados++;
            }
            ultimoNum = n;
        }
        System.out.println(nDesordenados+" números fuera de orden");
        sc.close();
    }
}
