package Java_Bucles;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la altura del árbol (en cm)");
        int altura = sc.nextInt();
        int codigo = 0;
        int alturaMax = altura, codigoMax = 0;
        while (altura != -1) {
            if (altura > alturaMax) {
                alturaMax = altura;
                codigoMax = codigo;
            }
            codigo++;
            System.out.println("Nueva entrada");
            altura = sc.nextInt();
        }
        System.out.println("El árbol más alto tiene el código "+codigoMax+" y mide "+alturaMax+" cm");
        sc.close();
    }   
}
