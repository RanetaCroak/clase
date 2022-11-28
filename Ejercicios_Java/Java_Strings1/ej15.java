package Java_Strings1;

import java.util.Scanner;

public class ej15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String frase = sc.nextLine();

        while (frase.contains("  ")) { // Eliminar espacios excesivos
            frase = frase.replace("  ", " ");
        }

        String[] palabras = frase.split(" "); // Convertir frase a array de palabras

        System.out.println("Lan frase tiene "+palabras.length+" palabras");
        sc.close();
    }
}
