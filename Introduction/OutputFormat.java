/*
Java's System.out.printf function can be used to print formatted output. The purpose of this exercise is to test your understanding of formatting output using printf.

To get you started, a portion of the solution is provided for you in the editor; you must format and print the input to complete the solution.

Input Format

Every line of input will contain a String followed by an integer. 
Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from to .

Output Format

In each line of output there should be two columns: 
The first column contains the String and is left justified using exactly  characters. 
The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

Sample Input

java 100
cpp 65
python 50
Sample Output

================================
java           100 
cpp            065 
python         050 
================================
Explanation

Each String is left-justified with trailing whitespace through the first  characters. The leading digit of the integer is the  character, and each integer that was less than  digits now has leading zeroes.
//Submission
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String e = " ";
                String s1=sc.next();
                //String hossza változó
                int slength = s1.length();
                int x=sc.nextInt();
                /*-----------------------------*/
                //szóközt intézõ if ág eleje
                if(slength == 1){
            e = "              ";
        }
                
                if(slength == 2){
            e = "             ";
        }
        if(slength == 3){
            e = "            ";
        }
        if(slength == 4){
            e = "           ";
        }
        if(slength == 5){
            e = "          ";
        }
        if(slength == 6){
            e = "         ";
        }
        if(slength == 7){
            e = "        ";
        }
        if(slength == 8){
            e = "       ";
        }
        if(slength == 9){
            e = "      ";
        }
        if(slength == 10){
            e = "     ";
        }
        if(slength == 11){
            e = "    ";
        }
        if(slength == 12){
            e = "   ";
        }
        if(slength == 13){
            e = "  ";
        }
        if(slength == 14){
            e = " ";
        }
                //szóközt intézõ if ág vége
                //számok elõtti 0 if ág kezdete
                //Complete this line
                if ( x == 0) {
                    System.out.println(s1+e+"000");
                }
                
                else if (x < 10) {
                System.out.println(s1 + e + "00"+x);
            } else if(x>9 & x<=99) {
                System.out.println(s1 + e + "0"+x);
            } else if (x >= 100){
                System.out.println(s1 + e+x);
            }
            }
            System.out.println("================================");
            
    }
}

