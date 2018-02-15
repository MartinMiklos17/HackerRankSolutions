/*
Problem: https://www.hackerrank.com/challenges/java-biginteger/problem
*/
//Solution
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        
        BigInteger plus = a.add(b);
        BigInteger xor = a.multiply(b);
        System.out.println(plus);
        System.out.println(xor);
    }
}
