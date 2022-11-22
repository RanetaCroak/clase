package Java_Bucles;

import java.util.Scanner;

public class ej11 {
    public static void main(String[] args) {
        System.out.println("Dime un número y te diré su factorial");
        Scanner sc = new Scanner(System.in);

        double factorial = 1;
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de "+n+" es "+(int) factorial);
        sc.close();
    }
}
