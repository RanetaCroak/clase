package Java2_Condicionales;

import java.util.Scanner;

public class ej19 {
    public static void main(String[] args) {
        System.out.println("Haz la suma e introduce el resultado");
        int n1 = (int) (Math.random()*99+1);
        int n2 = (int) (Math.random()*99+1);
        System.out.print(n1+"+"+n2+"=");
        Scanner sc = new Scanner(System.in);
        if (sc.nextInt()==n1+n2) {
            System.out.println("El resultado es correcto");
        } else {
            System.out.println("El resultado es incorrecto");
        }
        sc.close();
    }
}
