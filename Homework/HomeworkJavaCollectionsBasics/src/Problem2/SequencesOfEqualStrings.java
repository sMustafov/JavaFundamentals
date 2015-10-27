package Problem2;

import java.util.Scanner;

public class SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i].equals(input[i + 1])) {
                System.out.print(input[i] + " ");
            } else if (input[i] != input[i + 1]) {
                System.out.print(input[i]);
                System.out.println();
            }
        }
        System.out.print(input[input.length - 1]);
    }
}
