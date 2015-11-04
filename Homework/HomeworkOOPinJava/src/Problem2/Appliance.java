package Problem2;

import java.time.Period;

public abstract class Appliance extends ElectronicsProduct{
    public Appliance (String name, double price, int quantity, AgeRestriction ageRestriction){
        super(name, price, quantity, ageRestriction, Period.ofMonths(6));
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
