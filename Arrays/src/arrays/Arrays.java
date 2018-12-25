
package arrays;
import java.util.Scanner;


public class Arrays {


    public static void main(String[] args) {

       int stu=0;
       int grade = 0;
       
       Scanner input = new Scanner (System.in);
       
       System.out.print(" How many studetns you will enter = ");
       stu = input.nextInt();
       
       System.out.println ( " How many grades will you enter? ");
       grade = input.nextInt();
       
       
       String [] student = new String[stu];
       double [][] grades = new double [stu][grade];
       
       input.nextLine();
       
       for (int r= 0; r<student.length; r++)
           
       {
         System.out.print(" Enter student" +(r+1)+" name = ");
         student[r] = input.nextLine();
         
   
       for (int c=0; c<student.length; c++)
       {
           System.out.println("Enter Grade "+ (c+1)+ " = ");
           grades[r][c]=input.nextDouble();
       }
        input.nextLine();
        
    }
    }
}
    