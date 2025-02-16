package Algorithms;

import java.util.*;

public class RomanToInt {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        String str = s.next();

        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int ans = 0;

        for (int i = 0; i < str.length(); i++) {

            if (i < str.length() - 1 && (map.get(str.charAt(i)) < map.get(str.charAt(i + 1)))) {
                ans -= map.get(str.charAt(i));
            } else {
                ans += map.get(str.charAt(i));
            }
        }

        System.out.println(ans);
    }
}
