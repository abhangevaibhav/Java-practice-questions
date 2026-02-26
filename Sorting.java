//Bubble sort

import java.util.*;

class Sorting {
    public static void printArray(int arr[]) {
        int i;
        for (i = 0; i <= arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int i, j, temp;

        int arr[] = { 32, 83, 28, 43, 49, 20 };
        for (i = 0; i < arr.length - 1; i++) {
            for (j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr);
    }

}