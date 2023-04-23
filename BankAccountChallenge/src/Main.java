public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.setAccountNumber(123456789);
        acc1.setCustomerName("Jagdish");
        acc1.setEmail("b.jagdish@gmail.com");
        acc1.setPhoneNumber("9999991234");
        acc1.setAccountBalance(100);

        BankAccount acc2 = new BankAccount();
        acc2.setAccountNumber(223456789);
        acc2.setCustomerName("Roja");
        acc2.setEmail("b.roja@gmail.com");
        acc2.setPhoneNumber("8899991234");
        acc2.setAccountBalance(200);

        acc1.depositFunds(123456789, 150);
        System.out.println("Funds available in " + acc1.getCustomerName() +
                                            " account is :" + acc1.getAccountBalance());

        acc2.depositFunds(223456789, 550);
        System.out.println("Funds available in " + acc2.getCustomerName() +
                " account is :" + acc2.getAccountBalance());

        acc1.withdrawFunds(123456789, 50);
        System.out.println("Funds available in " + acc1.getCustomerName() +
                " account is :" + acc1.getAccountBalance());

        acc2.withdrawFunds(223456789, 840);
        System.out.println("Funds available in " + acc2.getCustomerName() +
                " account is :" + acc2.getAccountBalance());

    }
}
