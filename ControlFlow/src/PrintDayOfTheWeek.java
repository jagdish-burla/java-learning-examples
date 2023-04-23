public class PrintDayOfTheWeek {

    public static void main(String[] args) {
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);

        System.out.println("If-Then-Else logic");

        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);
    }

    public static void printDayOfWeek(int day){
        switch (day){
            case 0 -> System.out.println("Day " + day + " is Sunday");
            case 1 -> System.out.println("Day " + day + " is Monday");
            case 2 -> System.out.println("Day " + day + " is Tuesday");
            case 3 -> System.out.println("Day " + day + " is Wednesday");
            case 4 -> System.out.println("Day " + day + " is Thursday");
            case 5 -> System.out.println("Day " + day + " is Friday");
            case 6 -> System.out.println("Day " + day + " is Saturday");
            default -> System.out.println("Not a valid day of the week");
        }

    }

    public static void printDayOfTheWeek(int day){
     if (day == 0){
         System.out.println("Day " + day + " is Sunday");
     }
     else if (day == 1){
         System.out.println("Day " + day + " is Monday");
     }
     else if (day == 2){
         System.out.println("Day " + day + " is Tuesday");
        }
     else if (day == 3){
         System.out.println("Day " + day + " is Wednesday");
     }
     else if (day == 4){
         System.out.println("Day " + day + " is Thursday");
     }
     else if (day == 5){
         System.out.println("Day " + day + " is Friday");
     }
     else if (day == 6){
         System.out.println("Day " + day + " is Saturday");
     }
     else
         System.out.println("InValid day");
    }
}
