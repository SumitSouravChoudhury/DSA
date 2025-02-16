package Algorithms;

import java.util.Scanner;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = s.next();
        }

        String pref = str[0];
        int len = pref.length();

        for (int i = 1; i < n; i++) {

            String cur = str[i];

            while (len > cur.length() || !pref.equals(cur.substring(0, len))) {
                len--;

                if (len == 0) {
                    System.out.println("");
                }

                pref = pref.substring(0, len);
            }
        }

        System.out.println(pref);
    }
}
