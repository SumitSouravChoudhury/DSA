package Algorithms;

import java.util.Scanner;

public class FlowerBed {

    public static boolean findAns(int[] flowerBed, int e) {

        for (int i = 0; i < flowerBed.length; i++) {

            boolean left = i == 0 || flowerBed[i - 1] == 0;
            boolean right = i == flowerBed.length - 1 || flowerBed[i + 1] == 0;

            if (left && right && flowerBed[i] == 0) {
                flowerBed[i] = 1;
                e--;
            }
        }

        return e <= 0;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] flowerBed = new int[n];
        for (int i = 0; i < n; i++) {
            flowerBed[i] = s.nextInt();
        }
        int e = s.nextInt();
        s.close();

        boolean ans = findAns(flowerBed, e);
        System.out.println(ans);
    }
}
