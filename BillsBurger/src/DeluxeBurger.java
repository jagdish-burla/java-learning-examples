public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe", "Chicken", 19.10, "GarlicBread");
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("No additional items can be added to Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("No additional items can be added to Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("No additional items can be added to Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("No additional items can be added to Deluxe Burger");
    }

    @Override
    public double itemizeHamburger() {
        System.out.println("Deluxe Hamburger on a white roll with sausage & Bacon, price is 14.54");
        System.out.println("Added chips for an extra 2.75");
        System.out.println("Added Drink for an extra 1.81");
        return 19.10;
    }
}
