package Java_Bucles;

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Juego de la suma");
        System.out.println("Introduce la solución correcta para seguir el juego");
        int n1 = 0, n2 = 0;
        int resultadoCorrecto = 0, resultado = 0, correctas = 0;
        
        
        do {
            n1 = (int) (Math.random()*100+1);
            n2 = (int) (Math.random()*100+1);
            System.out.println(n1+" + "+n2+" = ?");
            resultadoCorrecto = n1+n2;
            resultado = sc.nextInt();
            correctas += resultado==resultadoCorrecto? 1 : 0 ;
        } while (resultado == resultadoCorrecto);

        System.out.println("Has acertado "+correctas+" veces.");
    sc.close();
    }
}
