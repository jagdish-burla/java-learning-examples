public class SumOf3And5Challenge {
    public static void main(String[] args) {
        int count = 0;
        int sum =0;
        for(int i = 1; i <= 1000; i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                count++;
                sum += i;
            }
            if (count == 5){
                break;
            }
        }
        System.out.println("Sum of numbers divisible by 3 & 5 are : " + sum);
    }
}
