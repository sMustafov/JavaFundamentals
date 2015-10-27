package Problem10;

import java.util.Scanner;
import java.util.TreeSet;

public class ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] input = scan.nextLine().toLowerCase().split("\\W+");
        TreeSet<String> words = new TreeSet<>();
        for (int i = 0; i < input.length; i++){
            words.add(input[i]);
        }
        for (String word : words){
            System.out.print(word.toLowerCase() + " ");
        }
    }
}
