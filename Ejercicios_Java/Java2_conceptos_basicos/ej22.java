package Java2_conceptos_basicos;

import java.util.Scanner;

public class ej22 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una longitud en metros");
        float centimetros = (int)(sc.nextFloat()*100);  // pasa automaticamente a valores int para eliminar los decimales
        System.out.println("La longitud en cm es "+(int)centimetros);

        sc.close();
    }
}
