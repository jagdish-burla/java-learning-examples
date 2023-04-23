public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        String instanceOfEngine = this.getClass().getSimpleName();
        System.out.printf("%s Engine Started \n", instanceOfEngine);
    }

    public void drive(){
        this.runEngine();
    }

    protected void runEngine(){
        System.out.println("Driving the vehicle");
    }
}

class gasPoweredCar extends Car{

    private double avgKmPerLitre;
    private int cylinders;

    public gasPoweredCar(String description, double avgKmPerLitre) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Gas Powered engine is getting started");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Gas powered engine is about to move");
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("Gas powered engine is running");
    }
};
class electricCar extends Car{
    double avgKmPerCharge;
    int batterySize;

    public electricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }
    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Battery engine is getting started");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Battery engine is about to move");
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("Battery engine is running");
    }
};
class hybridCar extends Car{
    double avgKmPerLitre;
    int batterySize;
    int cylinders;

    public hybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }
    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Hybrid engine is getting started");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Hybrid engine is about to move");
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("Hybrid engine is running");
    }
};
