import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {
        getMinAndMaxNumbers();
    }

    public static void getMinAndMaxNumbers(){
        Scanner scanner = new Scanner(System.in);
        int inputNumber = 0, minNumber = 0, maxNumber = 0;
        while (true){
            try{
                System.out.print("Enter a valid number or Press any character to quit: " );
                inputNumber = Integer.parseInt(scanner.nextLine());
                if ((minNumber == 0) && (maxNumber == 0)){
                    minNumber = inputNumber;
                    maxNumber = inputNumber;
                } else if ((inputNumber < maxNumber))
                         {
                    minNumber = inputNumber;
                } else if (inputNumber > maxNumber) {
                    maxNumber = inputNumber;
                }
                System.out.println("Minimum Number : " + minNumber);
                System.out.println("Maximum Number : " + maxNumber);
            }
            catch (Exception e){
                System.out.println("Thank you for trying this program");
                break;
            }
        }
    }
}
