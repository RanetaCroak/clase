package Java2_conceptos_basicos;

import java.util.Scanner;

public class ej16 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cantidad de segundos");
        int segundos = sc.nextInt();
        int segundosCopia = segundos;

        int horas = (segundos-segundos%3600)/3600;
        segundos -= horas*3600;  

        int minutos = (segundos-segundos%60)/60;
        segundos -= minutos*60; 
        
        System.out.println("Hay "+horas+" horas "+minutos+" minutos y "+segundos+" segundos en "+segundosCopia+" segundos");
        sc.close();
    }

}
