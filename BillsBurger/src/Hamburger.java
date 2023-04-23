public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    private String addition1Name = " ";
    private double addition1Price = 0;
    private String addition2Name = " ";
    private double addition2Price = 0;
    private String addition3Name = " ";
    private double addition3Price = 0;
    private String addition4Name = " ";
    private double addition4Price = 0;

    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        if (addition1Name.isEmpty() || addition1Name.isBlank()){
            System.out.println("Toppings name is required");
        }
        else
            this.addition1Name = addition1Name;

        if (addition1Price > 0) {
            this.addition1Price = addition1Price;
        }
        else
            System.out.println("Please enter a valid amount for the toppings");
    }

    public void addHamburgerAddition2(String addition2Name, double addition2Price){
        if (addition2Name.isEmpty() || addition2Name.isBlank()){
            System.out.println("Toppings name is required");
        }
        else
            this.addition2Name = addition2Name;

        if (addition2Price > 0) {
            this.addition2Price = addition2Price;
        }
        else
            System.out.println("Please enter a valid amount for the toppings");
    }
    public void addHamburgerAddition3(String addition3Name, double addition3Price){
        if (addition3Name.isEmpty() || addition3Name.isBlank()){
        System.out.println("Toppings name is required");
        }
        else
        this.addition3Name = addition3Name;

        if (addition3Price > 0) {
        this.addition3Price = addition3Price;
        }
        else
        System.out.println("Please enter a valid amount for the toppings");
    }
    public void addHamburgerAddition4(String addition4Name, double addition4Price){
        if (addition4Name.isEmpty() || addition4Name.isBlank()){
        System.out.println("Toppings name is required");
        }
        else
        this.addition4Name = addition4Name;

        if (addition4Price > 0) {
        this.addition4Price = addition4Price;
        }
        else
        System.out.println("Please enter a valid amount for the toppings");
    }
    public double itemizeHamburger(){
        System.out.println(this.name + " hamburger on a " + breadRollType + " roll with " + this.meat +
                           ", price is " + this.price);
        if (!addition1Name.isEmpty() && addition1Price > 0){
            System.out.println("Added " + addition1Name + " for an extra " + addition1Price);
        }
        if (!addition2Name.isEmpty() && addition2Price > 0){
            System.out.println("Added " + addition2Name + " for an extra " + addition2Price);
        }
        if (!addition3Name.isEmpty() && addition3Price > 0){
            System.out.println("Added " + addition3Name + " for an extra " + addition3Price);
        }
        if (!addition4Name.isEmpty() && addition4Price > 0){
            System.out.println("Added " + addition4Name + " for an extra " + addition4Price);
        }
        this.price += (this.addition1Price + this.addition2Price + this.addition3Price + this.addition4Price);
        return this.price;
    }
}
