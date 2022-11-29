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

        char letraFinal = 'z', letraPrimera = 'a'; // Inicio y fin del abecedario

        for (int i = 0; i < 2; i++) { // Bucle para MAYUS y minus
            
            for (int j = 0; j < frase.length(); j++) {
                /*
                    TODO

                    [ ] Comprobar si el caracter es una letra
                    [!] Comprobar bugs al pasar al segundo bucle
                 */
                
                if ((frase.charAt(j) + codigo) > letraFinal) {
                    frase = frase.substring(0, j) // principio de la frase
                    + (char) (letraPrimera+(letraFinal-codigo)) // char encriptado
                    + frase.substring(j+1); // resto de la frase
                } else {
                    frase = frase.substring(0, j) // principio de la frase
                    + (char) (frase.charAt(j)+codigo) // char encriptado
                    + frase.substring(j+1); // resto de la frase
                }
                letraPrimera = 'A'; // Paso a mayúsculas
                letraFinal = 'Z'; 
            }
        }
        System.out.println("Texto encriptado");
        System.out.println(frase);
    }
}
