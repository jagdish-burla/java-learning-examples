
public class BurgerMeal{
    private String type;
    protected double price = 15;
    private int toppings = 0;
    private String drink;

    public BurgerMeal(String type, int toppings, String drink) {
        this.type = type;
        this.toppings = toppings;
        this.drink = drink;
        orderReady(this.type,this.drink,this.price);
    }

    public BurgerMeal(String type) {
        this(type,0,"small");
    }

    public BurgerMeal(String type, int toppings) {
        this(type,toppings,"small");
    }

    public BurgerMeal(String type, String drink) {
        this(type,0,drink);
    }

    public void addToppings(int noOfToppings){
        if (noOfToppings > 0) {
            if (toppings + noOfToppings <= 3) {
                toppings += noOfToppings;
                addPrice(toppings,this.drink);
            } else if (toppings + noOfToppings > 3) {
                System.out.println("Maximum number of toppings already added.");
            }
        }
        else
            System.out.println("Invalid number of toppings selected");
    }

    public void addPrice(int noOfToppings, String drinkSize){
        double priceOfTopping = 10;
        if (noOfToppings > 0){
            this.price += noOfToppings * priceOfTopping;
        }
        if (drinkSize != " " ) {
            switch (drinkSize){
                case "small" -> this.price += 0;
                case "medium" -> this.price += 5;
                case "large" -> this.price += 10;
            }
        }
    }

    public void orderReady(String type,String drink, double price){
        System.out.printf("%s%n".repeat(4),
                "Hi there, your order is ready",
                "You have ordered " + type + " Burger meal",
                " with " + drink + " drink and",
                " additional side item as "+ type);
        System.out.printf("Your total bill is %f",this.price);
    }
}

class DeluxeBurgerMeal extends BurgerMeal{
    public DeluxeBurgerMeal(String type, int toppings, String drink) {
        super(type, toppings, drink);

    }

    @Override
    public void addToppings(int noOfToppings) {
        super.addToppings(noOfToppings);
    }

    @Override
    public void orderReady(String type, String drink, double price) {
        this.price = 25;
        super.orderReady(type, drink, this.price);
    }
}


