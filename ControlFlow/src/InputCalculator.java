import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenSumAndAverage();
    }

    public static void inputThenSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        double sum = 0, count =0;
        double avg = 0;
        long avgRounded = 0;
        System.out.println("Enter the valid integer Number");
            while (true) {
                try{
                    sum += Integer.parseInt(scanner.nextLine());
                    count++;
                    avg = Math.round((sum / count));
                    avgRounded = (long)(avg);
                }catch (Exception e){
                    System.out.println("SUM = "+ sum + " AVG = "+ avgRounded);
                    break;
                }
            }
    }
}
