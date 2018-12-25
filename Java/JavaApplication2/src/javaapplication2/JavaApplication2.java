
package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {
public static void main(String[]args) {
     
       
        Scanner input = new Scanner(System.in);
       
        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();
        
        System.out.print("Enter second integer: " );
        int number2 = input.nextInt();
        
        int sum= number1 + number2;
        
        System.out.println("Sum is: "+sum);

    
    
}}






/*int[] x = {5, 7, 10, 12};
        int sum1 = 0;
     
     for ( int index = 0; index < x.length; index++)   
     {
     System.out.println(x[index]);
      sum1+=x[index];
     }
           System.out.println(" the sum is ="+ sum1);
}
}
*/