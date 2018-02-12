/*
Problem: https://www.hackerrank.com/challenges/java-string-tokens/problem
 */
//givenCode
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Solution
        String b = scan.nextLine();
        String a = b.trim();
        // Write your code here.
        scan.close();
        String[] parts = a.split("[ !,?._'@]");
        int total = parts.length;

        int whiteSpaces = 0;
        // innentõl a számláló
        try {
            for (int i = 0; i <= total; i++) {
                String current = parts[i];
                String whiteSpace = "";

                if (current.equals((Object) whiteSpace)) {
                    whiteSpaces++;

                } else {

                }

            }
        } catch (ArrayIndexOutOfBoundsException e) {

        } finally {
            System.out.println(total - whiteSpaces);
        }

        // kész a szétválasztó
        try {
            for (int i = 0; i <= total; i++) {
                String current = parts[i];
                String whiteSpace = "";

                if (current.equals((Object) whiteSpace)) {
                    whiteSpaces++;

                } else {
                    System.out.print(current + "\n");
                }

            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }
    }
}
