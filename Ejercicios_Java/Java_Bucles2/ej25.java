import java.util.Scanner;

public class ej25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean salir = false;
        int opcion = 0;
        int base = 0, altura = 0;
        do {
            System.out.println("\nDIBUJA FIGURAS GEOMÉTRICAS");
            System.out.println("* * * * * * * * * * * * * * *");
            System.out.println("1.- Cuadrado relleno");
            System.out.println("2.- Cuadrado vacío");
            System.out.println("3.- Rectángulo relleno");
            System.out.println("4.- Rectángulo vacío");
            System.out.println("5.- Triángulo rectángulo");
            System.out.println("6.- Salir");
            System.out.println("* * * * * * * * * * * * * * *");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce la base");
                    base = sc.nextInt();
                    for (int i = 0; i < base; i++) {
                        for (int j = 0; j < base; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.println("Introduce la base");
                    base = sc.nextInt();
                    for (int i = 0; i < base; i++) {
                        for (int j = 0; j < base; j++) {
                            if (j == 0 || j == base || i == 0 || i == base - 1 || j == base - 1) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Introduce la base");
                    base = sc.nextInt();
                    System.out.println("Introduce la altura");
                    altura = sc.nextInt();
                    for (int i = 0; i < altura; i++) {
                        for (int j = 0; j < base; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("Introduce la base");
                    base = sc.nextInt();
                    System.out.println("Introduce la altura");
                    altura = sc.nextInt();
                    for (int i = 0; i < altura; i++) {
                        for (int j = 0; j < base; j++) {
                            if (j == 0 || j == base - 1 || i == 0 || i == altura - 1) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 5:
                    System.out.println("Introduce la base");
                    base = sc.nextInt();
                    for (int i = 0; i < base; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 6:
                    System.out.println("Saliendo...\n");
                    salir = true;
                    break;

                default:
                    System.out.println("\n# # # # # # # # # # # # # # # # # # # # # # # # # #");
                    System.out.println("# Opción inválida. Introduce un número del 1 al 6 #");
                    System.out.println("# # # # # # # # # # # # # # # # # # # # # # # # # #");
                    break;
            }

        } while (!salir);
        sc.close();
    }
}
