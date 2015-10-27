package Problem17;

import java.util.Scanner;

public class StuckNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String [] numbers = scan.nextLine().split(" ");
        boolean stuckNums = false;
        for (int a = 0; a < n; a++){
            for (int b = 0; b < n; b++){
                for (int c = 0; c < n; c++){
                    for (int d = 0; d < n; d++){
                        if (a != b && a != c && a != d && b != c && b != d && c != d){
                            String first = numbers[a] + numbers[b];
                            String second = numbers[c] + numbers[d];
                            if (first.equals(second)){
                                System.out.printf("%s|%s == %s|%s",numbers[a],numbers[b],numbers[c],numbers[d]);
                                System.out.println();
                                stuckNums = true;
                            }
                        }
                    }
                }
            }
        }
        if (!stuckNums){
            System.out.println("No");
        }
    }
}
