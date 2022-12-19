package Java3_Metodos;

import java.util.Scanner;

public class ej2 {

    public static void imprimeCaracter(char caracter, int veces) {
        for (int i = 0; i < veces; i++) {
            System.out.print(caracter);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un caracter");
        char caracter = sc.next().charAt(0);
        System.out.println("Ahora dime un número");
        int num = sc.nextInt();
        sc.close();

        imprimeCaracter(caracter, num);
    }
}
