import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] randomNumbers = new int[10];
        int[] sortedRandomNumber = new int[10];

        for (int i = 0; i < 10; i++) {
            randomNumbers[i] = random.nextInt(1,100);
        }
        System.out.print(Arrays.toString(randomNumbers));
        Arrays.sort(randomNumbers);
        int k = randomNumbers.length - 1;
        for(int j = 0; j < 10 ;j++){
            sortedRandomNumber[j] = randomNumbers[k];
            k--;
        }
        System.out.println(Arrays.toString(sortedRandomNumber));

    }
}
