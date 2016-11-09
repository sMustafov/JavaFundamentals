import java.util.Scanner;

public class MagicCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] cards = scan.nextLine().split(" ");
        String OddOrEven = scan.nextLine();
        String magicCard = scan.nextLine();
        int res = 0;
        if (OddOrEven.equals("odd")) {
            for (int i = 1; i < cards.length; i += 2) {
                res = magicCards(cards,i,magicCard,res);
            }
        } else if (OddOrEven.equals("even")) {
            for (int i = 0; i < cards.length; i += 2) {
                res = magicCards(cards,i,magicCard,res);
            }
        }
        System.out.println(res);
    }

    public static int cardFace(String cardFace, String cardSuit, String magicFace, String magicSuit) {
        int sum = 0;
        int p = 0;
        if (cardFace.equals(magicFace)) {
            p = 3;
        } else if (cardSuit.equals(magicSuit)) {
            p = 2;
        } else {
            p = 1;
        }
        switch (cardFace) {
            case "2":
                sum += p * 20;
                break;
            case "3":
                sum += p * 30;
                break;
            case "4":
                sum += p * 40;
                break;
            case "5":
                sum += p * 50;
                break;
            case "6":
                sum += p * 60;
                break;
            case "7":
                sum += p * 70;
                break;
            case "8":
                sum += p * 80;
                break;
            case "9":
                sum += p * 90;
                break;
            case "10":
                sum += p * 100;
                break;
            case "J":
                sum += p * 120;
                break;
            case "Q":
                sum += p * 130;
                break;
            case "K":
                sum += p * 140;
                break;
            case "A":
                sum += p * 150;
                break;
        }
        return sum;
    }
    public static int magicCards (String [] cards, int i, String magicCard, int res){

        if (cards[i].contains("1")) {
            String face = cards[i].substring(0, 2);
            Character suitt = cards[i].charAt(2);
            String suit = Character.toString(suitt);

            if (magicCard.contains("1")) {
                String magicFace = magicCard.substring(0, 2);
                Character magicSuitt = magicCard.charAt(2);
                String magicSuit = Character.toString(magicSuitt);
                res += cardFace(face, suit, magicFace, magicSuit);
            } else {
                Character magicFacee = magicCard.charAt(0);
                String magicFace = Character.toString(magicFacee);
                Character magicSuitt = magicCard.charAt(1);
                String magicSuit = Character.toString(magicSuitt);
                res += cardFace(face, suit, magicFace, magicSuit);
            }
        } else {
            Character facee = cards[i].charAt(0);
            String face = Character.toString(facee);
            Character suitt = cards[i].charAt(1);
            String suit = Character.toString(suitt);

            if (magicCard.contains("1")) {
                String magicFace = magicCard.substring(0, 2);
                Character magicSuitt = magicCard.charAt(2);
                String magicSuit = Character.toString(magicSuitt);
                res += cardFace(face, suit, magicFace, magicSuit);
            } else {
                Character magicFacee = magicCard.charAt(0);
                String magicFace = Character.toString(magicFacee);
                Character magicSuitt = magicCard.charAt(1);
                String magicSuit = Character.toString(magicSuitt);
                res += cardFace(face, suit, magicFace, magicSuit);
            }
        }
        return res;
    }
}
