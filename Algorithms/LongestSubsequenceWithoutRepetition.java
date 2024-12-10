package Algorithms;

import java.util.*;

public class LongestSubsequenceWithoutRepetition {

    public static int findLongest(String str) {

        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int max = 0;

        for (int right = 0; right < str.length(); right++) {
            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }

            set.add(str.charAt(right));

            max = Math.max(max, right - left + 1);
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String str = s.next();
        s.close();

        int ans = findLongest(str);
        System.out.println(ans);
    }
}
