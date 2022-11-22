package Java2_Condicionales;

import java.util.Scanner;

public class ej15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad de comida diaria en kg");
        float comidaDiaria = sc.nextFloat();
        System.out.println("Introduce el número de animales");
        float numAnimales = sc.nextFloat();
        System.out.println("Introduce la cantidad de kilos por animal");
        float kilosPorAnimal = sc.nextFloat(); 
        
        if (numAnimales==0) {
            System.out.println("No hay animales");
        } else {
            if (comidaDiaria/numAnimales>=kilosPorAnimal) {
                System.out.println("Disponemos de alimento suficiente para cada animal");
            } else {
                System.out.println("No disponemos de suficiente comida, cada animal tendrá que comer "+comidaDiaria/numAnimales+" kg");
            }
        }
        sc.close();
    }
}
