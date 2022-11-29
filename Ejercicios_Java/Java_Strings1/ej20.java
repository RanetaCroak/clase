package Java_Strings1;

import java.util.Scanner;

public class ej20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Encriptación de textos");
        System.out.println("Introduce la frase o el texto a encriptar");

        String frase = sc.nextLine();

        System.out.println("Introduce el número de posiciones de salto");
        int codigo = sc.nextInt();

        sc.close();

        char letraFinal = 'z', letraPrimera = 'a'; // Inicio y fin del abecedario

        for (int i = 0; i < 2; i++) { // Bucle para MAYUS y minus

            for (int j = 0; j < frase.length(); j++) { // Recorrer la frase

                for (int j2 = 0; j2 < codigo; j2++) { // Desplazamientos de los caracteres
                    if (frase.charAt(j) >= letraPrimera && frase.charAt(j) <= letraFinal) {

                        frase = frase.substring(0, j) // principio de la frase
                                + ((frase.charAt(j) + 1) > letraFinal ? letraPrimera : (char) ((frase.charAt(j)) + 1)) // char encriptado
                                + frase.substring(j + 1); // resto de la frase
                    }
                }
            } 
            letraPrimera = 'A'; // Paso a mayúsculas
            letraFinal = 'Z';
        }
        System.out.println("Texto encriptado");
        System.out.println(frase);
    }
}
