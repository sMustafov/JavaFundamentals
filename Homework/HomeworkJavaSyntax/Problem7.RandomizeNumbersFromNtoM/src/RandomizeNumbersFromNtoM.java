import java.util.Random;
import java.util.Scanner;

/**
 * Created by pc1 on 15.10.2015 ã..
 */
public class RandomizeNumbersFromNtoM {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int m = Integer.parseInt(console.nextLine());
        Random random = new Random();
        for (int i = 0; i <= Math.abs(n - m); i++) {
            if (n > m) {
                System.out.print(random.nextInt(n - m + 1) + m + " ");
            }else if (m > n){
                System.out.print(random.nextInt(m - n + 1) + n  + " ");
            }else{
                System.out.print(random.nextInt(1) + n  + " ");
            }
        }
    }
}
