package Java_Strings1;

import java.util.Scanner;

public class ej19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* TODO
          
        [ ] Preguntar
        [!] Suma un màxim de 200%
        [!] La màxima combinació son 110% ??

        [√] Gastar esta extensió

        */
        
        System.out.println("Evaluar contraseñas");
        System.out.println("* * * * * * * * * *");
        System.out.println("Criterios de seguridad: ");
        System.out.println(" - Tiene letras y números: +30% ej.: pas1");
        System.out.println(" - Tiene mayúsculas y minúsculas, y una longitud entre 4 y 5 caracteres: +30% ej.: paSSw");
        System.out.println(" - Tiene mayúsculas y minúsculas, una longitud entre 6 y 8 caracteres, y contiene algún carácter especial (como $,%, !, ?): +60% ej.: P%sSW?r");
        System.out.println(" - Tiene mayúsculas y minúsculas, una longitud mayor a 8 caracteres, y contiene algún carácter especial (como $,%, !, ?): +80% ej.: P@$$WørD!!!!1");
    }
}
