package Array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a[] = new int[5];
        System.out.println("Insert Number: ");
        for (int i = 0; i < 5; i++) {
            a[i] = input.nextInt();

        }

        System.out.println("Inserted Numbers are: ");

        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
