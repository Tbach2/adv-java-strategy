package discount;

public class Liquidation implements DiscountStrategy {


    @Override
    public double discount() {
        return 0.75;
    }

}