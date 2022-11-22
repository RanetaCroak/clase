package Java_Condicionales;

import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        System.out.println("Dime tres números");
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce número");
        int n1 = sc.nextInt();
        System.out.println("Introduce número");
        int n2 = sc.nextInt();
        System.out.println("Introduce número");
        int n3 = sc.nextInt();

        int mayor=0,medio=0,menor=0;

        if (n1 > n2) { // 123,132,213,231,312,321
            if (n2 > n3) {
                mayor = n1;
                medio = n2;
                menor = n3;
            } else { // n2 es menor
                menor = n2;
                if (n1 > n3) {
                    mayor = n1;
                    medio = n3;
                } else {
                    mayor = n3;
                    medio = n1;
                }
            }
        } else { // n2 > n1
            if (n1 > n3) {
                mayor = n2;
                medio = n1;
                menor = n3;
            } else { // n1 es menor
                menor = n1;
                if (n2 > n3) {
                    mayor = n2;
                    medio = n3;
                } else {
                    mayor = n3;
                    medio = n2;
                }
            }
        } 

        System.out.println("Los números, ordenados de mayor a menor son: "+mayor+" "+medio+" "+menor);
        sc.close();
    }
}
