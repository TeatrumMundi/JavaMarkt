package pl.pjatk;

public class ApplyFreeCup implements ICanCalculateSpecialOffer{

    @Override
    public boolean canCalculate(Cart cart) {
        CartService cartService = new CartService();
        return cartService.getSumOfCart(cart) > 200;
    }

    @Override
    public void calculateOffer(Cart cart) {
        Product cup = new Product("999", "kubek", 0, 0);
        cart.addNewProductToCart(cup);
    }
}