import java.util.Scanner;

public class PrintSumOfFiveNumbers {
    public static void main(String[] args) {
     getUserInput();
    }

    public static void getUserInput(){
        int userInput = 0;
        int userInputCount = 0;
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Please enter #" + i + " :");
            try {
                userInput += Integer.parseInt(scanner.nextLine());
                userInputCount++;
                i++;
            }
            catch (Exception e){
                System.out.println("Not a valid Integer value");
            }
        } while ( userInputCount < 5);
        System.out.println("Sum of entered valid Integer Values is : " + userInput);
    }
}
