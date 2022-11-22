package Java1_conceptos_basicos;

import java.util.Scanner;

public class ej15 {
    public static void main(String[] args) {
    
        System.out.println("Dime dos números");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println(n1+" + "+n2+" = "+(n1 + n2));
        System.out.println(n1+" - "+n2+" = "+(n1 - n2));
        System.out.println(n1+" * "+n2+" = "+(n1 * n2));
        System.out.println(n1+" / "+n2+" = "+(n1 / n2));
        sc.close();
    }
}
