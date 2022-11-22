package Java2_Condicionales;

import java.util.Scanner;

public class ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entre 0 y 9999");
        int n = sc.nextInt();

        if (n<0 || n > 9999) {
            System.out.println("El número no es válido");
        } else {
            System.out.print("El número "+n+" ");
            boolean noCapicua = false;
            if (n<10) {
                // es capicua
            } else if (n<100) { // 99
                if (n/10 == n%10) {
                    //es capicua
                } else {
                    noCapicua = true;
                }
            } else if (n<1000) { 
                if (n/100 == n%10) {
                    //es capicua
                } else {
                    noCapicua = true;
                }
            } else { 

                if (n/1000 == n%10) { // dígito 1 == último dígito
                    //es capicua
                } else {
                    noCapicua = true;
                } 
                if (n/100%10 == n/10%10) { // dígito 2 == segundo último
                    //es capicua
                } else {
                    noCapicua = true;
                } 
            } 
            if (noCapicua) {
                System.out.print("no ");
            }
            System.out.println("es capicua");
        }
        sc.close();
    }
}
