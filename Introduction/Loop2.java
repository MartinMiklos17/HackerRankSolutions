/*
Problem dicussion
https://www.hackerrank.com/challenges/java-loops/problem
*/
//GivenCode
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            //MySolution
            int c = 0;
            int solution = a+c*b;
            
            for (int k=0; k<=n-1; k++){
            if(c>1){c = c*2;}
            else if(c<=1){c++;} 
            solution = solution+(c*b);
                
            if(k<=n-1) {System.out.print(solution+" ");}
                 if(k == n-1) { System.out.print("\n");}
        }
        }
        in.close();
    }
}
