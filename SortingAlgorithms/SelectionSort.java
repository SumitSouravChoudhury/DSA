package SortingAlgorithms;

import java.util.*;

public class SelectionSort {

    public void selectionsort(int[] arr, int n) {

        for (int i = 0; i < n - 1; i++) {

            int min = i;
            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
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

        SelectionSort obj = new SelectionSort();
        obj.selectionsort(arr, n);
        obj.printArray(arr, n);
    }
}
