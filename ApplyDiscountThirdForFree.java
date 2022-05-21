package pl.pjatk;

import java.util.Arrays;

public class ApplyDiscountThirdForFree implements ICanCalculateSpecialOffer{

    @Override
    public boolean canCalculate(Cart cart) {
        return cart.getProducts().size() >= 3;
    }

    @Override
    public void calculateOffer(Cart cart) {
        CartService cartService = new CartService();
        Product cheapest = cartService.getCheapestOne(cart.getProducts());
        cheapest.setDiscountPrice(0);
    }
}