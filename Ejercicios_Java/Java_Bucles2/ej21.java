import java.util.Scanner;

public class ej21 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime dos números para encontrar su máximo común divisor");
        System.out.print("Nº 1: ");
        int n1 = sc.nextInt();
        System.out.print("Nº 2: ");
        int n2 = sc.nextInt();
        sc.close();

        int menor = n1 < n2 ? n1 : n2;
        
        for (; menor > 0 && !(n1 % menor == 0 && n2 % menor == 0); menor--);

        System.out.println("El mcd de "+n1+" y "+n2+" es "+menor);
    }
}
