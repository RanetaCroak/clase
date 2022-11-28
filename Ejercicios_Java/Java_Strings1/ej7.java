package Java_Strings1;

import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime 10 nombres");
        String[] nombres = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1 + "/10");
            nombres[i] = sc.nextLine();
        }

        System.out.println("Ahora introduce nombres y te diré si están en la lista. Para salir, escribe \"fin\"");
        String res = "";
        boolean apareceNombre = false;
        int pos = 0;
        do {
            res = sc.nextLine();
            if (res.equals("fin")) {

            } else {
                for (int j = 0; j < nombres.length; j++) {

                    if (nombres[j].equalsIgnoreCase(res)) {
                        apareceNombre = true;
                        pos = j + 1;
                    }
                }
                if (apareceNombre) {
                    System.out.println(res + " está en la lista, en la posición " + pos + "/10");
                    apareceNombre = false;
                } else {
                    System.out.println("El nombre " + res + " NO está en la lista");
                }
            }
        } while (!(res.equalsIgnoreCase("fin")));
        sc.close();
    }
}
