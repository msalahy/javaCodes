
package javaapplication19;


public class ArrayMethods {
    public static void ArraySort(int[] x)
    {
    int temp=0;
    for (int a=0; a<x.length; a++){
        for (int b=0; b<x.length; b++){
        if(x[a]<x[b]){
        temp=x[b];
        x[b]=x[a];
        x[a]=temp;
        }
        }
    }
    }
    public static void PrintArray(int[] gust)
    {
    for (int index=0; index<gust.length; index++)
    {
    System.out.println(gust[index]);
    }
    }
    }
    
