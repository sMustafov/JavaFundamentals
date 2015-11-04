package Problem2.Exceptions;

public class ProductHasExpired extends Exception{
    public ProductHasExpired(){
        super("Product has expired!");
    }
}
