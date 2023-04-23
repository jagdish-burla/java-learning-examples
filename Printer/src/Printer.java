public class Printer {
    private int tonerLevel1;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel1, boolean duplex) {
        this.tonerLevel1 = (tonerLevel1 > 0 && tonerLevel1 < 100) ? tonerLevel1 : -1;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int getTonerLevel1() {
        return this.tonerLevel1;
    }

    public int getPagesPrinted() {
        return this.pagesPrinted;
    }

    public int addToner(int tonerAmount){
        if (((this.tonerLevel1 + tonerAmount) < 0) | ((this.tonerLevel1 + tonerAmount) > 100) ){
            return -1;
        }
        else {
            this.tonerLevel1 += tonerAmount;
            return (this.tonerLevel1);
        }
    }

    public int printPages(int pages){
        if (this.duplex){
            System.out.println("This is a Duplex Printer");
            this.pagesPrinted += ((pages/2) + (pages%2));
            return this.pagesPrinted;
        }
        else{
            this.pagesPrinted += pages;
            return this.pagesPrinted;
        }

    }
}
