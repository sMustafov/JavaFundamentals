import java.util.Scanner;

/**
 * Created by pc1 on 15.10.2015 ã..
 */
public class HitTheTarget {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());
        for (int i = 1; i <= 20; i++)
        {
            for (int j = 1; j <= 20; j++)
            {
                if (i + j == num ){
                    System.out.printf("%d + %d = %d", i, j, num);
                    System.out.println();
                }else if (i - j == num ){
                    System.out.printf("%d - %d = %d", i, j, num);
                    System.out.println();
                }
            }
        }
    }
}
