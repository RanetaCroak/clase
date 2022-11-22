import java.util.Scanner;

public class ej23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número y te diré su raíz cuadrada");
        int n = sc.nextInt();
        int rCuadrada = 1;
        
        while ((int) Math.pow(rCuadrada+1, 2)<=n) {
            rCuadrada++;
        }

        System.out.print("La raíz cuadrada de "+n+" es "+rCuadrada);
        System.out.println((int) Math.pow(rCuadrada, 2)!=n?" con un resto de "+(n-(int) Math.pow(rCuadrada, 2)):"");
        sc.close();
    } 
}
