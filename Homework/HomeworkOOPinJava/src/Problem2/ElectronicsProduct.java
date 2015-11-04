package Problem2;

import java.time.Period;

public abstract class ElectronicsProduct extends Product{
    protected Period guaranteePeriod;

    public ElectronicsProduct(String name, double price, int quantity, AgeRestriction ageRestriction,
                              Period guaranteePeriod){
        super(name,price,quantity,ageRestriction);
        this.guaranteePeriod = guaranteePeriod;
    }

    @Override
    public double getPrice() {
        double price = this.price();
        if(this.getQuantity() < 50) {
            price *= 1.05;
        }
        return price;
    }
    @Override
    public String toString() {
        return "Appliance{" +
                "name='" + this.getName() + '\'' +
                ", price=" + this.getPrice() +
                ", quantity=" + this.getQuantity() +
                ", restriction=" + this.getAgeRestriction() +
                '}';
    }
}
