package midterm;
import java.util.Scanner;


public class MidTerm {

    public static void main(String[] args) {
      String name = null;
      int numOfGrades=0;
      int x=0;
      Scanner input = new Scanner(System.in);
      
      System.out.println("Please enter the student name = ");
      name= input.nextLine();
      Student st = new Student(name);
      System.out.println("How many grades you want to enter = ");
      numOfGrades=input.nextInt();
      
      while(x<numOfGrades)
      {
      System.out.println("Enter grade"+(x+1)+" = ");
      st.AddToGrade(input.nextDouble());
      x++;      
      }
      st.CalcAverage(numOfGrades);
      st.Printing();
    }
    
}
