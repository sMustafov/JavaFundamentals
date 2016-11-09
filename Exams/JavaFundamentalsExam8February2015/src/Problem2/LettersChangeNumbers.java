package Problem2;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s{1,}");
        double sum = 0.0;
        for (int i = 0; i < input.length; i++) {
            String strOne = input[i];
            sum += finalResult(strOne);
        }
        System.out.printf("%.2f\n", sum);
    }

    public static double finalResult(String str) {
        char firstLetter = str.charAt(0);
        char lastLetter = str.charAt(str.length() - 1);
        String n = str.substring(1, str.length() - 1);
        double num = Double.parseDouble(n);
        if (firstLetter >= 'a' && firstLetter <= 'z') {
            num *= (firstLetter - '`');
        } else if (firstLetter >= 'A' && firstLetter <= 'Z') {
            num /= (firstLetter - '@');
        }
        if (lastLetter >= 'a' && lastLetter <= 'z') {
            num += (lastLetter - '`');
        } else if (lastLetter >= 'A' && lastLetter <= 'Z') {
            num -= (lastLetter - '@');
        }
        return num;
    }
}

