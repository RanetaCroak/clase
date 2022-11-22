package Java1_conceptos_basicos;

import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un número");
        
        boolean par = false;
        int n = sc.nextInt();

        if (n%2==0) {
            par = true;
        }

        if (par) {
            System.out.println("Es par");
        }
        else
            System.out.println("No es par");
            
        sc.close();
    }
}
