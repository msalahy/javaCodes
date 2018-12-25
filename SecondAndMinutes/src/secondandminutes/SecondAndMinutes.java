
package secondandminutes;

import java.util.Scanner;

public class SecondAndMinutes {
     
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String studentName;
        int x=1;
      
        System.out.println("Please enter student name = ");
        studentName= input.nextLine();
        TestApp st=new TestApp(studentName);
        while(x<5)
            {
                System.out.println("Enter grade " +x+" = ");
                st.AddGrade(input.nextDouble());
                x++;
             }
        st.CalculateAverage();
        System.out.println(st.getName()+"your Average gread is = "+st.getAverage() +"and your total grade is "+st.totalGrade);
 
    }
}
        



        
        
        /*



       averageGrade=totalGrade/5;
        System.out.println("The Average grade is = "+averageGrade);
         System.out.println(studentName+"'s total grade is "+totalGrade);
    public static void main(String[] args) {
    System.out.println(isCatPlaying(false, 10));
}
public static boolean isCatPlaying(boolean summer, int temperature) {
if(summer == true) {
if(temperature >= 25 && temperature <= 45) {
return true;
} 
return false;
} else if(summer == false) {
if(temperature >= 25 && temperature <= 35) {
return true;
}
else 
return false;
}
        return false;
}
}


    /*

    
    public static String printEqual(int a, int b, int c)
    {
    if((a<0)||b<0||c<0){
    return "Inalid Value";
    }
    if ((a==b)&&(b==c)){
    return "All are equal";}
    if((a!=b)&&(b!=c)){
    return "All numbers are different";}
    
    {
    return "neither all are equal or differnt";
    }

    }
}
    
*/






/*
       System.out.println(getDurationString(65, 45));
       
    }
    
    
    private static String getDurationString(long minutes,  long seconds)
    {
    if ((minutes<0) || (seconds <0)|| (seconds > 59))         {
    return "invalid value";
    }
    
    long hours = minutes / 60;
    long remainingMinutes = minutes % 60;
    return hours+ "h "+remainingMinutes + "m " + seconds + "s";
    
    }
*/
