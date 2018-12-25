
package javapractice;
import java.util.Scanner;

public class JavaPractice {


    public static void main(String[] args) {
        int number=0;
        double num1 = 0;
        double num2 = 0;
        double num3 = 0;
        double num4 = 0;
        double num5 = 0;
        double average=0;
        Scanner input = new Scanner (System.in);
            
        System.out.println("Please enter the student name: ");
        String name = input.nextLine();
        
        while(number<6)
        {
         System.out.println("please enter number"+number); 
         input.nextDouble();
         number+=number;
        }
        
        System.out.println("please enter the first number");
        num1=input.nextInt();
        
        System.out.println("please enter the second number");
        num2=input.nextInt();
                
        System.out.println("please enter the third number");
        num3=input.nextInt();
                
        System.out.println("please enter the fourth number");
        num4=input.nextInt();
                
        System.out.println("please enter the fifth number");
        num5=input.nextInt();
        
        average=(num1+num2+num3+num4+num5)/5;
        System.out.println(name+"'s"+" Average is: "+average);
        }
    }
//        
//        //System.out.println("Please enter the second number: ");
//        num2=input.nextDouble();
//        if(num2==0)
//        {
//         System.out.println("Sorry the second number can't be zero");   
//        }dx
//        else{
//        double sum;
//        sum=num1+num2;
//        double neg= num1-num2;
//        double mul = num1*num2;
//        double div = num1/num2;
//        
//        System.out.println("The sum is "+sum);
//        System.out.println("The negative is "+neg);
//        System.out.println("The multiplication is "+mul);
//        System.out.println("The division is is "+div);
//    }
//    }

