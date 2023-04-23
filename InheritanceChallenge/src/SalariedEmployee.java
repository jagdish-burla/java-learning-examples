class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthdate, String endDate,
                            String hireDate, double annualSalary) {
        super(name, birthdate, endDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                ", endDate='" + endDate + '\'' +
                "} " + super.toString();
    }

    public void retire() {
        System.out.println("You're retirement date is : " + this.endDate);
    }
}
