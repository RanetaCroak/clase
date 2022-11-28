package Java_Strings1;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        System.out.println("Dime tu nombre");
        Scanner sc = new Scanner(System.in);

        String nombre = sc.nextLine();
        nombre=nombre.substring(0,1).toUpperCase()+(nombre.substring(1).toLowerCase()); // 1º letra mayus, resto minusculas
        System.out.println("Hola "+nombre);
        sc.close();
    }
}
