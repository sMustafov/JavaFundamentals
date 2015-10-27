package Problem1;

import java.util.Scanner;

public class SortArrayOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int [] array = new int [n];
        String[] input = scan.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(input[i]);
        }
        array = Sort(array);
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    public static int [] Sort (int[] array){
        for (int i = 0; i < array.length ; i++) {
            for (int j = i + 1; j < array.length ; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }
}
