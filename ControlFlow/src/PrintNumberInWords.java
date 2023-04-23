public class PrintNumberInWords {

    public static void main(String[] args) {
        numberToWords(1450);
    }
        public static void numberToWords(int number){
            String printWord = "";
            if (number < 0) {
                System.out.println("Invalid Value");
            }
            else{
                int reverseNumber = reverse(number);
                int reverseNumberCount = getDigitCount(reverseNumber);
                int orignalNumberCount = getDigitCount(number);
                int zero_count = orignalNumberCount - reverseNumberCount;
                if ( orignalNumberCount >= reverseNumberCount) {
                    if (reverseNumber == 0){System.out.print("Zero");}
                    while (reverseNumber > 0) {
                        int printNumber = (reverseNumber % 10);
                        reverseNumber /= 10;
                        switch (printNumber) {
                            case 0 : { printWord = "Zero"; break;}
                            case 1 : { printWord =  "One"; break;}
                            case 2 : { printWord =  "Two"; break;}
                            case 3 : { printWord =  "Three"; break;}
                            case 4 : { printWord =  "Four"; break;}
                            case 5 : { printWord =  "Five"; break;}
                            case 6 : { printWord =  "Six"; break;}
                            case 7 : { printWord =  "Seven"; break;}
                            case 8 : { printWord =  "Eight"; break;}
                            case 9 : { printWord =  "Nine"; break;}
                            default : { printWord =  "Invalid Number character"; break;}

                        };
                        System.out.print(printWord + " ");
                    }
                    if (zero_count > 0){
                        for (int i = 1; i <= zero_count; i++){
                            System.out.print("Zero" + " ");
                        }
                    }
                }
        }
    }

    public static int reverse(int number){
        int origNumber = 0;
        if (number < 0) {
            origNumber = number;
            number *= -1;
        }
        int reverseNumber = 0;
        int remainder = 0;
        while (number > 0){
            remainder = (number % 10);
            reverseNumber = (reverseNumber * 10) + remainder;
            number = (number / 10);
        }
        if (origNumber < 0){
            return (reverseNumber * -1);
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number){
        int count = 0;
        int zero_count = 0;
        int remainder = 0;
        if (number == 0) {return 1;}
        if (number < 0) {return -1;}
        while(number > 0){
            remainder = (number % 10);
            number /= 10;
            count++;
        }
        return count;
    }
}
