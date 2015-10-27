package Problem3;

import java.util.Scanner;

public class LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] input = scan.nextLine().split(" ");
        int count = 1;
        int maxCount = 1;
        String element = input[0];
        for (int i = 0; i < input.length - 1; i++){
            if (input[i].equals(input[i + 1])){
                count++;
            }else{
                count = 1;
            }
            if (maxCount < count){
                maxCount = count;
                element = input[i];
            }
        }
        for (int i = 0; i < maxCount; i++){
            System.out.print(element + " ");
        }
    }
}