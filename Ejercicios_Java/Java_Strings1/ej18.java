package Java_Strings1;

import java.util.Scanner;

public class ej18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un nombre con formato \"Apellidos, Nombre\"");

        String nombreInicial = sc.nextLine();
        
        String nombreApellidos = nombreInicial.substring(nombreInicial.indexOf(',')+1).stripLeading() // Nombre a partir de la ","
        +" "+ nombreInicial.substring(0,nombreInicial.indexOf(',')); // + apellidos hasta la ","
                
        System.out.println("\nEl nombre queda así: \n"+nombreApellidos);
        sc.close();
    }
}
