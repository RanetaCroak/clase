package Java_Condicionales;

import java.util.Scanner;

public class ej12 {
    public static void main(String[] args) {
        System.out.println("Dime la hora");

        Scanner sc = new Scanner(System.in);
        System.out.print("Hora: ");
        int hora = sc.nextInt();
        
        System.out.print("Minutos: ");
        int minutos = sc.nextInt();

        System.out.print("Segundos: ");
        int segundos = sc.nextInt();

        System.out.println("Hora actual ["+hora+":"+minutos+":"+segundos+"] + 1 segundo ");
        if (segundos==59) {
            segundos=0;
            minutos++;
        }
        if (minutos==60) {
            minutos=0;
            hora++;
        }
        if (hora==24) {
            hora=0;
        }
        System.out.println("["+hora+":"+minutos+":"+segundos+"]");
        sc.close();
    }
}
