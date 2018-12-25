
package practicenew;

public class PracticeNew {

    public static void main(String[] args) {
numberToWords(123);
    }
  public static void numberToWords(int number)
            {
      int s=0;
      int r=0;
    int reverse=0;

  if(number<0)
  {
  System.out.println("Invalid Value");
  }
  else {
      while(number>0)
                {
              s = number%10;
      switch (s){
          case 1: 
              s=1;
              System.out.print("One, ");
              break;
          case 2:  
              s=2;
              System.out.print("Second, ");
              break;
          case 3:  
              s=3;
              System.out.print("Third, ");
              break;
          case 4:  
              s=4;
              System.out.print("Fourth, ");
              break;
          case 5:  
              s=5;
              System.out.print("Fifth, ");
              break;
         case 6:  
              s=6;
              System.out.print("Six, ");
              break;  
         case 7:  
              s=7;
              System.out.print("Seven, ");
              break;          
         case 8:  
              s=8;
              System.out.print("Eight, ");
              break;          
         case 9:
              s=9;
              System.out.print("Nine, ");
          default:
              System.out.print("Wrong, ");
               
 
      }
           number=number/10; 
        
      }


      while (reverse>0)
                {
                       reverse=reverse*10;
          reverse=reverse+(s%10);       
      r = reverse%10;
      switch (r){
          case 1: 
              r=1;
              System.out.print("One, ");
              break;
          case 2:  
              r=2;
              System.out.print("Second, ");
              break;
          case 3:  
              r=3;
              System.out.print("Third, ");
              break;
          case 4:  
              r=4;
              System.out.print("Fourth, ");
              break;
          case 5:  
              r=5;
              System.out.print("Fifth, ");
              break;
         case 6:  
              r=6;
              System.out.print("Six, ");
              break;  
         case 7:  
              r=7;
              System.out.print("Seven, ");
              break;          
         case 8:  
              r=8;
              System.out.print("Eight, ");
              break;          
         case 9:
              r=9;
              System.out.print("Nine, ");
          default:
              System.out.print("Wrong, ");
                  

      }
        reverse=reverse/10;   
      }
               
  }
      
  }
}
   
