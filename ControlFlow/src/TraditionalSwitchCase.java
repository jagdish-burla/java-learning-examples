public class TraditionalSwitchCase {

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
            case 'A':
                System.out.println("Alpha");
                break;
            case 'B':
                System.out.println("Bravo");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Delta");
                break;
            case 'E':
                System.out.println("Echo");
                break;

        }
    }


}
