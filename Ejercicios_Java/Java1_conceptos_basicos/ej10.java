package Java1_conceptos_basicos;

import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la venta de kilos del semestre y te daré beneficios anuales");

        float manzanas = 0;
        float peras = 0;

        for (int i = 1; i <= 2; i++) {
            System.out.println("Trimestre nº"+i);

            System.out.println("¿Cuántos kg de manzanas?");
                manzanas = sc.nextFloat();
            
            System.out.println("Ahora dime los kg de peras");
                peras = sc.nextFloat();
        }
        
        final float kgManzanas = 2.35f;
        final float kgPeras = 1.95f;

        System.out.println("Los beneficios anuales son de "+((peras*2*kgPeras)+(manzanas*2*kgManzanas))+" euros" );
        sc.close();
    }
}
