package Problem16;

import java.util.Scanner;

public class CalculateNFactorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        System.out.print(Factorial(num));
    }
    public static int Factorial (int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return Factorial(n - 1) * n;
        }
    }
}
