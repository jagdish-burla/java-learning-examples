public class Customer {

    private String name;
    private String email;
    private double creditLimit;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public Customer() {
        this("Jagdish","b.jagdish242@gmail.com",50000.0);
        System.out.println("Name : " + this.name + " Email : " + this.email + " CreditLimit : " + this.creditLimit );
    }

    public Customer(String name, String email) {
        this(name,email,10000);
        System.out.println("Name : " + this.name + " Email : " + this.email + " CreditLimit : " + this.creditLimit );
    }

    public Customer(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
        System.out.println("Name : " + this.name + " Email : " + this.email + " CreditLimit : " + this.creditLimit );
    }

}
