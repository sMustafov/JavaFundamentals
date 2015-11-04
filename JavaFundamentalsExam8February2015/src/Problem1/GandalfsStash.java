package Problem1;

import java.util.Scanner;

public class GandalfsStash {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        String[] input = scan.nextLine().toLowerCase().split("[\\W|\\_]+");
        int point = Points(input, num);
        System.out.println(point);
        Mood(point);
    }

    public static int Points(String[] input, int num) {
        int sum = num;
        String melon = new String("melon");
        String cram = new String("cram");
        String apple = new String("apple");
        String lembas = new String("lembas");
        String honeycake = new String("honeycake");
        String mushrooms = new String("mushrooms");
        for (int i = 0; i < input.length; i++) {
            if (input[i].equals(cram)) {
                sum += 2;
            } else if (input[i].equals(lembas)) {
                sum += 3;
            } else if (input[i].equals(apple)) {
                sum += 1;
            } else if (input[i].equals(melon)) {
                sum += 1;
            } else if (input[i].equals(honeycake)) {
                sum += 5;
            } else if (input[i].equals(mushrooms)) {
                sum -= 10;
            } else {
                sum -= 1;
            }
        }
        return sum;
    }

    public static void Mood(int point) {
        if (point < -5) {
            System.out.print("Angry");
        } else if (point >= -5 && point < 0) {
            System.out.print("Sad");
        } else if (point >= 0 && point < 15) {
            System.out.print("Happy");
        } else if (point >= 15) {
            System.out.print("Special JavaScript mood");
        }
    }
}

