public class Main {

    public static void main(String[] args) {
        System.out.println(getDuration(-895));
        System.out.println(getDuration(-350,585));
        System.out.println(getDuration(445,485));
    }

    public static String getDuration(int seconds){
        if (seconds > 0) {
            int MM = 0, SS = 0;
            int HH = (seconds / 3600);
            if (HH > 0) {
                MM = (seconds - (HH * 3600)) / 60;
            } else {
                MM = (seconds / 60);
            }
            if (HH > 0 || MM > 0) {
                SS = seconds - ((HH * 3600) + (MM * 60));
            }
            else {
                SS = seconds;
            }
            return (HH + " h " + MM + " m " + SS + " s ");
        }
        else
        {
            return("Input seconds value should be greater than 0");
        }
    }

    public static String getDuration(int minutes, int seconds){
        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            int minutesToSeconds = minutes * 60;
            return (getDuration(minutesToSeconds + seconds));
        } else if (seconds >= 0 && seconds <= 59) {
            System.out.println(seconds);
            return getDuration(seconds);
        } else
        {
            return ("Input minutes and seconds value should be greater than 0");
        }
    }
}
