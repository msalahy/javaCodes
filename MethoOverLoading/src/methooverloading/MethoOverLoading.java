
package methooverloading;

public class MethoOverLoading {

    public static void main(String[] args) {
   
        
        System.out.println(getDurationString(65, 45));
        
        System.out.println(getDurationString(3945L));
    }
    
    private static String getDurationString(long minutes, long second){
        if((minutes<0) || (second<0)||(second>59)){
            return "invalid value";
    }
    long hours = minutes / 60;
    long remainingMinutes = minutes %60;
    
    String hoursString = hours+"h";
    if(hours<10)
    {
    hoursString = "0"+ hoursString;
    }
    
    String minutesString = hours+"h";
    if(hours<10)
    {
    hoursString = "0"+ hoursString;
    }
    
    return hours+ "h "+remainingMinutes+"m "+ second + "s";
}
    
     private static String getDurationString(long second)
     {
     if (second <0){
     return "invalid value";
     }
     long minutes = second /60;
     long remainingSecond = second %60;
     
     return getDurationString(minutes, remainingSecond ); 
}
}
