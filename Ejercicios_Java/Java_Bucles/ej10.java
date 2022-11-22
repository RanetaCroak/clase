package Java_Bucles;

public class ej10 {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 0; i < 10; i++) {
            if (i%2!=0) {
                System.out.print(i);
                suma+=i;
                System.out.print(i==9?" = ":" + ");
            } 
        }
        System.out.println(suma);
    }
}
