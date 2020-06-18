/**********************************************************************
 * Program:
 *
 *    Brother Greg Mortensen, CIT260
 * Author:
 *    Rellinxe Boni
 * Summary:
 *     Uses a loop to display a table of all of the numbers from 100 to 1000
 *     that are divisible by both 5 and 6. The numbers will be separated by
 *     exactly one space and there will 10 numbers per line.
 *
 *    Estimated:  .30 hrs
 *    Actual:     .18 hrs
 *      how to nest the counting loops in order to display as the instruction said
 *      was a little bit challenging to me.
 ************************************************************************/

package Week05;

public class W05dot2 {
    public static void main(String[] args) {
            System.out.println("**********************************************************************************");
            System.out.println("*   Uses a loop to display a table of all of the numbers from 100 to 1000        *\n" +
                               "*   that are divisible by both 5 and 6. The numbers will be separated by         *\n" +
                               "*    exactly one space and there will 10 numbers per line.                       *\n" +
                               "*                                                                                *");
            System.out.println("********************************************************************************** ");
            System.out.println();

            int i = 100;                            //Global initializer
            for ( ;i < 1000; i++ ){
                for ( ;i < 400; i++ ){              //This loops displays the first line from 120 to 390
                    if(i % 5 == 0 && i % 6 == 0) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();           //Ensures to start the second line

                for ( ;i < 700; i++ ){              //This loops displays the first line from 420 to 690
                    if(i % 5 == 0 && i % 6 == 0) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();             //Ensures to start the third line

                for ( ;i < 1000; i++ ){                 //This loops displays the first line from 720 to 990
                    if(i % 5 == 0 && i % 6 == 0) {
                        System.out.print(i + " ");
                    }
                }
            }
        System.out.println();
        System.out.println("Goodbye.");
    }
}
