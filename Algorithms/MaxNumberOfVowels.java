package Algorithms;

import java.util.Scanner;

public class MaxNumberOfVowels {

    public static int findVowels(String str, int k) {

        int count = 0;
        for (int i = 0; i < k; i++) {

            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        if (count == k) {
            return count;
        }

        int maxCount = count;
        int j = k;

        for (int i = 0; i < str.length() - k; i++) {

            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count--;
            }

            char ch1 = str.charAt(j);
            if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u') {
                count++;
            }

            if (maxCount < count) {
                maxCount = count;
            }
            if (count == k) {
                return count;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        int k = s.nextInt();
        s.close();

        int ans = findVowels(str, k);
        System.out.println(ans);
    }
}
