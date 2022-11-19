import java.util.Scanner;

public class ej19 {
    public static void main(String[] args) {
        System.out.println("Dime un número");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean primo = true;
        int nPrimos = 0;

        for (int i = 1; i <= n; i++) { // del 1 hasta el n pedido
            for (int j = 1; j <= i; j++) { // comprobacion de primos
                if (i%j==0 && (j != 1 && j != i)) { // Divisible y (No es ni 1 ni él mismo)
                    primo = false;
                }
            }
            System.out.print(i+" -> ");
            if (!primo) {
                System.out.print("no ");
                primo = true;
            } else {
                nPrimos ++;
            }
            System.out.println("primo");
        }
        System.out.println("Resultan un total de "+nPrimos+" números primos");
        sc.close();
    }
}
