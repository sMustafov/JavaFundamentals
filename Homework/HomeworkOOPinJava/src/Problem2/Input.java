package Problem2;

public class Input {
    public static void main(String[] args) {
        FoodProduct cigars = new FoodProduct("420 Blaze it fgt", 6.90, 1400, AgeRestriction.Adult);

        Customer pecata = new Customer("Pecata", 17, 30.00);
        try {
            PurchaseManager.processPurchase(pecata, cigars);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        Customer gopeto = new Customer("Gopeto", 18, 0.44);
        try {
            PurchaseManager.processPurchase(gopeto, cigars);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
