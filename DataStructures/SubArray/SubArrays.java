/*Problem: https://www.hackerrank.com/challenges/java-negative-subarray/problem*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    
       public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner in = new Scanner(System.in);
    int size;
    int[] array;
    int negCount = 0;
    int sum= 0;
    int i=0;
    int j=0;
    int startIndex=0;
    int stopIndex = 0;

    size = in.nextInt();
    array = new int[size]; //create an array 

    for(i = 0 ; i < size;i++)  //while size
        array[i] = in.nextInt();  // fulfill the array

    for(stopIndex=size ; stopIndex>0;stopIndex--){ // 10, 9, 8, 7...
        for(startIndex=0;startIndex<size;startIndex++){ // 1, 2, 3, 4...

            for(sum=0,i=startIndex;i<stopIndex;i++){    //Sum all the numbers between startIndex and stopIndex
                sum+=array[i];
               // System.out.print(array[i]+ ",");
            }
            if(sum<0)negCount++;// increase negCount if the subArrays sum is negative
            //System.out.println();
        }
    }

    System.out.println(negCount);
}
}