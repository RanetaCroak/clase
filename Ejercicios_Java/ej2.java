package Java_Strings1;

public class ej2 {
    public static void main(String[] args) {

        double max = 0, min = 0;
        double[] numeros = new double[50];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=Math.random()*50+1;

           if (min > numeros[i] || i == 1) {
                min = numeros[i];
           }
           if (max < numeros[i] || i == 1) {
                max = numeros[i];
           }
        }
        System.out.println("Número máximo: "+max+"\nNúmero mínimo: "+min);
    }
}
