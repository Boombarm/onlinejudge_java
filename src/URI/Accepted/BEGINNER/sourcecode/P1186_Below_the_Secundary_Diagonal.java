package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1186 Below the Secundary Diagonal https://www.urionlinejudge.com.br/judge/en/problems/view/1186
//Accepted 30/08/2015 - 11:59:29 Runtime:0.064s
import java.text.DecimalFormat;
import java.util.Scanner;

public class P1186_Below_the_Secundary_Diagonal {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");
        Scanner sc = new Scanner(System.in);
        char operation = sc.next().charAt(0);
        double sum = 0;
        int end = 11;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                double num = sc.nextDouble();
                if (j > end) {
                    sum += num;
                }
            }
            end--;
        }

        if (operation == 'S') {
            System.out.println(df.format(sum));
        } else if (operation == 'M') {
            System.out.println(df.format(sum / 66));
        }
    }

}
