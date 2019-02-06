
package area;
import java.util.Scanner;

public class Area {
    
    public static void main(String[] args) {
        
        Scanner i = new Scanner(System.in);
        
        int x;
        System.out.println("Enter an Interger x = ");
        x = i.nextInt();
        int y;
        System.out.println(" Enter an integer y = ");
        y = i.nextInt();
        int z;
        System.out.println("Enter an integer z = ");
        z=i.nextInt();
        
        int lowest = x;
        if (x<lowest)
        {
            lowest=x;
        }
        if (y<lowest)
        {
            lowest = y;
        }
        if (z<lowest)
        {
            lowest = z;
        }
        System.out.println("The lowest is = "+lowest);
        
    }

}
