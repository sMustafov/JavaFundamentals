package Problem6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine().toLowerCase();
        String word = scan.nextLine().toLowerCase();
        String w = "\\b" + word + "\\b";
        Pattern patt = Pattern.compile(w);
        Matcher matcher = patt.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.print(count);
    }
}
