package Problem5;

import java.util.Scanner;

public class CountAllWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().trim().split("\\W+");
        System.out.print(input.length);
    }
}
