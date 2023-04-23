public class Main {

    public static void main(String[] args) {
        Printer printer =new Printer(60,true);
        printer.addToner(35);
        System.out.println("Toner Left : " + printer.getTonerLevel1());
        printer.printPages(45);
        System.out.println("Total Pages : " + printer.getPagesPrinted());

        Printer printer2 =new Printer(60,true);
        printer2.addToner(99);
        System.out.println("Toner Left : " + printer2.getTonerLevel1());
        printer2.printPages(11);
        System.out.println("Total Pages : " + printer2.getPagesPrinted());
    }
}
