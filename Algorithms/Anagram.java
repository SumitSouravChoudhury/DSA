package Algorithms;

import java.util.*;

public class Anagram {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str1 = s.next();
        String str2 = s.next();
        s.close();

        int[] freq = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < str2.length(); i++) {
            freq[str2.charAt(i) - 'a']--;
        }

        for (int a : freq) {
            if (a != 0) {
                System.out.println("False");
                break;
            } else {
                System.out.println("True");
                break;
            }
        }
    }
}
