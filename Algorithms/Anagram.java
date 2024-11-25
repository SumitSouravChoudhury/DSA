package Algorithms;

import java.util.HashSet;
import java.util.Scanner;

public class Anagram {

    public static boolean checkAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        HashSet<Character> set = new HashSet<>();
        int curr_size = 0;

        for (int i = 0; i < ch1.length; i++) {
            set.add(ch1[i]);
        }

        curr_size = set.size();

        for (int i = 0; i < ch2.length; i++) {
            set.add(ch2[i]);
        }

        return (set.size() == curr_size);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String str1 = s.next();
        String str2 = s.next();
        s.close();

        boolean ans = checkAnagram(str1, str2);

        System.out.println(ans);
    }
}
