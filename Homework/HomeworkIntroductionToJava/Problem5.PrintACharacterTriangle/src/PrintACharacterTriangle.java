import java.io.Console;
import java.util.Scanner;
/**
 * Created by pc1 on 12.10.2015 ã..
 */
public class PrintACharacterTriangle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        for (int a = 0; a < n; a++) {
            char i = 'a';
            for (int b = 0; b <= a; b++) {

                System.out.print(i + " ");
                i++;
            }
            System.out.println();
        }
        for (int a = n - 2; a >= 0; a--) {
            char i = 'a';
            for (int b = 0; b <= a; b++) {

                System.out.print(i + " ");
                i++;
            }
            System.out.println();
        }
    }
}
