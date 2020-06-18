package Week06;

public class W06dot2 {
    /**
     * The CelsiusTofahrenheit Method
     * Purpose: Computes Conversions from Celsius to fahrenheit
     * @param tempCelsius set as double to store Celsius values.
     * @return the double value entered by the user
     */
    public static double celsiusToFahrenheit(double tempCelsius){

        final double VALUE1 = 9.0 / 5.0;      // Constant
        final double VALUE2 = 32;             // Constant

        return VALUE1 * tempCelsius + VALUE2;
    }

    /**
     * The fahrenheitToCelsius Method
     * Purpose: Computes Conversions from fahrenheit to Celsius
     * @param  tempFahrenheit set as double to store fahrenheit values
     * @return the formula to compute fahrenheit
     */
    public static double fahrenheitToCelsius(double tempFahrenheit){

        final double VALUE1 = 5.0 / 9.0;              // Constant
        final double VALUE2 = 32;                     // Constant

        return VALUE1 * (tempFahrenheit - VALUE2);
    }

    public static void main(String[] args) {
        System.out.println("**********************************************************************************");
        System.out.println("*   Given is a program that computes conversions from Celsius to Fahrenheit and  *\n" +
                "*   from Fahrenheit to Celsius.                                                  *");
        System.out.println("**********************************************************************************");
        System.out.println(); // for adding blank line

        double tempCelsius = 40.0;
        double tempFahrenheit = 120.0;

        System.out.format("Celsius %15s %3s", "Fahrenheit", "|");
        System.out.format("%13s %12s%n", "Fahrenheit", "Celsius");
        System.out.println("-----------------------------------------------------");

        for(int i = 10; i>=1; tempCelsius--, tempFahrenheit-=10, i--){
            System.out.format("%.1f %13.1f %8s",tempCelsius ,celsiusToFahrenheit(tempCelsius), "|");
            System.out.format("%8.1f %16.2f%n",tempFahrenheit ,fahrenheitToCelsius(tempFahrenheit));
        }
        System.out.println();
        System.out.println("Goodbye...");
    }
}
