
public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
    }

    public static int getLargestPrime(int number) {
        int divisiblePrimeNumber = 0;

        if (number < 1) {
            return -1;
        } else {
            for (int i = 2; i <= number; i++) {
                if ((number % i) == 0) {
                    int count = 0;
                    for (int j = 1; j <= i; j++) {

                        if ((i % j) == 0) {
                            count++;
                        }
                    }
                    if (count == 2) {
                        divisiblePrimeNumber = i;
                    }
                }
            }
            return divisiblePrimeNumber;
        }
    }
}
