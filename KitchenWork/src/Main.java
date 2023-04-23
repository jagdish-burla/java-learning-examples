import java.sql.Ref;

public class Main {
    public static void main(String[] args) {
        Refridgrator refridgrator = new Refridgrator(true);
        DishWasher dishWasher = new DishWasher(false);
        CoffeMaker coffeMaker = new CoffeMaker(true);
        SmartKitchen smartKitchen = new SmartKitchen(refridgrator,dishWasher,coffeMaker);
        smartKitchen.setKitchenState(true, false, true);
        smartKitchen.doKitchenWork();
    }
}
