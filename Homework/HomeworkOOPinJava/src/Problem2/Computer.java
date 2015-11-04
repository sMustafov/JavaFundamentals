package Problem2;

import java.time.Period;

public class Computer extends ElectronicsProduct{
    public Computer(String name, double price, int quantity, AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction, Period.ofYears(2));
    }

    @Override
    public double getPrice() {
        double price = this.price();
        if(this.getQuantity() > 1000) {
            price *= 0.95;
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
