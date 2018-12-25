
package arraytest;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println(" How many elements do you want = ");
        int [] x= new int[input.nextInt()];
        
        for (int mohammad = 0; mohammad<x.length; mohammad++){
        System.out.print("Enter teh value for x{"+mohammad+"} = ");
        x[mohammad]=input.nextInt();
        
        }
      PrintArray(x);
ArraySort(x);
    System.out.println("******************");
      for (int index=0; index<x.length; index++){
          System.out.println(x[index]);
      }
 
    
      
}
    public static void ArraySort(int[] x){
        int temp=0;
        for (int a=0; a<x.length; a++)
        {
        for (int b=0; b<x.length; b++)
        {
            if (x[a]<x[b])
            {
        temp=x[b];
        x[b]=x[a];
        x[a]=temp;
        }
        }
    }
}
    public static void PrintArray(int[] x)
    {
    for (int index=0; index<x.length; index++){
        System.out.println(x[index]);
    }
    }
}
