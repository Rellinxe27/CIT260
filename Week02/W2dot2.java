/**********************************************************************
 * Program:
 *    tip, tax and bill calculator
 *    Brother Greg Mortensen, CIT260
 * Author:
 *    Rellinxe Boni
 * Summary:
 *    Given the price of a meal and a percentage to use for the tip,
 *    this program calculates the tip, the tax, and the total amount of the bill.
 *    Enter the cost of the meal: 12.50
 *    Enter the tip percentage: 15
 *
 *    Estimated:  1.0 hrs
 *    Actual:     .3 hrs
 *      Things were smooth.
 ************************************************************************/

package Week02;

import java.util.Scanner;

public class W2dot2 {
    public static void main(String[] args){
        System.out.println("**********************************************************************************");
        System.out.println("*   Given the price of a meal and a percentage to use for the tip,               *\n" +
                           "*   this program calculates the tip, the tax, and the total amount of the bill.  *\n" +
                           "*   Enter the cost of the meal: 12.50                                            *\n" +
                           "*   Enter the tip percentage: 15                                                 *");
        System.out.println("**********************************************************************************  ");
        System.out.println("");

        /*Variables declaration and input*/
        System.out.print("Enter a value for the cost of your meal: ");
        Scanner tipTaxBill = new Scanner(System.in);                    //
        double mealCost = tipTaxBill.nextDouble();                      //Prompts the user for for the meal cost.
        System.out.print("Enter a percentage value for the tip: ");
        double tip = tipTaxBill.nextDouble();                         //Prompts the user for percentage value for the tip
        double tax = 3.2/ 100;                                         //store 3.2% in tax

        /*Computation  of Tip, Tax and Total Bill*/
        double valueOfTip = mealCost * (tip / 100);
        double taxOnMeal = mealCost * tax;
        double totalBill = mealCost + valueOfTip + taxOnMeal;

        /*Display the result after computation*/
        System.out.format("The tip is $%.2f\n", valueOfTip);
        System.out.format("The tax is $%.2f\n", taxOnMeal);
        System.out.format("The total bill is $%.2f\n", totalBill);
        System.out.format("Goodbye.");

    }
}
