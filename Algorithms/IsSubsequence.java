package Algorithms;

import java.util.Scanner;

public class IsSubsequence {

    public static boolean findIsSequence(String s, String t) {

        int sp = 0, tp = 0;

        while (sp < s.length() && tp < s.length()) {

            if (s.charAt(sp) == t.charAt(tp)) {
                sp++;
            }
            tp++;
        }

        return sp == s.length();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();
        sc.close();

        boolean ans = findIsSequence(s, t);
        System.out.println(ans);
    }
}
