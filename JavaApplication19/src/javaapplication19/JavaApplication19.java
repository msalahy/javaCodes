
package javaapplication19;

public class JavaApplication19 {
    public static void main(String[] args) {
        
       int number = 4;
        int finishNumber=20;
       int evenNumbersFound=0;
       
      
       while(number <=finishNumber){
       number++;
       if(!isEvenNumber(number)){
       continue;
       }
          System.out.println("even numer" +number);
       evenNumbersFound++;
       if (evenNumbersFound>=5){break;}
       }
       System.out.println("total number found"+evenNumbersFound);
    }
    
    public static boolean isEvenNumber(int number){
    if((number%2)==0){
    return true;
    }else{
    return false;
    }
    }
}