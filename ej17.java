import java.util.Scanner;

public class ej17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número binario y lo pasaré a decimal");
        int n = sc.nextInt();
        int potencia = 1 ;
        int decimal = 0;
        
        for (int nAux = n; nAux >= 1; nAux/=10) {
            
            decimal += potencia * nAux%10;
            potencia *= 2;
        }
        
        System.out.println("El número "+n+" en decimal es "+decimal);
        sc.close();
    }
}
