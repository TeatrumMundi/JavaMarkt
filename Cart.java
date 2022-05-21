package pl.pjatk;

import java.util.Arrays;
import java.util.List;

public class Cart
{

    private List<Product> products;

    public Cart() {}

    public Cart(List<Product> products)
    {
        this.products = products;
    }

    public List<Product> getProducts()
    {
        return products;
    }

    public void setProducts(List<Product> products)
    {
        this.products = products;
    }

    public void addNewProductToCart(Product product)
    {
        products.add(product);
    }

    public void applyVoucher(Product product)
    {
        double price = product.getPrice();
        product.setDiscountPrice(0.7 * price);
    }

    public void applyDiscount(ICanCalculateSpecialOffer discount)
    {
        if(discount.canCalculate(this))
        {
            discount.calculateOffer(this);
        }
    }

    @Override
    public String toString()
    {
        return "Cart{" +
                "products=" + products +
                '}';
    }
}