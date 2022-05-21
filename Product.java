package pl.pjatk;

public class Product
{
    private String code;
    private String name;
    private double price;
    private double discountPrice;

    public Product(String code, String name, double price, double discountPrice)
    {
        this.code = code;
        this.name = name;
        this.price = price;
        this.discountPrice = discountPrice;
    }

    public Product() {}

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public double getDiscountPrice()
    {
        return discountPrice;
    }

    public void setDiscountPrice(double discountPrice)
    {
        this.discountPrice = discountPrice;
    }

    @Override
    public String toString()
    {
        return "\nProduct{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", discountPrice=" + discountPrice +
                '}';
    }
}