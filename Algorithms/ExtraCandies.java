package Algorithms;

import java.util.*;

public class ExtraCandies {

    public static ArrayList<Boolean> findAns(int[] candies, int extraCandies) {

        ArrayList<Boolean> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < candies.length; i++) {

            if (max < candies[i]) {
                max = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {

            if (candies[i] + extraCandies >= max) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] candies = new int[n];
        for (int i = 0; i < n; i++) {
            candies[i] = s.nextInt();
        }
        int extraCandies = s.nextInt();
        s.close();

        ArrayList<Boolean> ans = findAns(candies, extraCandies);
        System.out.println(ans);
    }
}
