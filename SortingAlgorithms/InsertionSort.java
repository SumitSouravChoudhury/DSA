package SortingAlgorithms;

import java.util.Scanner;

public class InsertionSort {

    public void insertionsort(int[] arr, int n) {

        for (int i = 1; i < n; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public void printArray(int[] arr, int n) {

        for (int i = 0; i < n; i++) {

            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        InsertionSort obj = new InsertionSort();
        obj.insertionsort(arr, n);
        obj.printArray(arr, n);
    }
}
