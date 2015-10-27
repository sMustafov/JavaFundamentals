package Problem14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class SortArrayWithStreamAPI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] input = scan.nextLine().split(" ");
        String command = scan.nextLine();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }
        if(command.equals("Ascending")) {
            numbers.stream().sorted( (x,y) -> Integer.compare(x,y)).forEach(x -> System.out.print(x + " "));
        }else if (command.equals("Descending")){
            Comparator<Integer> comparator = (x,y) -> Integer.compare(x,y);
            numbers.stream().sorted(comparator.reversed()).forEach(x -> System.out.print(x + " "));
        }
    }
}
