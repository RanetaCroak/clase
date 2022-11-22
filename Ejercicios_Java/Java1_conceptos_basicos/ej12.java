package Java1_conceptos_basicos;

import java.util.Scanner;

public class ej12 {
    public static void main(String[] args) {
      
        int producto = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime 2 números");
        for (int i = 0; i < 2; i++) {
            System.out.println("Número "+(i+1));
            producto *= sc.nextInt();
        }
        System.out.println("La multiplicación de estos números es igual a "+producto);
        sc.close();
    }
}
