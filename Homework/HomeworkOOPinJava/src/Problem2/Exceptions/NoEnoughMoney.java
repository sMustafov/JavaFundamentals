package Problem2.Exceptions;

public class NoEnoughMoney extends Exception{
    public NoEnoughMoney(){
        super("You do not have enough money to buy this product!");
    }
}
