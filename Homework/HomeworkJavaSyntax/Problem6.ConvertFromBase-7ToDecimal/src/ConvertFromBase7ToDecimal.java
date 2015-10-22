import java.util.Scanner;

/**
 * Created by pc1 on 15.10.2015 ã..
 */
public class ConvertFromBase7ToDecimal {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String num = console.nextLine();
        int number = Integer.valueOf(num,7);
        System.out.println(number);
    }
}

