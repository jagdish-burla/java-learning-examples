class HourlyEmployee extends Employee {
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthdate, String endDate,
                          String hireDate, double hourlyPayRate) {
        super(name, birthdate, endDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +
                ", endDate='" + endDate + '\'' +
                "} " + super.toString();
    }

    public double getDoublePay() {
        return (collectPay() * 2);
    }

    @Override
    public double collectPay() {
        return 40 * hourlyPayRate;
    }


}
