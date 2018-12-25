
package challengepractice;

public class ChallengePractice {

    public static void main(String[] args) {
 
       double centimeters = calcFeetAndInchesToCentimeters(180, 14);
        if (centimeters <0.0)
        {
        System.out.println("Invalid parameters");
        }
        
        calcFeetAndInchesToCentimeters(150);
        }
    
    public static double calcFeetAndInchesToCentimeters(double feet, double inches)
            {
            if((feet<0 ) || ((inches <0) && (inches > 12))){
                System.out.println("invalid feet or inche");
              return -1;  

}
            double centimeters = (feet*12)*2.54;
            centimeters += inches*2.54;
            System.out.println(feet+ " feet and "+ 
                    inches+ " inches ="+ centimeters+" cm" );
            return centimeters;
            }
    
    
    
        public static double calcFeetAndInchesToCentimeters(double inches)
            {
            if(inches <0){
              return -1;  
            }
            
            double feet = (int) inches/12;
            double remainingInchese = (int) inches % 12;
            System.out.println(inches+ " inches is equal to " +feet+" feet and " +remainingInchese); 
            return calcFeetAndInchesToCentimeters(feet, remainingInchese);
            }
}

    