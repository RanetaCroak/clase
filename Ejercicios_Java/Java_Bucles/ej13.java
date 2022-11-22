package Java_Bucles;

import java.util.Scanner;

public class ej13 {
    public static void main(String[] args) {
        System.out.println("Dime 6 notas");
        Scanner sc = new Scanner(System.in);
        int n = 0, aprobados = 0, condicionados = 0, suspensos = 0;
        for (int i = 1; i <= 6; i++) {
            System.out.print(i+"/6 : ");
            n = sc.nextInt();
            if (n>4) {
                aprobados++;
            } else {
                if (n == 4) {
                    condicionados++;
                } else {
                    suspensos++;
                }
            }
        }
        System.out.println("Han aprobado "+aprobados+" han suspendido "+suspensos+" y hay "+condicionados+" condicionados");
        sc.close();
    }
}
