/**********************************************************************
 * Program:
 *        Day calculator
 *    Brother Greg Mortensen, CIT260
 * Author:
 *    Rellinxe Boni
 * Summary:
 *     Given a year and a month in that year, this program will tell you
 *     the number of days in that month.
 *
 *    Estimated:  1.0 hrs
 *    Actual:     .35 hrs
 *      Nothing seemed really hard to me
 ************************************************************************/

package Week03;

import java.util.Scanner;

public class W3dot2 {

    public static void main(String[] args) {
        System.out.println("**********************************************************************************");
        System.out.println("*   Given a year and a month in that year, this program will tell you            *\n" +
                           "*   the number of days in that month.                                            *\n" +
                           "*                                                                                *\n" +
                           "*   Ex:                                                                          *\n" +
                           "*           1 = January        7=  July                                          *\n" +
                           "*           2 = February       8 = August                                        *\n" +
                           "*           3 = March          9 = September                                     *\n" +
                           "*           4 = April         10 = October                                       *\n" +
                           "*           5 = May           11 = November                                      *\n" +
                           "*           6 = Jun           12 = December                                      *");
        System.out.println("**********************************************************************************  ");
        System.out.println();

        /*Variables declaration and input*/
        System.out.print("Enter a year: ");
        Scanner userValue = new Scanner(System.in);
        int year = userValue.nextInt();

        System.out.print("Enter a value for the month(1 = Jan, 2 = Feb, etc): ");
        int month = userValue.nextInt();
        System.out.println();

        //Ensure that the day is between 0 and 6 inclusive
        if(month < 1 || month > 12){
            System.out.format("%d is invalid. Month values must be between between 1 and 12, inclusive. ", month);
        }


        // This is for leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        switch (month) {

            case 1:
                System.out.println("January of " + year + " has 31 days in it.");
                break;
            case 2:
                System.out.println("February of " + year + " has" + ((isLeapYear) ? " 29 days" : " 28 days in it."));
                break;
            case 3:
                System.out.println("March of " + year + " has 31 days in it.");
                break;
            case 4:
                System.out.println("April of " + year + " has 30 days in it.");
                break;
            case 5:
                System.out.println("May of " + year + " has 31 days in it. ");
                break;
            case 6:
                System.out.println("June of " + year + " has 30 days in it. ");
                break;
            case 7:
                System.out.println("July of " + year + " has 31 days in it. ");
                break;
            case 8:
                System.out.println("August of " + year + " has 31 days in it. ");
                break;
            case 9:
                System.out.println("September of " + year + " has 30 days in it. ");
                break;
            case 10:
                System.out.println("October of " + year + " has 31 days in it. ");
                break;
            case 11:
                System.out.println("November of " + year + " has 30 days in it. ");
                break;
            case 12:
                System.out.println("December of " + year + " has 31 days in it. ");
                break;
        }

        System.out.println("Goodbye.");
    }
}
