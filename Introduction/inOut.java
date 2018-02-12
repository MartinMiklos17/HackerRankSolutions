/*
Problem: https://www.hackerrank.com/challenges/java-stdin-stdout/problem
*///givenCode
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //MySolution
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String x = scan.nextLine(); // we have to create another String variable for the empty line
        String s = scan.nextLine();
        
        
        
        
        // givenCode

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}