public class BankAccount {

    private int accountNumber;
    private String customerName;
    private String email;
    private String phoneNumber;
    private double accountBalance = 0;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void depositFunds(int accountNumber,double amount){
        if (this.accountNumber == accountNumber){
            this.accountBalance += amount;
        }
    }

    public void withdrawFunds(int accountNumber, double amount){
        if (this.accountNumber == accountNumber){
            if (this.accountBalance > amount) {
                this.accountBalance -= amount;
            }
            else{
                System.out.println("Insufficient funds");
            }
        }
    }
}
