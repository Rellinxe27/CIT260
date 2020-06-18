package Week08;

public class W08dot2 {

    public static void main(String[] args){
        System.out.println("**********************************************************************************");
        System.out.println("*   This program uses the Date class to display a set of dates and times.        *\n" +
                           "*                                                                                *");
        System.out.println("**********************************************************************************");
        System.out.println(); // for adding blank line
        
        java.util.Date date = new java.util.Date();

        for (long i = 100000; i <= 1000000000000L; i *= 10) {
            date.setTime(i);
            System.out.println(i +": :" + date.toString());
        }
    }
}
