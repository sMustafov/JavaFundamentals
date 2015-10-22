import java.util.Scanner;

/**
 * Created by pc1 on 12.10.2015 ã..
 */
public class GhettoNumeralSystem {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        String numb = Integer.toString(number);
        String name = "";
        int lenght = (int)Math.pow(10,numb.length() - 1);
        for (int i = lenght; i >= 1; i /= 10) {
            int num = number / i;
            number %= i;
            switch (num) {
                case 0:
                    name = name.concat("Gee");
                    break;
                case 1:
                    name = name.concat("Bro");
                    break;
                case 2:
                    name = name.concat("Zuz");
                    break;
                case 3:
                    name = name.concat("Ma");
                    break;
                case 4:
                    name = name.concat("Duh");
                    break;
                case 5:
                    name = name.concat("Yo");
                    break;
                case 6:
                    name = name.concat("Dis");
                    break;
                case 7:
                    name = name.concat("Hood");
                    break;
                case 8:
                    name = name.concat("Jam");
                    break;
                case 9:
                    name = name.concat("Mack");
                    break;
            }
        }
        System.out.print(name);
    }
}