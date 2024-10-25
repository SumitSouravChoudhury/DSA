package Algorithms;

import java.util.*;

public class DecimalToBinary {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        int decimal = s.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();

        while (decimal > 0) {
            int temp = decimal % 2;
            ans.add(temp);
            decimal = decimal / 2;
        }

        for (int i = ans.size() - 1; i >= 0; i--) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
