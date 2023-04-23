class Employee extends Worker {
    public static int employeeId = 1;
    private String hireDate;

    public Employee(String name, String birthdate, String endDate, String hireDate) {
        super(name, birthdate, endDate);
        employeeId++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
