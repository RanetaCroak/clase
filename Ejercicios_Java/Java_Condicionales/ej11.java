package Java_Condicionales;

import java.util.Scanner;

public class ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime una fecha");
        System.out.print("Día: ");
        int dia = sc.nextInt();

        System.out.print("Mes: ");
        int mes = sc.nextInt();

        System.out.print("Año: ");
        int anio = sc.nextInt();

        System.out.print("La fecha "+dia+"/"+mes+"/"+anio+" es ");
        
        boolean valido = true;
        
        int tipoMes = 0;

        switch (mes) {
            case 1,3,5,7,8,10,12: // 31
                tipoMes = 31;
                break;
        
            case 4,6,9,11: // 30
                tipoMes = 30;
                break;
        
            case 2: // 28
                tipoMes = 28;
                break;
        
            default:
                valido = false;
                break;
        }

        if (dia < 1 || dia > tipoMes) {
            valido = false;
        }
        
        if (valido) {
            System.out.println("válida");
        } else {
            System.out.println("inválida");
        }

        System.out.println();
        sc.close();
    }
}
