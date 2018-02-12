/*
Problem: https://www.hackerrank.com/challenges/java-sort/problem
*///givenCode
import java.util.*;

class Student  implements Comparable{
   private int id;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getId() {
      return id;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
    //Solution
    public int compareTo(Object o){
        Student s=(Student)o;   //transforming o to a Student object
        if(cgpa==s.cgpa){  //if cgpa equals
            if(fname.equals(s.fname)){  //if fname is the same
                return id-s.id;     //then compare by ID's
            }else{
                return fname.compareTo(s.fname); // else compare by fname
            }
        }else{
            if(s.cgpa-cgpa>0)  // and by cgpa
                return 1;
            else 
                return -1;
        }
    }
}

//givenCode
public class Solution
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      
      List<Student> studentList = new ArrayList<Student>();
      while(testCases>0){
         int id = in.nextInt();
         String fname = in.next();
         double cgpa = in.nextDouble();
         
         Student st = new Student(id, fname, cgpa);
         studentList.add(st);
         
         testCases--;
      }
      //Solution
         Collections.sort(studentList);  
         for(Student st: studentList){
         System.out.println(st.getFname());
      }
   }
}