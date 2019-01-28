package URI.Trying.WA.BEGINNER;


/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: BEGINNER
 * @Problem: 2758 - Floating Number Input and Output
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2758
 * @Timelimit: 1 sec
 * @Status: WA 5%
 * @Submission:
 * @Runtime:
 * @Solution:
 * @Note:
 */

import java.io.IOException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Scanner;

public class P2758_Floating_Number_Input_and_Output {

    static float a, b, c, d;

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        d = sc.nextFloat();


        DecimalFormat df1 = new DecimalFormat("0.000000");
        DecimalFormat df2 = new DecimalFormat("0.0");
        DecimalFormat df3 = new DecimalFormat("0.00");
        DecimalFormat df4 = new DecimalFormat("0.000");
        DecimalFormat df5 = new DecimalFormat("0.000");
        DecimalFormat df6 = new DecimalFormat("0");
        df1.setRoundingMode(RoundingMode.HALF_EVEN);
        df2.setRoundingMode(RoundingMode.HALF_EVEN);
        df3.setRoundingMode(RoundingMode.HALF_EVEN);
        df4.setRoundingMode(RoundingMode.CEILING);
        df5.setRoundingMode(RoundingMode.CEILING);
        df6.setRoundingMode(RoundingMode.HALF_EVEN);

        System.out.println("A = " + df1.format(a) + ", B = " + df1.format(b));//1
        System.out.println("C = " + df1.format(c) + ", D = " + df1.format(d));//2

        System.out.println("A = " + df2.format(a) + ", B = " + df2.format(b));//3
        System.out.println("C = " + df2.format(c) + ", D = " + df2.format(d));//4

        System.out.println("A = " + df3.format(a) + ", B = " + df3.format(b));//5
        System.out.println("C = " + df3.format(c) + ", D = " + df3.format(d));//6

        System.out.println("A = " + df4.format(a) + ", B = " + df4.format(b));//7
        System.out.println("C = " + df4.format(c) + ", D = " + df4.format(d));//8

        System.out.println("A = " + String.format("%1.3E", df1.parse(df1.format(a))) + ", B = " + String.format("%1.3E", df1.parse(df1.format(b))));//9
        System.out.println("C = " + String.format("%1.3E", df1.parse(df1.format(c))) + ", D = " + String.format("%1.3E", df1.parse(df1.format(d))));//10

        System.out.println("A = " + df6.format(a) + ", B = " + df6.format(b));//11
        System.out.println("C = " + df6.format(c) + ", D = " + df6.format(d));//12
    }

    static String fillRightZero(String number, int digit) {
//        System.out.println("number>>>"+number);
        String[] p = number.split("\\.");
        int fill = digit - p[1].length();
        for (int i = 0; i < fill; i++) {
            p[1] += "0";
        }

        return p[0] + "." + p[1];
    }

}
