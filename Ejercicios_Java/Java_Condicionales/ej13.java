package Java_Condicionales;

import java.util.Scanner;

public class ej13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime una fecha");
        System.out.print("Día: ");
        int dia = sc.nextInt();

        System.out.print("Mes: ");
        int mes = sc.nextInt();

        System.out.print("Año: ");
        int anio = sc.nextInt();

        System.out.print("Si la fecha es "+dia+"/"+mes+"/"+anio+". Al día siguiente será ");
        
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
        }
        dia++;
        if (dia == tipoMes+1) {
            dia = 1;
            mes++;
        }
        if (mes == 13) {
            mes = 1;
            anio++;
        }
        System.out.println(dia+"/"+mes+"/"+anio);
        sc.close();
    }
}
