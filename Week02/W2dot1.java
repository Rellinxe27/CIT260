/***********************************************************************
 * Program:
 *    temperature converter
 *    Brother Greg Mortensen, CIT260
 * Author:
 *    Rellinxe Boni
 * Summary:
 *    This program converts a temperature in degrees Celsius into
 *    a temperature in degrees Fahrenheit. Enter a temperature in
 *    degrees Celsius
 *
 *    Estimated:  1.0 hrs
 *    Actual:     .4 hrs
 *      Nothing seemed difficult. Things were smooth.
 ************************************************************************/

package Week02;

import java.util.Scanner;

public class W2dot1 {

    public static void main(String[] args) {
        System.out.println("******************************************************************");
        System.out.println("*   This program converts a temperature in degrees Celsius into  *\n" +
                           "*   a temperature in degrees Fahrenheit. Enter a temperature in  *\n" +
                           "*   degrees Celsius                                              *");
        System.out.println("******************************************************************");
        System.out.println("");

         final double VALUE1 = (9.0 / 5.0);      // Constant
        final double VALUE2 = (32);              // Constant

        Scanner temperature = new Scanner(System.in);

        double celsiusTemp = temperature.nextDouble();
        double fahrenTemp = VALUE1 * celsiusTemp + VALUE2;
        System.out.format("%3.2f degrees Celsius is equal to %3.2f degrees Fahrenheit.\n",celsiusTemp,fahrenTemp);
        System.out.format("Goodbye.");
    }
}
