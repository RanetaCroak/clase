package Java_Strings1;

public class ej12 {
    public static void main(String[] args) {
        System.out.println("+-------------+------------+"); 
        System.out.println("|   Decimal   |  Carácter  |");
        System.out.println("+-------------+------------+"); 

        for (int i = 32; i < 127; i++) {
            System.out.println("|     "+i+"      |    "+(char)i+"       |");
        }
        
        System.out.println("+--------------+------------+"); 
    }
}
