package Week07;
import java.util.Scanner;

public class W07dot1 {

    /**
     * The average Method
     * Purpose: Computes Conversions from Celsius to fahrenheit
     * @param array set as double to store doubles inputs.
     * @return average value for an array of doubles
     */
    public static double average(double[] array){
        double total = 0;
        for (double i : array) {
            total += i;
        }
        return total / array.length;
    }

    public static void main(String[] args) {
        System.out.println("**********************************************************************************");
        System.out.println("*   Given is a program that calculates and returns the average value             *\n" +
                           "*   for an array of doubles.                                                     *");
        System.out.println("**********************************************************************************");
        System.out.println(); // for adding blank line

        Scanner input = new Scanner (System.in);
        final int SIZE = 5;
        double[] array = new double[SIZE];

        for(int i = 0; i < array.length; i++){
            System.out.print("Enter a number: ");
            array[i]  = input.nextDouble();
        }
        System.out.format("The average of these five numbers is %.2f%n", average(array));
        System.out.format("Goodbye... ");
    }
}
