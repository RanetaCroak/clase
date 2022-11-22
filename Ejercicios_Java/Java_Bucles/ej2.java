package Java_Bucles;

import java.util.Scanner;

public class ej2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Estadística de edades. Introduce un número negativo para finalizar.");
        
        System.out.println("Introduce edad: ");
        int edad = sc.nextInt();
        int suma = 0, media = 0, nAlumnos = 0, mayoresEdad = 0;
        while (edad >= 0) {

            nAlumnos++;

            if (edad>17) {
                mayoresEdad++;
            }

            suma+=edad;
            media=suma/nAlumnos;
            
            System.out.println("\nNº alumnos: "+nAlumnos+"\nMayores de edad: "+mayoresEdad+"\nSuma edades: "+suma+"\nMedia: "+media);

            System.out.println("\nNueva entrada:");
            edad = sc.nextInt();
        }
        System.out.println(edad+" es un número negativo. Saliendo...");
        sc.close();
    }
}