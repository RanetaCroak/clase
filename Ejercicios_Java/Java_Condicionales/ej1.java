package Java_Condicionales;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número");
            if (sc.nextInt()%2==0)
            System.out.println("El número es par");
            else{
                System.out.println("El número es impar");
            }
        sc.close();
    }
}
