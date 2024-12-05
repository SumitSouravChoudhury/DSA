package Algorithms;

import java.util.Scanner;

public class StringCompression {

    public static int findCompression(char[] arr, int n) {

        int index = 0;

        for (int i = 0; i < n;) {

            char ch = arr[i];
            int count = 0;

            while (i < n && arr[i] == ch) {
                count++;
                i++;
            }

            arr[index++] = ch;

            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    arr[index++] = c;
                }
            }
        }

        return index;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        char[] arr = s.next().toCharArray();
        s.close();

        int len = findCompression(arr, n);
        System.out.println(len);
    }
}
