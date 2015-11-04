package Problem2.Exceptions;

public class BuyerNoPermissionException extends Exception {
    public BuyerNoPermissionException(){
        super("You are too young to buy this product!");
    }

}
