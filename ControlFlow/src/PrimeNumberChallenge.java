public class PrimeNumberChallenge {
    public static void main(String[] args) {
        int primeNumberCounter = 0;
        int numberToCheck = 35;
        for (int i = numberToCheck; i <= 1000; i++){
            if (isPrime(i)){
                System.out.println("Prime Number : " + i);
                primeNumberCounter += 1;
            }
            if (primeNumberCounter == 3){
                break;
            }
        }
    }

    public static boolean isPrime(int valueToCheck){
        int count = 0;
        for (int i = 1; i <= valueToCheck; i++) {
            if (valueToCheck % i == 0) {
                count++;
            }
        }
            if (count == 2){
                return true;
            }
            else
                return false;
    }

}
