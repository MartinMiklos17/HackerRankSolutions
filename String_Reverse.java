/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.(Wikipedia)
Given a string , print Yes if it is a palindrome, print No otherwise.

Constraints

 will consist at most  lower case english letters.
Sample Input

madam
Sample Output

Yes

*/
//GivenCode
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
 //MyCodeStarts
  // reading REVERSE, and transform it to a string(because reverse give a STRINGBUILDER OBJECT)
     String c = new StringBuilder(A).reverse().toString();
     //System.out.println(c);
     if ( c.equals(A)){ System.out.println("Yes");}
     if (!(c.equals(A))){ System.out.println("No");}
     }
    } 
