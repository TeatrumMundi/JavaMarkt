package pl.pjatk;

public class Discount300Plus implements ICanCalculateSpecialOffer
{
    @Override
    public boolean canCalculate(Cart cart)
    {
        CartService cartService = new CartService();
        return cartService.getSumOfCart(cart) > 300;
    }

    @Override
    public void calculateOffer(Cart cart)
    {
        for(Product product: cart.getProducts())
        {
            product.setDiscountPrice(0.95 * product.getPrice());
        }
    }
}