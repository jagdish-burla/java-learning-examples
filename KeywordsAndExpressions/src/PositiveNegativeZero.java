public class PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(10);
    }
    public static void checkNumber(int number){
        String s = (number > 0) ? "Positive" : ((number < 0) ? "Negative" : "Zero");
        System.out.println(s);
    }
}
