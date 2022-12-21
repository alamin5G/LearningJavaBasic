package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a[] = new int[5];
        int b[] = {2, 5, -2, -1, 4, 6, 8, 15, 1, 10};
        /*System.out.println("Insert Number: ");
        for (int i = 0; i < 5; i++) {
            a[i] = input.nextInt();

        }

        System.out.println("Inserted Numbers are: ");

        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }*/

        //Sorting array
       /* Arrays.sort(b);
        System.out.println("After Sorting: ");
        for (int j : b) {
            System.out.print(j + " ");
        }*/


        //Binary Search
       /* System.out.println("\nBinary Search: input your item");
        int item = input.nextInt();
        int index = Arrays.binarySearch(b, item);
        if (index >= 0) {
            System.out.println("Found @ position: "+(index+1));
        }else{
            System.out.println("Not Found!");
        }*/

        //Linear Search
        int target = 1;
        for (int i = 0; i < b.length; i++) {
            if(target==b[i]){
                System.out.println("Find at postion : "+ (i+1));
                break;
            }
        }

    }
}
