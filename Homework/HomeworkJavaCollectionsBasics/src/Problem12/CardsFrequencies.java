package Problem12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CardsFrequencies {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\W+");
        Map<String, Integer> words = new HashMap<>();
        for (String word : input) {
            Integer count = words.get(word);
            if (count == null) {
                count = 0;
            }
            words.put(word, count + 1);
        }
        double count = 0.0;
        for (Map.Entry<String, Integer> map : words.entrySet()) {
            count += map.getValue();
        }
        count = 100 / count;
        for (Map.Entry<String, Integer> map : words.entrySet()) {
            System.out.printf("%s -> %.2f", map.getKey(), ((double) (map.getValue() * count)));
            System.out.println(" %");
        }
    }
}
