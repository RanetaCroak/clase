package Java_Strings1;

import java.util.Scanner;

public class ej17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String frase = sc.nextLine();

        while (frase.contains("  ")) { // Eliminar espacios excesivos
            frase = frase.replace("  ", " ");
        }

        String[] palabras = frase.split(" "); // Convertir frase a array de palabras 

        String fraseInvertida = "";

        for (int i = 0; i < palabras.length; i++) {
            fraseInvertida += palabras[(palabras.length-1)-i]+" ";
        }

        fraseInvertida.stripTrailing();

        System.out.println("La frase invertida quedaría así: \n"+fraseInvertida);
        sc.close();
    }
}
