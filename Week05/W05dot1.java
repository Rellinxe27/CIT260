/**********************************************************************
 * Program:
 *        pounds calculator
 *    Brother Greg Mortensen, CIT260
 * Author:
 *    Rellinxe Boni
 * Summary:
 *     Uses a loop to calculate pounds per kilogram (1 kilogram = 2.2 pounds)
 *     and display the table.
 *
 *    Estimated:  .30 hrs
 *    Actual:     .18 hrs
 *      Easy.
 ************************************************************************/

package Week05;

public class W05dot1 {

    public static void main(String[] args) {
        System.out.println("**********************************************************************************");
        System.out.println("*   Uses a loop to calculate pounds per kilogram (1 kilogram = 2.2 pounds)       *\n" +
                           "*   and display the table below.                                                 *");
        System.out.println("**********************************************************************************");
        System.out.println(); // for adding blank line

        System.out.format("Kilograms %10s%n", "Pounds");
        System.out.format("--------- %10s%n", "------");
        final double POUNDS = 2.2;
        for( int i = 1; i <= 15; i+=2){
            for(; i <= 3; i+=2){
                double result = i * POUNDS;
                System.out.format("%d %15.1f%n", i, result);
            }
            for(; i <= 9; i+=2){
                double result = i * POUNDS;
                System.out.format("%d %16.1f%n", i, result);
            }
            for(; i <= 15; i+=2){
                double result = i * POUNDS;
                System.out.format("%d %15.1f%n", i, result);
            }
        }
        System.out.println("Goodbye.");
    }
}
