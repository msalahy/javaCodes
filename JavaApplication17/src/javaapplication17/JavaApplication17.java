
package javaapplication17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class JavaApplication17 {
    public static void main(String[] args) {
        int stu=0;
        int grade=0;
        String name;
        double averageGrade=0;
        double totalGrade=0;
        Scanner input = new Scanner (System.in);
   System.out.println("how many stduent will you process? ");
   stu=input.nextInt();
    System.out.println("how many grades will you process? ");
   grade=input.nextInt();
   
   String[] student=new String[stu];
   // FORMAT - Start
   
   String pattern = "###, ###.00";
   DecimalFormat decimalFormat= new DecimalFormat(pattern);
   String format;
   //Format finish;
   double [][] grades=new double[stu][grade];
   input.nextLine();
   for(int r=0; r<stu; r++)
   {
   System.out.println("Enter student name for #"+(r+1)+"=");
   student[r]=input.nextLine();
   for(int c=0; c<grade; c++)
   {
   System.out.println("Enter grade for #"+(c+1)+"=");
   grades [r][c]=input.nextDouble();
   }
    input.nextLine();
   }
   System.out.println(" ");
   System.out.println("IIT -- CIS 144 ");
   System.out.println("=====================");
   for(int r=0; r<stu; r++)
   {
   System.out.println(student[r]+"\t");
   for (int c=0; c<grade; c++)
   {
       format=decimalFormat.format(grades[r][c]);
       System.out.println(format+ "\t");
       totalGrade=totalGrade+grades[r][c];
   }
   averageGrade=totalGrade/grade;
   format=decimalFormat.format(averageGrade);
   System.out.println("your Average is "+averageGrade+"  "+format+"\t");
   totalGrade=0;
   System.out.println(" "); 
   if(averageGrade>=93)
   {
   System.out.println("A");
   }
   else if(averageGrade>=89)
   {
   System.out.println("B");
   }
     else if(averageGrade>=50)
   {
   System.out.println("C");
   }
     else{
         System.out.println("F");
     }
   }
    }
}



/*
        int count = 0;
        int sum = 0;
        for (int i=1; i<=1000; i++){
          if ((i%3 == 0) && (i%5==0))
          {
             count++;
             sum+=i;
             System.out.println("found numbers = "+i);
          }
         if(count==5){
         break;
         }
        }
        System.out.println("Sum = "+sum);
*/