package Java1_conceptos_basicos;

import java.util.Scanner;

public class ej13 {
    public static void main(String[] args) {
        System.out.println("Dime una cantidad de euros y te la convertiré a pesetas");
        Scanner sc = new Scanner(System.in);

        final float conversion = 166.3860f;

        float euros = sc.nextFloat();
        System.out.println(euros+" euros equivalen a "+euros*conversion+" pesetas");
        sc.close();
    }
}
