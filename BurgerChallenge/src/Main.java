import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.printf("%s%n".repeat(3),
                "Hi There, welcome to McDonalds",
                "Hope you're having a great day. What would you like to order now?",
                "A Regular meal Burger or a Deluxe Burger meal? ");
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine();
        if (userChoice.substring(0,7).toLowerCase().equals("regular")) {
            BurgerMeal mcDonalds = new BurgerMeal("Regular", 2,"small");
        } else if (userChoice.substring(0,6).toLowerCase().equals("deluxe")) {
            BurgerMeal mcDonaldsDel = new DeluxeBurgerMeal("Deluxe", 3,"large");
        }
    }
}
