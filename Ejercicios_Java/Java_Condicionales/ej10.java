package Java_Condicionales;

import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        System.out.println("Introduce un día de la semana por número");
        Scanner sc = new Scanner(System.in);
        int dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
        
            case 2:
                System.out.println("Martes");
                break;
        
            case 3:
                System.out.println("Miércoles");
                break;
        
            case 4:
                System.out.println("Jueves");
                break;
        
            case 5:
                System.out.println("Viernes");
                break;
        
            case 6:
                System.out.println("Sábado");
                break;
        
            case 7:
                System.out.println("Domingo");
                break;
        
            default:
            System.out.println("El número no es válido");
                break;
        }
    sc.close();
    }
}
