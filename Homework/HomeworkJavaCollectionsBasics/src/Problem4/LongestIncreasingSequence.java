package Problem4;

import java.util.Scanner;

public class LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        int[] numbs = new int[input.length];
        for (int j = 0; j < numbs.length; j++) {
            numbs[j] = Integer.parseInt(input[j]);
        }
        int count = 0;
        int maxCount = 0;
        int index = 0;
        for (int i = 0; i < input.length - 1; i++) {

            System.out.print(numbs[i] + " ");
            count++;

            if (numbs[i] >= numbs[i + 1]) {
                if (maxCount < count) {
                    maxCount = count;
                    index = i;
                }
                System.out.println();
                count = 0;
            }
        }
        if (numbs[input.length - 1] >= numbs[input.length - 2] ){
            count++;
            if (maxCount < count) {
                maxCount = count;
                index = input.length - 1;
            }
            System.out.println(numbs[input.length - 1]);
        }else{
            System.out.println(numbs[input.length - 1]);
        }

        System.out.print("Longest: ");
        for (int i = index - maxCount + 1; i <=  index ; i++) {
            System.out.print(numbs[i] + " ");
        }
    }
}
