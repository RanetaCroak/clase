package Java_Bucles;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos a jugar al número secreto (1 - 100)");
        System.out.println("Introduce números y te indicaré \"mayor\" o \"menor\" hasta que aciertes");
        System.out.println("Para rendirte, introduce un -1");
        
        int nSecreto = (int) (Math.random()*100+1);
        int intento = 0;
        System.out.println("Empecemos, introduce un número");
        intento = sc.nextInt();
        do {
            if (intento == -1) {
                System.out.println("Te rendiste, fin del juego");
                System.out.println("El número era "+nSecreto);
                break;
            }
            if (intento == nSecreto) {
                System.out.println("Acertaste!");
            } else {

                if (intento < nSecreto) {
                    System.out.println("Este número es menor");
                } else {
                    System.out.println("Este número es mayor");
                }

                System.out.println("Prueba otra vez");
                intento = sc.nextInt();
            }
        } while (nSecreto != intento);

        sc.close();
    }
}
