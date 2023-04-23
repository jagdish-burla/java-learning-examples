public class Main {

    public static void main(String[] args) {

        Car toyota = new hybridCar("Hyryder",25,5000,4);
        Car maruti = new gasPoweredCar("Swift",22);
        Car tata = new electricCar("Nexon",25,6000);

        tata.startEngine();
        tata.drive();

        toyota.startEngine();
        toyota.drive();

        maruti.startEngine();
        maruti.drive();

        System.out.println(toyota instanceof gasPoweredCar);

    }
}
