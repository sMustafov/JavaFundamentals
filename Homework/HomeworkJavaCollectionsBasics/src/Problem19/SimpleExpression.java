package Problem19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleExpression {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().trim();
        input = input.replaceAll("\\s+", "");
        Pattern op = Pattern.compile("[\\+|\\-]");
        Matcher matcher = op.matcher(input);
        String [] alg = input.trim().split("[\\+|\\-]");
        double numb = Double.parseDouble(alg[0]);
        int i = 0;
        while (matcher.find()) {
            i++;
            if (matcher.group().equals("-")){
                numb -= Double.parseDouble(alg[i]);
            }else if (matcher.group().equals("+")) {
                numb += Double.parseDouble(alg[i]);
            }
        }
        System.out.print(numb);
    }
}
