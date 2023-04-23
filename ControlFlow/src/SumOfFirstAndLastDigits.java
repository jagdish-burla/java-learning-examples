public class SumOfFirstAndLastDigits {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(20));
    }

    public static int sumFirstAndLastDigit(int number){
        if (number < 0){
            return -1;
        }
        else if (number < 10){
            return number * 2;
        }
        else{
            int remainder = 0;
            int lastNumber = 0;
            int firstNumber = 0;
            boolean setLastNumber = false;
            while (number > 0){
                remainder = (number % 10);
                if (!setLastNumber){
                    lastNumber = remainder;
                    setLastNumber = true;
                }
                number /= 10;
                if (number > 0) {
                    firstNumber = number;
                }
            }
            return firstNumber + lastNumber;
        }
    }
}
