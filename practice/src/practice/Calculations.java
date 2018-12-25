
package practice;

public class Calculations {
    public double num1;
    public double num2;
    public double totalAdd=0;
    public double totalSub=0;
    
   Calculations(double x, double y)
   {
   num1=x;
   num2=y;
   }
   public void Addition()
   {
   totalAdd=num1+num2;
   }
   public double getAddition(){
   return totalAdd;
   }
      public void Subtraction()
   {
   totalSub=num1-num2;
   }
   public double getSub(){
   return totalSub;
   }
   public void printResults()
   {
    System.out.println("The addition is + "+getAddition());
    System.out.println("The subtraction is + "+getSub());
   }
   
}
