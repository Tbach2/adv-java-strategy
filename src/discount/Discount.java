package discount;

public class Discount implements DiscountStrategy {


    @Override
    public double discount() {
        return 0.5;
    }
}