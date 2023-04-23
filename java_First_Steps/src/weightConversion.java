public class weightConversion {
    public static void main(String[] args) {
        int weightToConvert = 135; /* Weight in Pounds */
        double conversionFactor = 0.45359327;
        double weightInKilograms = weightToConvert * conversionFactor;
        System.out.println("Weight in Kilograms :" + weightInKilograms);
    }
}
