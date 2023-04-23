import java.sql.Ref;

public class SmartKitchen {

    private Refridgrator thisRefridgrator;
    private DishWasher thisDishWasher;
    private CoffeMaker thisCoffeMaker;

    public SmartKitchen(Refridgrator thisRefridgrator, DishWasher thisDishWasher, CoffeMaker thisCoffeMaker) {
        this.thisRefridgrator = thisRefridgrator;
        this.thisDishWasher = thisDishWasher;
        this.thisCoffeMaker = thisCoffeMaker;
    }

    public void addWater(){
        thisCoffeMaker.setHasWorkToDo(true);
    }

    public void pourMilk(){
        thisRefridgrator.setHasWorkToDo(true);
    }

    public void loadDishwasher(){
        thisDishWasher.setHasWorkToDo(true);
    }
    public void setKitchenState(boolean fridgeHasWork, boolean dishWasherHasWork, boolean coffeeMakerHasWork ){
        if (fridgeHasWork){
            pourMilk();
        }
        if (dishWasherHasWork){
            loadDishwasher();
        }
        if (coffeeMakerHasWork){
            addWater();
        }
    }
    public void doKitchenWork(){
        if (thisDishWasher.isHasWorkToDo()){
            thisDishWasher.doDishes();
        }
        if (thisRefridgrator.isHasWorkToDo()){
            thisRefridgrator.orderFood();
        }
        if (thisCoffeMaker.isHasWorkToDo()){
            thisCoffeMaker.brewCoffee();
        }
    }
}
