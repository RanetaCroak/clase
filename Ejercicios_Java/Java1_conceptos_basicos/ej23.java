package Java1_conceptos_basicos;

import java.util.Scanner;

public class ej23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la nota del primer examen");
        float nota = (sc.nextFloat() * 0.4f); // La primera vale un 40%

        System.out.println("¿Qué nota quieres sacar en el trimestre?");
        float trimestre = sc.nextFloat(); // 10

        float notaNecesaria = (trimestre-nota)/0.6f; // La segunda vale 60%
        System.out.println("Necesitas sacar un "+notaNecesaria+" para sacar un "+trimestre);
        sc.close();
    }
}
