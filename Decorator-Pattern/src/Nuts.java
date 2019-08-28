public class Nuts extends CondimentDecorator {
    IceCream iceCream;

    public Nuts(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public String getDescription(){
        return iceCream.getDescription() + " , Crushed Nuts";
    }

    public double cost() {
        return .25 + iceCream.cost();
    }
}
