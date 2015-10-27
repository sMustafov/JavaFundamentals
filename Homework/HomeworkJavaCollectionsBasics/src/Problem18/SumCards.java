package Problem18;

import java.security.SecureRandom;
import java.util.Scanner;

public class SumCards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("[C, H, D, S]\\s*");
        int[] nums = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            if (input[i].equals("J")) {
                nums[i] = 12;
            } else if (input[i].equals("Q")) {
                nums[i] = 13;
            } else if (input[i].equals("K")) {
                nums[i] = 14;
            } else if (input[i].equals("A")) {
                nums[i] = 15;
            } else {
                nums[i] = Integer.parseInt(input[i]);
            }
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int equal = 1;
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    equal++;
                    i++;
                } else {
                    break;
                }
            }
            if (equal > 1) {
                sum += nums[i] * equal * 2;
            } else {
                sum += nums[i];
            }
        }
        System.out.print(sum);
    }
}
