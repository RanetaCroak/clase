package Java1_conceptos_basicos;

import java.util.Scanner;

public class ej21 {
    public static void main(String[] args) {
        System.out.println("Dime Mb y te los pasaré a Kb");
        Scanner sc = new Scanner(System.in);
        float Mb = sc.nextFloat();
        System.out.println(Mb+ " Mb son igual a "+Mb*1024+" Kb");
        sc.close();
    }
}
