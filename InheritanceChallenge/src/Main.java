public class Main {

    public static void main(String[] args) {
        SalariedEmployee salEmp = new SalariedEmployee("Jags", "1991", "2042",
                "2020", 3147000);

        salEmp.retire();
        System.out.println(salEmp.getAge());
        System.out.println(salEmp);

        HourlyEmployee hourEmp = new HourlyEmployee("Test","2000","2052",
                "2023",2.5);
        System.out.println(hourEmp.getDoublePay());
        System.out.println(hourEmp);
    }
}
