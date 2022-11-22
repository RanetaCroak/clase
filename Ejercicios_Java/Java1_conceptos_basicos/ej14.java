package Java1_conceptos_basicos;

import java.util.Scanner;

public class ej14 {
    public static void main(String[] args) {
        
        System.out.println("Dime una cantidad de pesetas y te la convertiré a euros");
        Scanner sc = new Scanner(System.in);

        final float conversion = 166.3860f;

        float pesetas = sc.nextFloat();
        System.out.println(pesetas+" pesetas equivalen a "+pesetas/conversion+" euros");
        sc.close();

    }
}
