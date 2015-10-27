package Problem7;

import java.util.Scanner;

public class CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine().toLowerCase();
        String word = scan.nextLine().toLowerCase();
        int count = 0;
        int len = word.length();
        for (int i = 0; i < text.length() - len + 1; i++){
            String w = text.substring(i,i + len);
            if (word.equals(w)){
                count++;
            }
        }
        System.out.println(count);
    }
}
