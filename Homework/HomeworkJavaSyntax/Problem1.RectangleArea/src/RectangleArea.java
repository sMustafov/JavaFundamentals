import javax.security.sasl.SaslClient;
import java.util.Scanner;

/**
 * Created by pc1 on 14.10.2015 ã..
 */
public class RectangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String [] nums = console.nextLine().split(" ");
        int result = 1;
        for (int i = 0; i < 2; i++) {
            result *= Integer.parseInt(nums[i]);
        }
        System.out.println(result);
    }
}
