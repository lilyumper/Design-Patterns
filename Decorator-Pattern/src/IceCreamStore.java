public class IceCreamStore {
    public static void main (String args[]){
        //Single Ice Cream
        IceCream iceCream = new Chocolate();
        System.out.println(iceCream.getDescription() + "\n Total $" + iceCream.cost());

        //Mint Chocolate Chip with Nuts and Fudge

        IceCream iceCream2 = new MintChocolateChip();
        iceCream2 = new Fudge(iceCream2);
        iceCream2 = new Nuts(iceCream2);

        System.out.println(iceCream2.getDescription() + "\n Total $" + iceCream2.cost());

        //Strawberry with whipped Cream and cherry

        IceCream iceCream3 = new Strawberry();
        iceCream3 = new WhippedCreamAndCherry(iceCream3);

        System.out.println(iceCream3.getDescription() + "\n Total $" + iceCream3.cost());

        //Vanilla with Everything
        IceCream iceCream4 = new Vanilla();
        iceCream4 = new Fudge(iceCream4);
        iceCream4 = new Nuts(iceCream4);
        iceCream4 = new WhippedCreamAndCherry(iceCream4);

        System.out.println(iceCream4.getDescription() + "\n Total $" + iceCream4.cost());
    }

}