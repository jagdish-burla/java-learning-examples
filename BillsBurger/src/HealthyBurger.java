public class HealthyBurger extends Hamburger{

    private String healthyExtra1Name = " ";
    private double healthyExtra1Price = 0;
    private String healthyExtra2Name = " ";
    private double healthyExtra2Price = 0;

    public HealthyBurger( String meat, double price) {
        super("Healthy hamburger", meat, price, "Brown rye roll");
    }

    public void addHealthyAddition1(String extra1Name, double extra1Price){
        if (extra1Name.isEmpty() || extra1Name.isBlank()){
            System.out.println("Toppings name is required");
        }
        else
            this.healthyExtra1Name = extra1Name;

        if (extra1Price > 0) {
            this.healthyExtra1Price = extra1Price;
        }
        else
            System.out.println("Please enter a valid amount for the toppings");
    }
    public void addHealthyAddition2(String extra2Name, double extra2Price){
        if (extra2Name.isEmpty() || extra2Name.isBlank()){
            System.out.println("Toppings name is required");
        }
        else
            this.healthyExtra2Name = extra2Name;

        if (extra2Price > 0) {
            this.healthyExtra2Price = extra2Price;
        }
        else
            System.out.println("Please enter a valid amount for the toppings");
    }

    @Override
    public double itemizeHamburger() {
        System.out.println("Healthy hamburger on a Brown rye roll with "+ super.getMeat() + "price is " +
                super.getPrice());
        if (!healthyExtra1Name.isEmpty() && healthyExtra1Price > 0){
            System.out.println("Added " + healthyExtra1Name + "for an extra " + healthyExtra1Price);
        }
        if (!healthyExtra2Name.isEmpty() && healthyExtra2Price > 0){
            System.out.println("Added " + healthyExtra2Name + " for an extra " + healthyExtra2Price);
        }
        System.out.println("Total Healthy Burger price is " + getPrice());
        return (super.getPrice() + healthyExtra1Price + healthyExtra2Price);
    }
}
