import com.sun.deploy.util.StringUtils;

import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = Integer.parseInt(console.nextLine());
        float b = Float.parseFloat(console.nextLine());
        float c = Float.parseFloat(console.nextLine());

        System.out.printf("|%-10s|%010d|%10.2f|%-10.3f|",Integer.toHexString(a).toUpperCase(),
                Integer.parseInt(Integer.toBinaryString(a)),b,c);

    }
}
