package Problem2.Exceptions;

public class NoQuantity extends Exception {
    public NoQuantity(){
        super("The product is out of stock!");
    }
}
