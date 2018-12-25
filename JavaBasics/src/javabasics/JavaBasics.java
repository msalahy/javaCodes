package javabasics;
import java.util.Scanner;

import java.util.Scanner;

public class JavaBasics {
    public static void main(String[] args) {
  Scanner i=new Scanner(System.in);
  
  double x=0;
  double y=0;
  
  System.out.print("Enter the value of X ");
  x=i.nextInt();
  
   System.out.print("Enter the value of Y ");
     y=i.nextInt();
     
     Calculations c = new Calculations(x,y);
     double z=c.Add();
     double zz= c.Subtract();
     double zzz=c.Mul();
     
     System.out.println("The Sum is = "+z);
     System.out.println("The Subtract is = "+zz);
     c.gustavo();
     

}
}
