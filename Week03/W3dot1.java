/**********************************************************************
 * Program:
 *        Day calculator
 *    Brother Greg Mortensen, CIT260
 * Author:
 *    Rellinxe Boni
 * Summary:
 *     Given today's day of the week and some number of days in the future
 *     this program will tell you the day of the week for the future day.
 *
 *    Estimated:  1.0 hrs
 *    Actual:     2.1 hrs
 *      I was stuck on how to find the easiest or shortest way possible to
 *      write this program.
 ************************************************************************/

package Week03;

import java.util.Scanner;

public class W3dot1 {

    public static void main(String[] args) {
        System.out.println("**********************************************************************************");
        System.out.println("*   Given today's day of the week and some number of days in the future          *\n" +
                           "*   this program will tell you the day of the week for the future day.           *\n" +
                           "*                                                                                *\n" +
                           "*   Ex:                                                                          *\n" +
                           "*           0 = Sunday                                                           *\n" +
                           "*           1 = Monday                                                           *\n" +
                           "*           3 = Wednesday                                                        *\n" +
                           "*           4 = Thursday                                                         *\n" +
                           "*           5 = Friday                                                           *\n" +
                           "*           6 = Saturday                                                         *");
        System.out.println("**********************************************************************************  ");
        System.out.println();

        /*Variables declaration and input*/
        System.out.print("Enter today's day of the week (0 for Sunday, 1 for Monday, etc): ");
        Scanner dayNumber = new Scanner(System.in);
        int day = dayNumber.nextInt();

        System.out.print("Enter the number of days in the future: ");
        int daysInFuture = dayNumber.nextInt();
        System.out.println();

        int futureDays = (day + daysInFuture) % 7; // 7 for the days of the week and modulus 7 to get the day number

        //Ensure that the day is between 0 and 6 inclusive
        
        //Ensure that the future days are not negative
        if(daysInFuture < 0){
            System.out.format("%d is invalid. You must enter a positive number\n", daysInFuture);
        }
        for(; day < 0 || day > 6; day++){
            System.out.println("Error! This is not a day of the week ");
        }

        //Conditions to verify
        System.out.print("Today is ");
        switch(day){
            case 0 : System.out.print("Sunday");
                break;
            case 1: System.out.print("Monday");
                break;
            case 2: System.out.print("Tuesday");
                break;
            case 3: System.out.print("Wednesday");
                break;
            case 4: System.out.print("Thursday");
                break;
            case 5: System.out.print("Friday");
                break;
            case 6: System.out.print("Saturday");
                break;

            default: System.out.println("Error! This is not a day of the week ");

        }

        System.out.print(" and the future day is ");
        switch(futureDays){
            case 0 : System.out.println("Sunday.");
                break;
            case 1: System.out.println("Monday.");
                break;
            case 2: System.out.println("Tuesday.");
                break;
            case 3: System.out.println("Wednesday.");
                break;
            case 4: System.out.println("Thursday.");
                break;
            case 5: System.out.println("Friday.");
                break;
            case 6: System.out.println("Saturday.");
                break;
        }

        System.out.println("Goodbye.");
    }
}
