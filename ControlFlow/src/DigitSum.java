public class DigitSum {
    public static void main(String[] args) {
        int num = 9;
        System.out.println("Sum of digits of number : " + num + " is " + sumDigits(num));
    }

    public static int sumDigits(int number){
        int sumOfDigits = 0;
        while (number > 0){
            sumOfDigits += (number % 10);
            number = (number /10);
        }
        return sumOfDigits;
    }
}
