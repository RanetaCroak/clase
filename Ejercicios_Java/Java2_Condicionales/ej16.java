package Java2_Condicionales;

import java.util.Scanner;

public class ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un número del 1 al 99");

        int n = sc.nextInt();
        if (n<1 || n>99) {
            System.out.println("El número no es válido");
        } else {
            System.out.print("El número "+n+" se escribe como ");
            if (n>15) {
                switch (n/10) {
                    case 1:
                        System.out.print("dieci");
                        break;
                
                    case 2:
                        if (n==20) {
                            System.out.print("veinte");
                        } else {
                            System.out.print("veinti");
                        }
                    break;
                
                    case 3:
                        System.out.print("treinta"); // y
                        break;
                
                    case 4:
                        System.out.print("cuarenta");
                        break;
                
                    case 5:
                        System.out.print("cincuenta");
                        break;
                
                    case 6:
                        System.out.print("sesenta");
                        break;
                
                    case 7:
                        System.out.print("setenta");
                        break;
                
                    case 8:
                        System.out.print("ochenta");
                        break;
                
                    case 9:
                        System.out.print("noventa");
                        break;
                }
            }

            if (n>30 && n%10 != 0) {
                System.out.print(" y ");
            }

            if (n>9 && n<16) {
                switch (n) {
                    case 10:
                    System.out.print("diez");
                    break;
            
                case 11:
                    System.out.print("once");
                    break;
            
                case 12:
                    System.out.print("doce");
                    break;
            
                case 13:
                    System.out.print("trece");
                    break;
            
                case 14:
                    System.out.print("catorce");
                    break;
            
                case 15:
                    System.out.print("quince");
                    break;
                }
            } else {

                switch (n%10) { 
                    case 1:
                    System.out.print("uno");
                    break;
                    
                    case 2:
                    System.out.print("dos");
                    break;
                    
                    case 3:
                    System.out.print("tres");
                    break;
                    
                    case 4:
                    System.out.print("cuatro");
                    break;
            
                    case 5:
                    System.out.print("cinco");
                    break;
            
                    case 6:
                    System.out.print("seis");
                    break;
            
                    case 7:
                    System.out.print("siete");
                    break;
                    
                    case 8:
                    System.out.print("ocho");
                    break;
                    
                    case 9:
                    System.out.print("nueve");
                    break;

                }
            }
                sc.close();
            }
        }
    }
    