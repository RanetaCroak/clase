package Java_Bucles;

import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        System.out.println("Dime 10 números y te diré la media");
        int suma = 0;
        Scanner sc = new Scanner(System.in);  

        for (int i = 1; i <= 10; i++) {
            System.out.print("Nº"+i+"/10: ");
            suma += sc.nextInt();
        }
        System.out.println("La media de los números es "+((float) suma/10));
        sc.close();
    }
}
