package javaapplication6;
public class JavaApplication6 {

 public static void main(String[] args) {

     int newScore = calculateScore("Tim", 500);
     System.out.println("New score is " +newScore);
     calculateScore(100);
     calculateScore();
     
     
 } 
 public static int calculateScore ( String playerName, int score)
 {
 System.out.println("Player "+ playerName + " scored " +score+ " points");
 return score *1000;
 }
  public static int calculateScore (int score)
 {
 System.out.println("unnamed Player "+" scored " +score+ " points");
 return score *1000;
 }
   public static int calculateScore ()
 {
 System.out.println("No Player "+" No scored points");
 return 0;
 } 
   
   
  
}








     
     /*
   boolean range = true;
   
    hasTeen(13 , 11, 18);
    
     
    }
 
 public static boolean hasTeen(int a, int b, int c )
 {
     if ( a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19)
     {
   System.out.println(true);
      return true;
     }
               else        
System.out.println(false);
     return false;
 }
 }
*/

 
 
 
 
 /*
 
 hasEqualSum(1,1, 3);
public static boolean hasEqualSum(int a, int b, int c) 
{

    if (a+b==c){
    System.out.println(true);
             return true;
    }
    else
        System.out.println(false);
    return false;
}
}
*/
 
