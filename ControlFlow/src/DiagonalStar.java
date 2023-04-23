public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(8);
    }

    public static void printSquareStar(int number){
        if (number < 5){
            System.out.println("Invalid Value");
        }
        else
        {
            for(int i = 1; i <= number; i++){
                for (int k = 1; k <= number; k++ ) {
                    if ((i == 1) || (i == number)) {
                        System.out.print('*');
                    } else if ((i != 1) && (i != number)) {
                        if ((k == 1) || (k == number)) {
                            System.out.print('*');
                        } else if (i == k) {
                            System.out.print('*');
                        } else if (k == (number - i + 1)) {
                            System.out.print('*');
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println("");
                }
            }
        }
    }

