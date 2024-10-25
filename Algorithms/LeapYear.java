package Algorithms;

import java.util.*;

public class LeapYear {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int year = s.nextInt();
        s.close();

        if ((year % 400 == 0) || ((year % 4 == 0 && year % 100 != 0))) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
