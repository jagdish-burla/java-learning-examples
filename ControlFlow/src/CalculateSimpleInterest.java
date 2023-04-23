public class CalculateSimpleInterest {
    public static void main(String[] args) {
        for (double interestRate = 7.5; interestRate <= 10; interestRate += 0.25){
            System.out.println("Interest for $100 @ " + interestRate + " : " +
                    calculateInterest(100, interestRate));
        }
    }

    public static double calculateInterest(double principle, double interestRate){
        return (principle * (interestRate /100));
    }
}
