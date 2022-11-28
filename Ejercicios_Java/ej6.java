package Java_Strings1;

import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime 5 números enteros");
        int[] nums = new int [5];
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1)+"/5 -> ");
            nums[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("En orden inverso:");
        for (int j = nums.length-1; j >= 0; j--) {
            System.out.print(nums[j]+" ");
        }
    }
}
