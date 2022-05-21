package pl.pjatk;

public interface ICanCalculateSpecialOffer
{
    boolean canCalculate(Cart cart);

    void calculateOffer(Cart cart);
}