import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

/**
 * Created by pc1 on 15.10.2015 ã..
 */
public class CalculateExpression {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double a = Double.parseDouble(console.nextLine());
        double b = Double.parseDouble(console.nextLine());
        double c = Double.parseDouble(console.nextLine());
        double f = (Math.pow(a,2) + Math.pow(b,2));
        double s = (Math.pow(a,2) - Math.pow(b,2));
        double w = ((a + b + c) / Math.sqrt(c));
        double F1 = Math.pow((f / s), w);
        double F2 = Math.pow((f - Math.pow(c,3)),( a - b));
        double avg1 = (a + b + c) / 3;
        double avg2 = (F1 + F2) / 2;
        double diff = Math.abs(avg1 - avg2);
        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f",F1, F2, diff);
    }
}
