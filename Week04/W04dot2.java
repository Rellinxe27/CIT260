/**********************************************************************
 * Program:
 *          Pay Stub
 *    Brother Greg Mortensen, CIT260
 * Author:
 *    Rellinxe Boni
 * Summary:
 *     Given your name, hours worked, and hourly wage, this program calculates
 *     your gross pay, state withholding tax, federal withholding tax, and your net pay.
 *     It then displays your pay stub.
 *
 *    Estimated:  1.30 hrs
 *    Actual:     1.45 hrs
 *      I had hard time working on rounding the net Pay .
 ************************************************************************/

package Week04;
import java.util.Scanner;

public class W04dot2 {

    public static void main(String[] args) {
        System.out.println("****************************************************************************************");
        System.out.println("*   Given your name, hours worked, and hourly wage, this program calculates            *\n" +
                           "*   your gross pay, state withholding tax, federal withholding tax, and your net pay.  *\n" +
                           "*   It then displays your pay stub.                                                    *\n" +
                           "*                                                                                      *");
        System.out.println("****************************************************************************************");
        System.out.println(); // for adding blank line

        System.out.print("Enter your first and last name: ");
        Scanner person = new Scanner(System.in);
        String lNameFname = person.nextLine();

        final double STATETAX = 9; // Constant for the state withholding tax.
        final double FEDERALTAX = 20; // Constant for the federal withholding tax.

        System.out.print("Enter the hours you worked this week: ");
        double hoursWorked = person.nextDouble();

        System.out.print("Enter your hourly wage: ");
        double hourlyWage = person.nextDouble();
        System.out.println();   // for adding blank line

        /*dividing by 100.0 instead of 100 gives me
         * the exact rounding I wanted, 8.78.*/
        double stateTaxWithheld = (STATETAX * hourlyWage * hoursWorked)/100.0;     //computes the State tax
        double federalTaxWithheld = (FEDERALTAX * hourlyWage * hoursWorked)/100.0; //computes the Federal tax
        double grossPay = hourlyWage * hoursWorked;                                          //computes the Gross Pay
        double netPay =  grossPay - stateTaxWithheld - federalTaxWithheld;                  //computes the Net Pay

        // This ouputs the program on the screen
        System.out.format("Pay Stub for %s%n", lNameFname);
        System.out.format("Hours Worked: %17.1fhr%n", hoursWorked);
        System.out.format("Hours Wage: %20.2f$%n", hourlyWage);
        System.out.format("State Tax Withheld: %12.2f$%n", stateTaxWithheld);
        System.out.format("Gross Pay: %21.2f$%n", grossPay);
        System.out.format("Federal Tax Withheld: %10.2f$%n", federalTaxWithheld);
        System.out.format("Net Pay: %23.2f$%n", netPay);
        System.out.println();                                                     // for adding blank line
        System.out.println("Goodbye.");
    }
}