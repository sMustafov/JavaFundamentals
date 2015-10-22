import java.util.Scanner;

/**
 * Created by pc1 on 15.10.2015 ã..
 */
public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String [] nums = console.nextLine().split(" ");
        if (nums.length % 2 == 0) {
            for (int i = 0; i < nums.length - 1;i+=2) {
                int numberOne = Integer.parseInt(nums[i]);
                int numberTwo = Integer.parseInt(nums[i + 1]);
                if (numberOne % 2 == 0 && numberTwo % 2 == 0){
                    System.out.printf("%d, %d -> both are even", numberOne, numberTwo);
                    System.out.println();
                }else if (numberOne % 2 != 0 && numberTwo % 2 != 0){
                    System.out.printf("%d, %d -> both are odd", numberOne, numberTwo);
                    System.out.println();
                }else{
                    System.out.printf("%d, %d -> different", numberOne, numberTwo);
                    System.out.println();
                }
            }
        }else{
        System.out.println("Invalid length");
    }
    }
}
