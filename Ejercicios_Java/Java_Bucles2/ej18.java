import java.util.Scanner;

public class ej18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la hora de un reloj (ej.: 17:48:13)");
        System.out.println("Horas");
        int horas = sc.nextInt();

        System.out.println("Minutos");
        int minutos = sc.nextInt();

        System.out.println("Segundos");
        int segundos = sc.nextInt();

        System.out.print("Son las ");
        imprimirHora(horas, minutos, segundos);

        System.out.println("¿En cuántos segundos la quieres aumentar?");
        int segundosAumento = sc.nextInt();

        for (int i = 0; i < segundosAumento; i++) {
            if (segundos < 59) {
                segundos++;
            } else {
                segundos = 0;

                if (minutos < 59) {
                    minutos++;

                } else {
                    minutos = 0;
                    if (horas < 23) {
                        horas++;

                    } else {
                        horas = 0;
                    }
                }
            }
        }
        System.out.print("Pasan a ser las ");
        imprimirHora(horas, minutos, segundos);
        sc.close();
    }
    // Metodos
    public static void formatoTiempo(int formatoTiempo) { // imprimir tot
        if (formatoTiempo<10) {
            System.out.print("0");
        }
        System.out.print(formatoTiempo);
    }

    public static void imprimirHora(int horas, int minutos, int segundos) {
       formatoTiempo(horas);
        System.out.print(":");

       formatoTiempo(minutos);
        System.out.print(":");

       formatoTiempo(segundos);

        System.out.println();
    }
}