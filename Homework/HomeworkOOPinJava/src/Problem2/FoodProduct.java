package Problem2;

import java.util.Date;

public class FoodProduct extends Product implements Expirable{
    private Date productionDate;
    public FoodProduct(String name, double price, int quantity, AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction);
        this.productionDate = new Date(new Date().getYear(), new Date().getMonth(), new Date().getDate() - 10);
    }

    @Override
    public double getPrice() {
        double currentPrice = this.price();
        if(new Date().getDate() > this.getExpirationDate().getDate() - 15){
            currentPrice *= 0.7;
        }
        return currentPrice;
    }

    @Override
    public Date getExpirationDate() {
        return new Date(productionDate.getYear(), productionDate.getMonth() + 1, productionDate.getDate());
    }
    @Override
    public String toString() {
        return "FoodProduct{" +
                "name='" + this.getName() + '\'' +
                ", price=" + this.getPrice() +
                ", quantity=" + this.getPrice() +
                ", restriction=" + this.getAgeRestriction() +
                ", expiration date=" + this.getExpirationDate() +
                '}';
    }
}
