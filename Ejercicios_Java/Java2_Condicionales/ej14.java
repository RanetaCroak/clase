package Java2_Condicionales;

import java.util.Scanner;

public class ej14 {
    public static void main(String[] args) {
        System.out.println("Dime tu DNI y te diré la letra");
        Scanner sc = new Scanner(System.in);
        int dni = sc.nextInt();
        
        char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

        System.out.println("Tu dni completo es "+dni+letras[dni%23]);
        
        sc.close();
    }
}
