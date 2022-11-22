package Java_Bucles;

import java.util.Scanner;

public class ej12 {
    public static void main(String[] args) {
        System.out.println("Dime 5 calificaciones");
        Scanner sc = new Scanner(System.in);
        int suspensos = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print(i+"/5 : ");
            if (sc.nextInt()<5) {
                suspensos++;
            }  
        }
        System.out.println("Hay "+suspensos+" suspensos");
        sc.close();
    }
}
