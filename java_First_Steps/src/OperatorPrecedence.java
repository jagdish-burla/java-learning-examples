public class OperatorPrecedence {
    public static void main(String[] args) {
        double var1 = 20.00;
        double var2 = 80.00;
        double var3 = ((var1 + var2 ) * 100) % 40.0d;
        boolean divisible = (var3 == 0.0)? true: false;
        System.out.println(divisible);
        if (divisible != true){
            System.out.println("got some remainder");
        }
    }
}
