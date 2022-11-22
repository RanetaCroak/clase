package Java_Bucles;

public class ej14 {
    public static void main(String[] args) {
        System.out.println("Las tablas de multiplicar del 1 al 10");
        
        for (int tabla = 1; tabla <= 10; tabla++) {
            System.out.println("\nTabla del "+tabla+"\n");
            for (int i = 1; i <= 10; i++) {
                System.out.println(tabla+" x "+i+" = "+tabla*i);
            }
        }
    }
}
