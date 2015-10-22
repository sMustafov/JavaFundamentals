import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] strings = scan.nextLine().split(" ");
        String strOne = strings[0].toString();
        String strTwo = strings[1].toString();
        System.out.print(charMultiplier(strOne,strTwo));
    }
    public static int charMultiplier (String strOne, String strTwo){
        int sum = 0;
        if (strOne.length() == strTwo.length()){
            for (int i = 0; i < strOne.length(); i++){
                sum +=  ((int)strOne.charAt(i) * (int)strTwo.charAt(i));
            }
        }else if (strOne.length() > strTwo.length()){
            for (int i = 0; i < strTwo.length(); i++){
                sum += ((int)strOne.charAt(i) * (int)strTwo.charAt(i));
            }
            for (int j = strTwo.length(); j < strOne.length(); j++){
                sum += (int)strOne.charAt(j);
            }
        }else if (strOne.length() < strTwo.length()){
            for (int i = 0; i < strOne.length(); i++){
                sum += ((int)strOne.charAt(i) * (int)strTwo.charAt(i));
            }
            for (int j = strOne.length(); j < strTwo.length(); j++){
                sum += (int)strTwo.charAt(j);
            }
        }
        return sum;
    }
}
