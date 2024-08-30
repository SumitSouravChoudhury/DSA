package Algorithms;

import java.util.Scanner;

public class IntToRoman {
    
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();

        String i[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String x[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String c[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String m[] = {"","M","MM","MMM"};

        String thousands = m[num/1000];
        String hundreds = c[(num%1000)/100];
        String tens = x[(num%100)/10];
        String ones = i[num%10];

        String ans = thousands + hundreds + tens + ones;
        System.out.println(ans);
    }
}
