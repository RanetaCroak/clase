<<<<<<< Updated upstream:Ejercicios_Java/Java_Bucles2/ej16.java


import java.util.Scanner;

public class ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número en base 10 y lo pasaré a binario (Base 2)");
        int n = sc.nextInt();
        int numeroDigitos = 1;
        String octetos = "";

        if (n<0) { // Paso a valor absoluto en caso de negativo
            n*=-1;
            System.out.println("No me valen los negativos, mejor te lo paso a positivo...");
        }

        System.out.println("Resultado binario (Dígito por línea)");

        int potencia = 1, suma = 0, digito = 0;
        while (potencia * 2 <= n) { // Cálculo de las potencias utilizadas, siguiendo TFN inverso
            potencia *= 2;                           // ([...] 128 64 32 16 8 4 2 1)
            numeroDigitos++;
        }

        int contadorEspacios = numeroDigitos%8; // Espaciado para la string por octetos

        while (potencia>=1) { // Pasa por todas las potencias para imprimir su dígito equivalente 1 || 2
            System.out.println(digito=potencia+suma <= n ? 1:0); // Si la potencia se pasa del nº, devolverá 0
            suma+=potencia*digito;
            potencia/=2;
            
            if (numeroDigitos > 8) { // Contador de espacios en caso de tener >8 carácteres
                if (contadorEspacios == 0) {                  
                    octetos+=" ";
                    contadorEspacios = 8;
                }
                contadorEspacios--;
            }

            octetos += digito; // Se van añadiendo los números a la string
        }
        System.out.println("El número decimal "+n+" en octetos es "+octetos+" y consta de "+numeroDigitos+" dígitos");
        sc.close();
    }
}
=======
package Java.Java3_Bucles;

import java.util.Scanner;

public class ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número en base 10 y lo pasaré a binario (Base 2)");
        int n = sc.nextInt();
        int numeroDigitos = 1;
        String octetos = "";

        if (n<0) { // Paso a valor absoluto en caso de negativo
            n*=-1;
            System.out.println("No me valen los negativos, mejor te lo paso a positivo...");
        }

        System.out.println("Resultado binario (Dígito por línea)");

        int potencia = 1, suma = 0, digito = 0;
        while (potencia <= n && potencia * 2 <= n) { // Cálculo de las potencias utilizadas, siguiendo TFN inverso
            potencia *= 2;                           // ([...] 128 64 32 16 8 4 2 1)
            numeroDigitos++;
        }

        int contadorEspacios = numeroDigitos%8; // Espaciado para la string por octetos

        while (potencia>=1) { // Pasa por todas las potencias para imprimir su dígito equivalente 1 || 2
            System.out.println(digito=potencia+suma <= n ? 1:0); // Si la potencia se pasa del nº, devolverá 0
            suma+=potencia*digito;
            potencia/=2;
            
            if (numeroDigitos > 8) { // Contador de espacios en caso de tener >8 carácteres
                if (contadorEspacios == 0) {                  
                    octetos+=" ";
                    contadorEspacios = 8;
                }
                contadorEspacios--;
            }

            octetos += digito; // Se van añadiendo los números a la string
        }
        System.out.println("El número decimal "+n+" en octetos es "+octetos+" y consta de "+numeroDigitos+" dígitos");
        sc.close();
    }
}
>>>>>>> Stashed changes:Java/Java3_Bucles/ej16.java
