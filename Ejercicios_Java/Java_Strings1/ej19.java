package Java_Strings1;

import java.util.Scanner;

public class ej19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Evaluar contraseñas");
        System.out.println("* * * * * * * * * *");
        System.out.println("Criterios de seguridad: ");
        System.out.println(" - Tiene letras y números: +30% ej.: pas1");
        System.out.println(" - Tiene mayúsculas y minúsculas, y una longitud entre 4 y 5 caracteres: +30% ej.: paSSw");
        System.out.println(
                " - Tiene mayúsculas y minúsculas, una longitud entre 6 y 8 caracteres, y contiene algún carácter especial (como $,%, !, ?): +60% ej.: P%sSW?r");
        System.out.println(
                " - Tiene mayúsculas y minúsculas, una longitud mayor a 8 caracteres, y contiene algún carácter especial (como $,%, !, ?): +80% ej.: P@$$WørD!!!!1");

        System.out.println("Introduce una contraseña");
        String contrasenia = sc.nextLine();
        sc.close();
        boolean letras = false, numeros = false, mayus = false, minus = false, especial = false;
        int seguridadContra = 0;

        for (int i = 0; i < contrasenia.length(); i++) {
            if (Character.isLetter(contrasenia.charAt(i))) {
                letras = true;
            }
            if (Character.isDigit(contrasenia.charAt(i))) {
                numeros = true;
            }
            if (Character.isUpperCase(contrasenia.charAt(i))) {
                mayus = true;
            }
            if (Character.isLowerCase(contrasenia.charAt(i))) {
                minus = true;
            }
            if (!(Character.isDigit(contrasenia.charAt(i)) || Character.isLetter(contrasenia.charAt(i)))) {
                especial = true;
            }
        }

        if (letras && numeros) {
            seguridadContra += 30;
        }
        if (mayus && minus) {
            if (contrasenia.length() > 3 && contrasenia.length() < 6) {
                seguridadContra += 30;
            } else {
                if (especial) {
                    if (contrasenia.length() < 9) {
                        seguridadContra += 60;
                    } else {
                        seguridadContra += 80;
                    }
                }
            }
        }
        System.out.println("La puntuación de tu contraseña es de " + seguridadContra);

        switch (seguridadContra) {
            case 0:
            System.out.println("Tu contraseña es muy débil");
                break;
        
            case 30:
            System.out.println("Tu contraseña es un poco débil");
                break;
        
            case 60:
            System.out.println("Tu contraseña tiene una seguridad media");
                break;
        
            case 80:
            System.out.println("Tu contraseña tiene una seguridad fuerte");
                break;
        
            case 90:
            System.out.println("Tu contraseña es muy fuerte");
                break;
        
            case 110:
            System.out.println("Tu contraseña es increíblemente fuerte");
                break;
        }
    }
}
