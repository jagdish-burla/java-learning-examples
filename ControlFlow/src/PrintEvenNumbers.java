public class PrintEvenNumbers {
    public static void main(String[] args) {
        int i = 5;
        int evenCount = 0;
        int oddCount = 0;
        while(i < 20){
            if (isEvenNumber(i)){
                evenCount++;
                System.out.println(i + " ");
            }
            else
                {
                    oddCount ++;
                    continue;
                }
            i++;
            if (evenCount == 5){
                break;
            }
        }
        System.out.println("Total Even Numbers : " + evenCount);
        System.out.println("Total Odd Numbers : " + oddCount);
    }

    public  static boolean isEvenNumber(int number){
        if (number % 2 == 0 ){
            return true;
        }
        else return  false;
    }
}
