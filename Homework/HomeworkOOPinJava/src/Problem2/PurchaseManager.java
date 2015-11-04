package Problem2;

import Problem2.Exceptions.BuyerNoPermissionException;
import Problem2.Exceptions.NoEnoughMoney;
import Problem2.Exceptions.NoQuantity;
import Problem2.Exceptions.ProductHasExpired;

import java.util.Date;

public class PurchaseManager {
        public static void processPurchase(Customer customer, Product product) throws BuyerNoPermissionException,
                NoEnoughMoney, NoQuantity, ProductHasExpired {
            if(product.getAgeRestriction() == AgeRestriction.Adult && customer.getAge() < 18){
                throw new BuyerNoPermissionException();
            } else if (product.getAgeRestriction() == AgeRestriction.Teenager && customer.getAge() < 14){
                throw new BuyerNoPermissionException();
            } else if(customer.getBalance() - product.getPrice() < 0) {
                throw new NoEnoughMoney();
            } else if (product.getQuantity() < 1) {
                throw new NoQuantity();
            } else if (product instanceof FoodProduct) {
                FoodProduct productCast = (FoodProduct) product;
                if (productCast.getExpirationDate().getTime() < new Date().getTime()) {
                    throw new ProductHasExpired();
                }
            }
            product.setQuantity(product.getQuantity() - 1);
            customer.setBalance(customer.getBalance() - product.getPrice());
        }
}
