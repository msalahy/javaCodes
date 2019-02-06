
package workingwitharrays;

import java.util.Arrays;


public class WorkingWithArrays {


    public static void main(String[] args) {
        
        int myIntValue=10;
        int anotherIntValue = myIntValue;
        
        System.out.println("myIntValue = "+myIntValue);
        System.out.println("antherIntValue = "+anotherIntValue);
        
        anotherIntValue++;
        System.out.println("myIntValue = "+myIntValue);
        System.out.println("antherIntValue = "+anotherIntValue);
        
        
        
        
        int [] myIntArray = new int[5];
        int [] anotherArray = myIntArray;
        System.out.println("myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("anotherArray= " + Arrays.toString(anotherArray));
        
        anotherArray [0] = 1;
        System.out.println("After change myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("After change anotherArray= " + Arrays.toString(anotherArray));
        
        anotherArray = new int [] {4, 5, 6, 7, 7};
        modifyArray(myIntArray);
        
        System.out.println("After modify myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("After modify anotherArray= " + Arrays.toString(anotherArray));
        
    }
        private static void modifyArray(int[] array){
           array[0] =2;
        }
        
    }
   
