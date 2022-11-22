package Java_Bucles;

import java.util.Scanner;

public class ej15 {
    public static void main(String[] args) {
        System.out.println("Dime un número y te dibujaré un triángulo");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
