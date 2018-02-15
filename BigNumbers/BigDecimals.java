/*
Problem: https://www.hackerrank.com/challenges/java-bigdecimal/problem
*/
//given
import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();
//Solution
//Write your code here
        Arrays.sort(s, new Comparator<String>() { //sorting s, and creating a Comparator
	    @Override
	    public int compare(String o1, String o2) { //compare the two Strings
		if (o1 == null || o2 == null) { //if one of them is 0
		    return 0;
		}
		BigDecimal o1bd = new BigDecimal(o1);  //creating a BigDecimal variable, value equals String o1
		BigDecimal o2bd = new BigDecimal(o2);
		return o2bd.compareTo(o1bd);   
	    }
	});
//given
//Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}