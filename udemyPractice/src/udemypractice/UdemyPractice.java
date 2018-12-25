
package udemypractice;
import java.util.Scanner;
public class UdemyPractice {  
  public static void main(String args[]) {
      Scanner scanner = new Scanner (System.in);
      
      int min = Integer.MAX_VALUE;
      int max =Integer.MIN_VALUE;
      boolean first= true;
      while (true)
      {
      System.out.println("Enter number");
      boolean isAnInt = scanner.hasNextInt();
      
      if (isAnInt){
        int number = scanner.nextInt();
//        if (first){
//            first=false;
//            min=number;
//            max=number;
//        }
   if (number >max)
  {
         max = number;
      }
   if (number <min)
     {
         min = number;
     }
      }
      else{
          break;
      }
      scanner.nextLine();
      }
      System.out.println("min = "+min+", max= "+max);
  }
  }
//      Scanner scanner = new Scanner (System.in);
//      int counter = 0;
//      int sum = 0;
//      while (true){
//          int order = counter+1;
//          System.out.println("Enter number #"+order+":");
//          boolean isAnInt = scanner.hasNextInt();
//          if(false){
//          int number = scanner.nextInt();
//          counter++;
//          sum+=number;
//          if (counter==10)
//          {
//              break;
//          }
//          }
//          else{
//              System.out.println("Invalid Number");
//          }
//          scanner.nextLine();   
//      }
//      System.out.println("sum = "+sum);
//      scanner.close();  
//    } 
//  }
////     Scanner input = new Scanner(System.in);
//     System.out.println("Please enter an number");
//     
//     boolean hasNextInt = input.hasNextInt();
//     
//     if(hasNextInt){
//     int n = input.nextInt();
//	for (int i = 0; i < n; i++) { 
//
//		for (int j = 0; j <n; j++) { 
//
//			if (i == 0 || j == 0 || i == j || i == n - 1 || j == n - 1 || i + j == n - 1){
//                            System.out.print("*"); 
//                        }
//                        else
//			    System.out.print(" "); 
//			} 
//			System.out.println(); 
//		} 
//	}
//     else 
//     {
//       System.out.println("Unable to parse year of birth!");
//     }
//    input.close();
//}
//}
//	
//


        
        

    

//    largestPrimeFactor(21);
//    }
//    
//    
//    public static void largestPrimeFactor(int number) 
//    {
//        if(number<=1)
//        {
//            System.out.println("-1");
//        }
//        else
//        {   
//        int i;
//        int copyOfInput = number;
//        for (i = 2; i <= copyOfInput; i++) 
//        { 
//            if (copyOfInput % i == 0)
//        { 
//            copyOfInput=copyOfInput/ i;
//        i--;
//        }   
//        }
//        System.out.println(i);
//    }
//    
//}


