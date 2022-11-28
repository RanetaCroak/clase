package Java_Strings1;

import java.util.Scanner;

public class ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String frase = sc.nextLine();

        while (frase.contains("  ")) { // Eliminar espacios excesivos
            frase = frase.replace("  ", " ");
        }

        String[] palabras = frase.split(" "); // Convertir frase a array de palabras

        System.out.println("\nIntroduce un número para eliminar la palabra en esa posición");

        for (String word : palabras) {
            System.out.print(word+" ");
        }

        System.out.println();
        
        for (int i = 0; i < palabras.length; i++) {
            System.out.print(i);
            for (int j = 0; j < palabras[i].length(); j++) {
                System.out.print(" ");
            }
        }

        System.out.print("\n\nPalabra a eliminar: ");
        int numPos = sc.nextInt();

        System.out.println("\nSe ha eliminado la palabra \""+palabras[numPos]+"\"");
        System.out.println("Este es el resultado: \n");

        for (String word : palabras) {
            if (!(word.equals(palabras[numPos]))) {
                
                System.out.print(word+" ");
            }
        }

        sc.close();
    }
}
