package Java1_conceptos_basicos;

import java.util.Scanner;

public class ej19 {
    public static void main(String[] args) {
        System.out.println("Dime las horas trabajadas al día");
        Scanner sc = new Scanner(System.in);
        int horas = sc.nextInt();
        final int eurosHora = 12;
        System.out.println("El salario semanal es de "+eurosHora*horas*5);
        sc.close();
    }
}
