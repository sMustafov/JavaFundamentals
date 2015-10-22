import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by pc1 on 15.10.2015 ã..
 */
public class ExtractWords {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        Pattern patt = Pattern.compile("(\\d|\\W)+");
        Matcher matcher = patt.matcher(input);
        while (matcher.find()){
         input = input.replace(matcher.group()," ");
        }
        input = input.trim();
        System.out.println(input);
    }
}
