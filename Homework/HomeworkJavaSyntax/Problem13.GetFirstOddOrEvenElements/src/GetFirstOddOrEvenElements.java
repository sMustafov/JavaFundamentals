import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.out;

public class GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] input = console.nextLine().split(" ");
        List<Integer> numb = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            numb.add(Integer.parseInt(input[i]));
        }
        String[] command = console.nextLine().split(" ");
        array(numb, command);
    }

    public static void array(List<Integer> numbers, String[] command) {
        String comm = command[2];
        switch (comm) {
            case "even":
                int counter = 0;
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) % 2 == 0) {
                        System.out.print(numbers.get(i) + " ");
                        counter++;
                    }
                    if (counter >= Integer.parseInt(command[1])) {
                        break;
                    }
                    break;
                }
            case "odd":
                counter = 0;
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) % 2 != 0) {
                        System.out.print(numbers.get(i) + " ");
                        counter++;
                    }
                    if (counter >= Integer.parseInt(command[1])) {
                        break;
                    }
                }
                break;
            default:
                System.out.println("Invalid command");
                break;
        }
    }
}