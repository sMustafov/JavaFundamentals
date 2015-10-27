package Problem8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Pattern patt = Pattern.compile("[A-Za-z\\_|\\.|\\-]+@[A-Za-z|\\-]+.[A-Za-z]+");
        Matcher matcher = patt.matcher(input);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
