package Problem11;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MostFrequentWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] input = scan.nextLine().toLowerCase().split("\\W+");
        Map<String,Integer> words = new TreeMap<>();
        for (String word : input){
            Integer count = words.get(word);
            if (count == null) {
                count = 0;
            }
            words.put(word, count+1);
        }
        int max = Collections.max(words.values());
        for (Map.Entry<String,Integer> map : words.entrySet()){
            if (map.getValue() == max){
                System.out.println(map.getKey() + " -> " + map.getValue() + " times");
            }
        }
    }
}
