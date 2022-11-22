package Java1_conceptos_basicos;

import java.util.Scanner;

public class ej11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime las notas enteras del 1r, 2do y 3r trimestre");
        
        float suma = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.println(i+"º trimestre");
            suma += sc.nextFloat();
        }
        sc.close();

        int mediaBoletin =(int) suma/3;
        float mediaExpediente = suma/3;

        System.out.println("La nota media en el boletín es de "+mediaBoletin);
        System.out.println("En el expediente es de "+mediaExpediente);
     
    }
}
