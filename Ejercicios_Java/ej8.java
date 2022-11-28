package Java_Strings1;

import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una palabra y te diré si es un palíndromo");
        String palabra = sc.nextLine();
        String palabraReversa = "";
        sc.close();

        for (int i = 0; i < palabra.length(); i++) {
            palabraReversa += palabra.charAt((palabra.length()-1)-i);
        }
        if (palabraReversa.equalsIgnoreCase(palabra)) {
            System.out.println("Esta palabra es un palíndromo!");
        } else {
            System.out.println("Esta palabra NO es un palíndromo");
        }
        System.out.println(palabra+" <-> "+palabraReversa);
    }
}
