package Java_Strings1;

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nombre");
        String nombre = sc.nextLine();

        for (int i = 0; i < nombre.length(); i++) {
            System.out.println(nombre.substring(0,i+1));
        }
        sc.close();
    }
}
