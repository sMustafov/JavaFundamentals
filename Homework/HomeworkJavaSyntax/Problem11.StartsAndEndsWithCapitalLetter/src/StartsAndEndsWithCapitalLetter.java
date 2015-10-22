import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartsAndEndsWithCapitalLetter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String [] strs = console.nextLine().split(" ");
        Pattern patt = Pattern.compile("^([A-Z][a-zA-Z]+[A-Z])$|^([A-Z]\\s{0}[A-Z])$");
        for (int i = 0; i < strs.length; i++) {
            Matcher matcher = patt.matcher(strs[i]);
            if (matcher.find()){
                System.out.print(strs[i] + " ");
            }
        }
    }
}
