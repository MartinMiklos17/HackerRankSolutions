/*
Problem: https://www.hackerrank.com/challenges/java-date-and-time/problem
 */
//givenCode
import java.util.Scanner;

//Solution
import java.util.Calendar;

public class Solution {

    public static String getDay(String day, String month, String year) {
        Calendar cal = Calendar.getInstance();		creating a local calendar object
        cal.set(Integer.parseInt(year), Integer.parseInt(month) - 1, Integer.parseInt(day));  //set calendar to the input date
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);  //get the value of the field
        String Day[] = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        return (Day[dayOfWeek - 1]);

    }

    //givenCode
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        System.out.println(getDay(day, month, year));
    }
}
