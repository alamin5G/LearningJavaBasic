package BubbleSort;

import java.util.Scanner;

public class BubbleSort {
    //Bubble sort is known as ascending order sort.
    //or increasing order.
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = input.nextInt();
        }

        int sw = 0;

        for (int i = 0; i < n; i++) {
            int numberOfSwaps = 0;

            for (int j = 0; j <(n-(i+1)); j++) {
                if (a[j] > a[j + 1]) {
                    int temp    = a[j];
                    a[j]        = a[j+1];
                    a[j+1]      = temp;
                    numberOfSwaps++;
                }
            }
            sw += numberOfSwaps;

            if (numberOfSwaps == 0) {
                break;
            }
        }
        System.out.println("After Sorting: ");
        for(int i=0; i<n; i++){
            System.out.print(a[i]+ " ");
        }
    }
}
