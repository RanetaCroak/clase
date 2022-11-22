package Java_Condicionales;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime dos números enteros");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if (n1 == n2) {
            System.out.println("Son iguales");
        } 
        else {
            System.out.println("No son iguales");
        }

        sc.close();
    }
}
