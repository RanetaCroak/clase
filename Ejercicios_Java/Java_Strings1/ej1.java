package Java_Strings1;
public class ej1 {
    
    public static void main(String[] args) {
        
        double suma = 0;
        double[] numeros = new double[50];
        for (int i = 0; i < numeros.length; i++) {
            suma+=numeros[i]=Math.random()*50+1;
        }
        double media = suma/numeros.length; 
        System.out.println("\nLa media es "+media);
        System.out.println("\nEstos son los valores por encima de la media\n");
        for (double d : numeros) {
            if (d>media) {
                System.out.println(d);
            }
        }
    }
}
