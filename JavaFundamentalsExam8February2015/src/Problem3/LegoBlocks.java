package Problem3;

import java.util.Arrays;
import java.util.Scanner;

public class LegoBlocks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lenght = 0;
        boolean fit = true;
        int num = Integer.parseInt(scan.nextLine());
        int[][] firstArray = new int[num][];
        for (int i = 0; i < num; i++) {
            String[] numbers = scan.nextLine().trim().split("\\s+");
            lenght += numbers.length;
            firstArray[i] = new int[numbers.length];
            for (int j = 0; j < numbers.length; j++) {
                firstArray[i][j] = Integer.parseInt(numbers[j]);
            }
        }
        int[][] secondArray = new int[num][];
        for (int i = 0; i < num; i++) {
            String[] numbers = scan.nextLine().trim().split("\\s+");
            lenght += numbers.length;
            secondArray[i] = new int[numbers.length];
            for (int j = 0; j < numbers.length; j++) {
                secondArray[i][j] = Integer.parseInt(numbers[j]);
            }
        }
        for (int i = 0; i < num - 1; i++) {
            int lengthOne = firstArray[i].length + secondArray[i].length;
            int lengthTwo = firstArray[i + 1].length + secondArray[i + 1].length;
            if (lengthOne != lengthTwo) {

                fit = false;
            }
        }
        if (fit) {
            int[][] finalArray = new int[num][];
            int a = 0;
            for (int i = 0; i < num; i++) {
                finalArray[i] = new int[firstArray[i].length + secondArray[i].length];
                a = 0;
                for (int j = 0; j < firstArray[i].length; j++) {
                    finalArray[i][a] = firstArray[i][j];
                    a++;
                }
                for (int k = secondArray[i].length - 1; k >= 0; k--) {
                    finalArray[i][a] = secondArray[i][k];
                    a++;
                }
            }
            for (int i = 0; i < num; i++) {
                System.out.print(Arrays.toString(finalArray[i]));
                System.out.println();
            }
        } else {
            System.out.printf("The total number of cells is: %d", lenght);
        }
    }
}
