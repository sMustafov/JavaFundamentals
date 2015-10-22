import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.*;

public class MagicExchangeableWords {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] input = console.nextLine().split(" ");
        String firstString = input[0];
        String secondString = input[1];
        System.out.print(exchangeable(firstString,secondString));
    }
    public static boolean exchangeable (String firstString, String secondString){
        Map <Character,Character> exchangeableWords = new HashMap<>();
        boolean isExchangeable = true;
        if (firstString.length() == secondString.length()) {
            for (int i = 0; i < firstString.length(); i++) {
                if (exchangeableWords.containsKey(firstString.charAt(i))) {
                    if(secondString.charAt(i) != exchangeableWords.get(firstString.charAt(i))) {
                        isExchangeable = false;
                    }
                } else if(exchangeableWords.containsValue(secondString.charAt(i))){
                    isExchangeable = false;
                } else {
                    exchangeableWords.put(firstString.charAt(i), secondString.charAt(i));
                }
            }
        }else{
            System.out.print("The strings must be with equal length");
        }
        return isExchangeable;
    }
}
