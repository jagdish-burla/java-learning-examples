public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(23,43));
    }

    public static boolean hasSharedDigit(int num1, int num2){
        boolean response = false;
        if (( num1 >= 10 && num1 <= 99) && ( num2 >= 10 && num2 <= 99)) {
            int firstnum_first_digit = 0, firstnum_last_digit = 0;
            int secondnum_first_digit = 0, secondnum_last_digit = 0;

            firstnum_first_digit = (num1 / 10);
            firstnum_last_digit = (num1 % 10);
            secondnum_first_digit = (num2 / 10);
            secondnum_last_digit = (num2 % 10);

            if ((firstnum_last_digit == secondnum_last_digit) ||
                    (firstnum_last_digit == secondnum_first_digit) ||
                    (firstnum_first_digit == secondnum_first_digit) ||
                    (firstnum_first_digit == secondnum_last_digit)){
                response = true;
            }
        }
        else
        response = false;
        return response;
    }
}
