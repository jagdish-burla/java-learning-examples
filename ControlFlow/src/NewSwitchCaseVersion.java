public class NewSwitchCaseVersion {

    public static void main(String[] args) {
        printNatoWord('B');
        printNatoWord('B');
        printNatoWord('A');
        printNatoWord('E');
        printNatoWord('D');
        printNatoWord(' ');

    }

    public static void printNatoWord(char alphabet){
        switch (alphabet){
            case 'A' -> System.out.println("Alpha");
            case 'B' -> System.out.println("Bravo");
            case 'C' -> System.out.println("Charlie");
            case 'D' -> System.out.println("Delta");
            case 'E' -> System.out.println("Echo");
            default -> System.out.println("Not a valid NATO Character");

        }
    }
}
