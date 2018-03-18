/* Problem: https://www.hackerrank.com/challenges/java-list/problem*/
/*Submission*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;
import org.apache.commons.lang.ArrayUtils;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> arr = new LinkedList<>();
        //int[] arr = new int[n];
        int i = 0;
        for(i=0;i<n;i++){
        int pastable = sc.nextInt();
        arr.add(pastable);
        }
        int q = sc.nextInt();
        for(int j=0;j<q;j++){
            String uresSor = sc.nextLine();
            String sor = sc.nextLine();
            if(sor.equals("Insert")){
                int sign = sc.nextInt();
                int paste = sc.nextInt();
               arr.add(sign, paste);
                //arr[sign] = paste;
            } else if (sor.equals("Delete")){
                int delete = sc.nextInt();
                //arr = arr-arr[delete];
                arr.remove(delete); //removing element at index "DELETE"
      
            }
        }
        //System.out.println((String)arr);
        for (Integer num : arr) {
            System.out.print(num + " ");}
    }
}
