package Algorithms;

import java.util.*;

public class SubstringOrNot {

    public static boolean findAns(String s1, String s2) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s2.length(); i++) {

            map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s1.length(); i++) {

            if (map.containsKey(s1.charAt(i))) {
                map.put(s1.charAt(i), map.get(s1.charAt(i)) - 1);
            }

            if (!map.containsKey(s1.charAt(i)) || map.get(s1.charAt(i)) < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String str1 = s.next();
        String str2 = s.next();
        s.close();

        boolean ans = findAns(str1, str2);
        System.out.println(ans);
    }
}
