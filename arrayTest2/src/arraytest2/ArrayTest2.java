
package arraytest2;

public class ArrayTest2 {

    public static void main(String[] args)
    {
        
       System.out.println("The sum of the digits in number 125 is " +sumDigits(125));
      
       
     int [] x= {5, 6, 1, 2};
     int sum1=0;
     
     for (int index = 0; index<x.length; index++)
     {
     System.out.println(x[index]);
     }
     for (int index=0; index<x.length; index++)
     {
     sum1=x[index]+sum1;
     }
     System.out.println("The sume is = "+sum1);
    }
    
    public static int sumDigits(int number)
    {
        if(number<10){
        return -1;
        }
        int sum=0;  
        while (number>0){
        // extract the least significat digit
        int digit = number%10;
        sum= digit+sum;
        // drp least-sginificat digit
        number=number/10;
    }
    return sum;
    }  
            
        }
    
    
    
    
    
    
    
    
    
    
    
    /*
        }
        System.out.println("Is this numer prime    "+isPrime(7));
    //  System.out.println("20000 at 2% interest reate is = "+calculateInterest(20000.0, 2.0));  
     //   for(int i=2; i<9; i++ ){
         //    System.out.println("10000 at "+i+"% interest reate is = "+ String.format("%.2f",calculateInterest(10000.0, i)));       
  //  } 
                for(int i=8; i>0; i-=2 ){
             System.out.println("10000 at "+i+"% interest reate is = "+ String.format("%.2f",calculateInterest(10000.0, i)));       
    } 
                
     int count = 0;
     for (int i=10; i<50; i+=2)
     {
     if(isPrime(i)){
         count++;
         System.out.println("Numbers "+i+ " is a prime numer");
         if (count ==10){
         System.out.println("existing for loop");
         break;
         }
         
     
     }
     }
                
                
                
                
                
    }
    public static double calculateInterest(double amount, double rate)
    {
    return (amount*(rate/100));
    }
    
    
    //888888888888\\\
    
    
    
    public static boolean isPrime(int n){
    if(n == 1)
    {
    return true;
    }
    for (int i=2; i<=n/2; i++){
    if(n%i==0){
    return false;
    }
    }
    return true;
    }
    
}











/*
     int [] x= {5, 6, 1, 2};
     int sum1=0;
     
     for (int index = 0; index<x.length; index++)
     {
     System.out.println(x[index]);
     }
     for (int index=0; index<x.length; index++)
     {
     sum1=x[index]+sum1;
     }
     System.out.println("The sume is = "+sum1);
        
    }
}
*/
