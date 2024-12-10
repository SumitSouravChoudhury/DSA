package Algorithms;

import java.util.*;

public class IsomorphicStrings {

    public static boolean findAns(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {

            if (!mapS.containsKey(s1.charAt(i))) {
                mapS.put(s1.charAt(i), i);
            }
            if (!mapT.containsKey(s2.charAt(i))) {
                mapT.put(s2.charAt(i), i);
            }

            if (!mapS.get(s1.charAt(i)).equals(mapT.get(s2.charAt(i)))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String s1 = s.next();
        String s2 = s.next();
        s.close();

        boolean ans = findAns(s1, s2);
        System.out.println(ans);
    }
}
