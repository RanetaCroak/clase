package Java3_Metodos;

import java.util.Scanner;

public class ej1 {

    public static boolean estanOrdenados(int numero1, int numero2) {
        return numero1 < numero2;
    }
    
    public static void main(String[] args) {
        System.out.println("Introduce dos números");
        Scanner sc = new Scanner(System.in);
        System.out.println("Están ordenados? "+estanOrdenados(sc.nextInt(), sc.nextInt()));
        sc.close();
    }
}
