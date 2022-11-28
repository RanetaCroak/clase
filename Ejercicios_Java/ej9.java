package Java_Strings1;

import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombres. Para parar, pulsa Intro, sin escribir nada");
        
        String[] nombres = new String[5];
        String letra = "";
        int tope = 0;
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Nuevo nombre: ");
            nombres[i] = sc.nextLine();
            if (nombres[i].isEmpty()) {    
                tope = i;          
                break;
            }
        } 
        do { 
            System.out.println("Dime una letra y te mostraré los nombres que comiencen por esa letra. \nIntroduce \"fin\" para finalizar.");
            letra = sc.nextLine();
            for (int j = 0; j < tope; j++) { // i cannot be resolved to a variable
                if (nombres[j].startsWith(letra) ) {
                    System.out.println(nombres[j]);
                }   
            }
        } while (!(letra.equalsIgnoreCase("fin")));
        sc.close();
    }
}
