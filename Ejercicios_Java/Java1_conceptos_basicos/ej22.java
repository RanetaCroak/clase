package Java1_conceptos_basicos;

import java.util.Scanner;

public class ej22 {
    public static void main(String[] args) {
        System.out.println("Dime Kb y te los pasaré a Mb");
        Scanner sc = new Scanner(System.in);
        float Kb = sc.nextFloat();
        System.out.println(Kb+ " Kb son igual a "+Kb/1024+" Mb");
        sc.close();
    }
}
