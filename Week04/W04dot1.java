/**********************************************************************
 * Program:
 *        Digits converter
 *    Brother Greg Mortensen, CIT260
 * Author:
 *    Rellinxe Boni
 * Summary:
 *     This program converts a hexadecimal digit into a four digit binary number
 *
 *    Estimated:  1.30 hrs
 *    Actual:     1.15 hrs
 *      i first had difficulties in handling the Hexadecimals letters errors.
 ************************************************************************/

package Week04;
import java.util.Scanner;

public class W04dot1 {

    public static void main(String[] args) {
        System.out.println("**********************************************************************************");
        System.out.println("*   This program converts a hexadecimal digit into a four digit binary number    *\n" +
                           "*                                                                                *");
        System.out.println("**********************************************************************************");
        System.out.println(); // for adding blank line

        System.out.print("Enter a hexadecimal number: ");
        Scanner hexa = new Scanner(System.in);
        String input1 = hexa.next();
        System.out.println();   // for adding blank line

        /*It ends the program when someone types more than 2 Characters.
         * It also prevents typing below 0 and beyond 9.*/
        if (input1.length() > 1) {
            System.out.println("Please enter a single Character.");
            System.exit(0);
        }

        switch (input1) {
            case "0":
                System.out.println("The binary value is 0000.\n" + "Goodbye.");
                System.exit(0);
            case "1":
                System.out.println("The binary value is 0001.\n" + "Goodbye.");
                System.exit(0);
            case "2":
                System.out.println("The binary value is 0010.\n" + "Goodbye.");
                System.exit(0);
            case "3":
                System.out.println("The binary value is 0011.\n" + "Goodbye.");
                System.exit(0);
            case "4":
                System.out.println("The binary value is 0100.\n" + "Goodbye.");
                System.exit(0);
            case "5":
                System.out.println("The binary value is 0101.\n" + "Goodbye.");
                System.exit(0);
            case "6":
                System.out.println("The binary value is 0110.\n" + "Goodbye.");
                System.exit(0);
            case "7":
                System.out.println("The binary value is 0111.\n" + "Goodbye.");
                System.exit(0);
            case "8":
                System.out.println("The binary value is 1000.\n" + "Goodbye.");
                System.exit(0);
            case "9":
                System.out.println("The binary value is 1001.\n" + "Goodbye.");
                System.exit(0);
            case "A":
                System.out.println("The binary value is 1010.\n" + "Goodbye.");
                System.exit(0);
            case "B":
                System.out.println("The binary value is 1011.\n" + "Goodbye.");
                System.exit(0);
            case "C":
                System.out.println("The binary value is 1100.\n" + "Goodbye.");
                System.exit(0);
            case "D":
                System.out.println("The binary value is 1101.\n" + "Goodbye.");
                System.exit(0);
            case "E":
                System.out.println("The binary value is 1110.\n" + "Goodbye.");
                System.exit(0);
            case "F":
                System.out.println("The binary value is 1111.\n" + "Goodbye.");
                System.exit(0);

                //It prevents from typing hexadecimal other than A to F.
            default:
                System.out.println(input1 + " is not a valid hexadecimal digit.\n" + "Goodbye.");
        }
    }
}