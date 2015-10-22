import java.util.Scanner;

/**
 * Created by pc1 on 15.10.2015 ã..
 */
public class ConvertFromDecimalSystemTobase7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());
        String number = Integer.toString(num, 7);
        System.out.print(number);
    }
}
