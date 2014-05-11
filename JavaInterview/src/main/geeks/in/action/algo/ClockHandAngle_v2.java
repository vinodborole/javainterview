/**
 * 
 */
package geeks.in.action.algo;

import java.util.Scanner;

/**
 * @author VINOD
 * 
 *         One clock cycle is 360 degree.
 * 
 *         How many degree can the minute hand run per minute? 360 / 60 = 6
 *         degree per minute.
 * 
 *         How many degree can the hour hand run per hour? 360/12 = 30 degree
 *         per hour (since hour hand run slower than minute)
 * 
 *         Since it's easier to calculate in the unit, "minute", let's get
 * 
 *         "how many degree can the hour hand run per minute"?
 * 
 *         30 / 60 = 0.5 degree per minute.
 */
public class ClockHandAngle_v2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Enter hour (1-12) :");
        Scanner hscanner = new Scanner(System.in);
        int hour = hscanner.nextInt();

        System.out.println("Enter minutes (0-59):");
        Scanner mscanner = new Scanner(System.in);
        int minutes = mscanner.nextInt();

        boolean isValidhour = hour > 0 && hour <= 12 ? true : false;
        boolean isValidminutes = minutes >= 0 && minutes <= 59 ? true : false;

        if (isValidhour && isValidminutes) {
            double hDegree = (hour * 30) + (minutes * 0.5);
            double mDegree = minutes * 6;
            double angleDegree = Math.abs(hDegree - mDegree);
            System.out.println("Outer angle between time " + hour + ":" + minutes + " is: " + angleDegree);
            System.out.println("Inner angle between time " + hour + ":" + minutes + " is: " + Math.abs(360 - angleDegree));

        } else {
            System.out.println("Time entered is  not valid time");
        }
    }

}
