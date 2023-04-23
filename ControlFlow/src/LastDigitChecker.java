public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(isValid(9));
        //System.out.println(hasSameLastDigit(234,456,547));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        int num1_last_digit = 0, num2_last_digit = 0, num3_last_digit = 0;
        if ((isValid(num1)) && (isValid(num2)) && (isValid(num3))){
            num1_last_digit = (num1 % 10);
            num2_last_digit = (num2 % 10);
            num3_last_digit = (num3 % 10);

            if ((num1_last_digit == num2_last_digit) ||
                (num1_last_digit == num3_last_digit) ||
                (num2_last_digit == num3_last_digit))
            {
                return  true;
            }
            else {
                return false;
            }
        }
        return false;
    }

    public static boolean isValid(int number){
        if (number >= 10 && number <= 1000){
            return true;
        }
        else
            return false;
    }
}
