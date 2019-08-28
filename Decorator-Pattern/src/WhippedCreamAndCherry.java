public class WhippedCreamAndCherry extends CondimentDecorator {
    IceCream iceCream;

    public WhippedCreamAndCherry(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public String getDescription() {
        return iceCream.getDescription() + " , Whipped Cream and Cherry on Top";
    }

    public double cost() {
        return .25 + iceCream.cost();
    }
}
