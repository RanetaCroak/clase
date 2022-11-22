package Java2_Condicionales;

import java.util.Scanner;

public class ej20 {
    public static void main(String[] args) {
        System.out.println("Haz la operación e introduce el resultado");
        int n1 = (int) (Math.random()*99+1);
        int n2 = (int) (Math.random()*99+1);
        int operacion = (int) (Math.random()*3+1);
        int resultado = 0;
        System.out.print(n1);
        switch (operacion) {
            case 1:
                System.out.print("+");
                resultado = n1+n2;
                break;
        
            case 2:
                System.out.print("*");
                resultado = n1*n2;
                break;
        
            case 3:
                System.out.print("-");
                resultado = n1-n2;
                break;
        }
        System.out.print(n2+"=");

        Scanner sc = new Scanner(System.in);
        if (sc.nextInt()==resultado) {
            System.out.println("El resultado es correcto");
        } else {
            System.out.println("El resultado es incorrecto");
        }
        sc.close();
    }
}
