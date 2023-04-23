public class KmphToMphConversion {
    public static void main(String[] args) {
        int kmph = 25;
        System.out.println("KMPH to MPH Conversion of " + kmph + " : " +toMilesPerHour(kmph));

    }
    public static long toMilesPerHour(double kilometersPerHour){
        double returnValue = (kilometersPerHour < 0) ? -1 : kilometersPerHour * 0.621371;
        long milesPerHour = Math.round(returnValue);
        return milesPerHour;
    }
}
