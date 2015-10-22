import java.util.Scanner;

/**
 * Created by pc1 on 14.10.2015 ã..
 */
public class TriangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String [] input = console.nextLine().split(" ");
        int Ax = Integer.parseInt(input[0]);
        int Ay = Integer.parseInt(input[1]);
        input = console.nextLine().split(" ");
        int Bx = Integer.parseInt(input[0]);
        int By = Integer.parseInt(input[1]);
        input = console.nextLine().split(" ");
        int Cx = Integer.parseInt(input[0]);
        int Cy = Integer.parseInt(input[1]);
        int result = Math.abs(Math.round((Ax * (By - Cy) + Bx * (Cy - Ay) + Cx * (Ay - By)) / 2));
        if (result <= 0)
        {
            System.out.println(0);
        }else {
            System.out.println(result);
        }
    }
}
