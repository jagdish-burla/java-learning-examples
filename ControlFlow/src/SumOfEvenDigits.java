public class SumOfEvenDigits {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(24368));
    }

    public static int getEvenDigitSum(int number){
        if (number < 0){
            return -1;
        }
        else{
            int remainder = 0;
            int sumOfEvenNumbers = 0;
            int firstNumber = 0;
            boolean setLastNumber = false;
            while (number > 0){
                remainder = (number % 10);
                if (remainder % 2 == 0){
                    sumOfEvenNumbers += remainder;
                }
                number /= 10;
            }
            return sumOfEvenNumbers;
        }
    }
}
