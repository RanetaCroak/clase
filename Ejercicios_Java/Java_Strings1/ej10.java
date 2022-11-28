package Java_Strings1;

import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        do {
            
            System.out.println("* * * * * * * * * * * * * ");
            System.out.println("* Selecciona una opción * ");
            System.out.println("* * * * * * * * * * * * * ");
            System.out.println("* 1. - Saludar          * ");
            System.out.println("* 2. - Salir            * ");
            System.out.println("* * * * * * * * * * * * * ");

            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println("Hola!");
            }
        } while (opcion!=2);
        sc.close();
    }
}
