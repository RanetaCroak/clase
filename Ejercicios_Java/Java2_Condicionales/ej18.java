package Java2_Condicionales;

import java.util.Scanner;

public class ej18 {
    public static void main(String[] args) {
        System.out.println("Dime un número");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        n = n<0 ? n*-1 : n; // var = condicion ? true : false;

        System.out.println("El valor absoluto es " + n);
        sc.close();
    }
}
