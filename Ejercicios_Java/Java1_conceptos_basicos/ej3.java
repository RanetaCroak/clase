package Java1_conceptos_basicos;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
      
        System.out.println("Dime tu edad");

        Scanner sc = new Scanner(System.in);
        
        int edad = sc.nextInt();

        System.out.println("Al año que viene tendrás "+(edad+1));
        
        sc.close();
        
    }
    
}
