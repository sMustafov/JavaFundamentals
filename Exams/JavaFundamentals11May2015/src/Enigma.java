import java.util.Scanner;

public class Enigma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++){
            String input = scan.nextLine().trim();
            int len = 0;
            for (int a = 0; a < input.length(); a++){
                if (input.charAt(a) != ' ' && input.charAt(a) != '0' &&
                        input.charAt(a) != '1' && input.charAt(a) != '2' && input.charAt(a) != '3' &&
                        input.charAt(a) != '4' && input.charAt(a) != '5' && input.charAt(a) != '6' &&
                        input.charAt(a) != '7' && input.charAt(a) != '8'&& input.charAt(a) != '9') {
                    len++;
                }
            }
            int ascii = len / 2;
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == ' ' || (input.charAt(j) >= '0' && input.charAt(j) <= '9')) {
                    System.out.print(input.charAt(j));
                } else {
                    System.out.print((char) (input.charAt(j) + ascii));
                }
            }
            System.out.println();
        }
    }
}
