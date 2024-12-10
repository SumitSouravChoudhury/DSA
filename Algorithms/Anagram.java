package Algorithms;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {

    public static boolean checkAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {

            if (!map.containsKey(t.charAt(i)) || map.get(t.charAt(i)) == 0) {
                return false;
            }

            map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
        }

        return true;
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
