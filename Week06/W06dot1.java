package Week06;

import java.util.Scanner;

public class W06dot1 {

    public static double futureValue(double investmentAmount, double monthlyInterestRate, int years){

        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }

    public static void main(String[] args) {
        System.out.println("**********************************************************************************");
        System.out.println("*   Given an investment amount and an annual interest rate, this program will    *\n" +
                "*   calculate the future value of the investment for a period of ten years.      *");
        System.out.println("**********************************************************************************");
        System.out.println(); // for adding blank line

        System.out.print("Enter the a positive, non-zero value for the investment: ");

        Scanner input = new Scanner (System.in);
        double investmentAmount = input.nextDouble();

        System.out.print("Enter an annual interest rate, between 0 and 100: ");
        double annualInterest = input.nextDouble();

        if(investmentAmount <= 0){
            System.out.println("Error! please enter a positive or non-zero value");
            System.exit(0);
        }
        if(annualInterest < 0 || annualInterest>= 100){
            System.out.println("Error! please enter an annualInterest between 0 and 100");
            System.exit(0);
        }

        //Gets the monthly interest rate
        double monthlyInterestRate = (annualInterest / 12) / 100;

        System.out.println();
        System.out.println("Years       Future Value");
        System.out.println("========================");

        for(int i = 1; i <= 10; i++){
            System.out.format("%d %11s%.2f%n", i, "$", futureValue(investmentAmount, monthlyInterestRate, i));
        }
        System.out.println();
        System.out.println("Goodbye...");
    }
}