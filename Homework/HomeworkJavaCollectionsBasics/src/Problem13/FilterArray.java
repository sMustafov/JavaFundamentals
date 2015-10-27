package Problem13;

import java.util.ArrayList;
import java.util.Scanner;

public class FilterArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] input = scan.nextLine().split(" ");
        ArrayList<String> array = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            array.add(input[i]);
        }
        array.stream().filter(x -> x.length() > 3).forEach(x -> System.out.print(x + " "));
    }
}
