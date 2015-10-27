package Problem9;

import java.util.ArrayList;
import java.util.Scanner;

public class CombineListsOfLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> listOne = new ArrayList<>();
        ArrayList<String> listTwo = new ArrayList<>();
        String [] input = scan.nextLine().split(" ");
        for (int i = 0; i < input.length; i++){
            listOne.add(input[i]);
        }
        input = scan.nextLine().split(" ");
        for (int i = 0; i < input.length;i++ ){
            listTwo.add(input[i]);
        }
        ArrayList<String> finalList = new ArrayList<>();
        finalList.addAll(listOne);
        boolean isEqual = false;
        for (int i = 0;i < listTwo.size(); i++){
            for (int j = 0; j < listOne.size(); j++){
                if (listOne.get(j).equals(listTwo.get(i))){
                    isEqual = true;
                }
            }
            if (!isEqual){
                finalList.add(listTwo.get(i));
            }
            isEqual = false;
        }
        for (int i = 0; i < finalList.size(); i++){
            System.out.print(finalList.get(i) + " ");
        }
    }
}
