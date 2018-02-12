/*
Problem: https://www.hackerrank.com/challenges/java-date-and-time/problem
 */
//givenCode
import java.util.Scanner;

//Solution
import java.util.Calendar;

public class Solution {

    public static String getDay(String day, String month, String year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Integer.parseInt(year), Integer.parseInt(month) - 1, Integer.parseInt(day));
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
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
