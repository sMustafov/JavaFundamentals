package Problem15;

import java.util.Scanner;

public class ImplementRecursiveBinarySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int target = Integer.parseInt(scan.nextLine());
        String[] input = scan.nextLine().split(" ");
        int [] array = new int[input.length];
        for (int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(input[i]);
        }
        System.out.print(binarySearch(array, 0, array.length-1, target));
    }
    public static int binarySearch(int[] array, int start, int end, int target) {
        int middle = (start + end) / 2;
        if (end < start) {
            return -1;
        }
        if (target == array[middle]) {
            return middle;
        } else if (target < array[middle]) {
            return binarySearch(array, start, middle - 1, target);
        } else {
            return binarySearch(array, middle + 1, end, target);
        }
    }
}
