
package secondandminutes;

public class TestApp 
{
  String studentName;
  double totalGrade;
  double gradeAverage;
  
  TestApp(String s)
  {
  this.studentName=s;
  }
  public void AddGrade(double g)
  {
  this.totalGrade=this.totalGrade+g;
  }
  public void CalculateAverage()
  {
  this.gradeAverage=this.totalGrade/5;
  }
  public String getName()
  {
  return this.studentName;
  }
  public double getAverage()
  {
  return this.gradeAverage;
  }
  
  
}
