import java.util.Scanner;

/**
 * Created by pc1 on 13.10.2015 ã..
 */
public class GetAverage {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double a = Double.parseDouble(console.nextLine());
        double b = Double.parseDouble(console.nextLine());
        double c = Double.parseDouble(console.nextLine());
        double avg = Average(a,b,c);
        System.out.printf("%.2f", avg);
    }
    public static double Average (double a, double b, double c){
        double avg = (a + b + c) / 3;
        return avg;
    }
}
