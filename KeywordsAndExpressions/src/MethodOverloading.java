public class MethodOverloading {

    public static void main(String[] args) {
        System.out.println("Inches to Centimeter conversion : " + convertToCentimeters(65));
        System.out.println("Feet to Centimeter conversion : " + convertToCentimeters(5,8));
    }
    public static double convertToCentimeters(int inches){
        double heightInCentimeters = inches * 2.54;
        return heightInCentimeters;
    }

    public static double convertToCentimeters(int feet, int inches){
        int heightInFeetToInches = feet * 12;
        double heightInCentimeters = convertToCentimeters(heightInFeetToInches + inches);
        return heightInCentimeters;
    }
}
