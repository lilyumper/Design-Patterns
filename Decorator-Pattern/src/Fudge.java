public class Fudge extends CondimentDecorator {
    IceCream iceCream;

    public Fudge(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public String getDescription() {
        return iceCream.getDescription() + " , Hot Fudge";
    }

    public double cost() {
        return .30 + iceCream.cost();
    }
}
