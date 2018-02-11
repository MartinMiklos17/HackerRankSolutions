/*
Problem discussion: https://www.hackerrank.com/challenges/java-static-initializer-block/problem
 */
//GivenCode
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
//MySolution

    static Scanner sc = new Scanner(System.in);
    static int H = sc.nextInt();
    static int B = sc.nextInt();
    static boolean flag = true;

    static {
        if (H > 0 & B > 0) {
            flag = true;
        } else if (H <= 0 || B <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

//GivenCode
    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}//end of class
