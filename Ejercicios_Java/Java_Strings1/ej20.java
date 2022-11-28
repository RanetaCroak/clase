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

        for (char minus = 'a' ; minus <= 'z'; minus++) {
            
            if (minus + codigo > 'z') {
                frase = frase.replace(minus, (char) ((minus+codigo)-'z'+'a'));
            } else {
                frase = frase.replace(minus, (char) (minus+codigo));
            }
            if (minus + codigo > 'Z') {
                frase = frase.replace(minus, (char) ((minus+codigo)-'Z'+'A'));
            } else {
                frase = frase.replace(minus, (char) (minus+codigo));
            }
        }
        System.out.println("Texto encriptado");
        System.out.println(frase);
    }
}
