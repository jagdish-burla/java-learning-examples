import java.time.Year;

public class Worker {
    private String name;
    private String birthdate;
    protected String endDate;

    public Worker(String name, String birthdate, String endDate) {
        this.name = name;
        this.birthdate = birthdate;
        this.endDate = endDate;
    }

    public int getAge(){
        int year = Year.now().getValue();
        if (Integer.parseInt(this.birthdate) > year){return 0;}
        else
            return (year - Integer.parseInt(this.birthdate));
    }

    public double collectPay(){
        return 0.0;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
        System.out.println("Your employment will be terminated on :" + this.endDate);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}

