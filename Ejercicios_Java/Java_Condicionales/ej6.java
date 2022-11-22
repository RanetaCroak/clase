package Java_Condicionales;

import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        System.out.println("Dime números y te los ordenaré decrecientemente");
        Scanner sc = new Scanner(System.in);

        System.out.print("Primer número: ");
        int n1 = sc.nextInt();

        System.out.print("Segundo número: ");
        int n2 = sc.nextInt();
        if (n1 == n2) {
            System.out.println("Los números son iguales. "+n1+" "+n2);
        } else {
            
            if (n1 > n2) {
                System.out.println(n1+" "+n2);
            } else {
                System.out.println(n2+" "+n1);
            }
        }
        sc.close();
    }
}
