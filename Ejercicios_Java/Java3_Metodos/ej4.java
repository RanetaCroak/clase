package Java3_Metodos;

import java.util.Scanner;

public class ej4 {
    public static void imprimir(Scanner sc) {
        System.out.println("Opcion 1 Calcula el cuadrado. Pide nº y llama a método.");
        System.out.println("Opcion 2 Calcula el cubo. Pide nº y llama a método.");
        System.out.println("Opcion 3 Calcula la potencia. Pide base y exponente y llama a método");
        System.out.println("Opcion 4 Salir");
    
        boolean salir = false;
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Dime el número");
                System.out.println(cuadrado(sc.nextInt()));
                
                break;
        
            case 2:
                System.out.println("Dime el número");
                System.out.println(cuadrado(cuadrado(sc.nextInt())));
            
                break;
        
            case 3:
                
                break;
        
            case 4:
                System.out.println("Salir");
                salir = true;
                break;
        
            default:
                System.out.println("Entrada errónea, introduce un número del 1 al 4");
                break;
        }
        if (salir = false) {
            imprimir(sc);
        }
    }

    public static int cuadrado(int n) {
        return n * 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        imprimir(sc);
    }
}
