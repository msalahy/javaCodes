package midterm;

class Student {
    private String name;
    private double TotalGrade;
    private double Average;
    Student(String n)
    {
    this.name=n;
    }
    public String GetName()
    {
    return this.name;
    }
    public void AddToGrade(double grade)
    {
    this.TotalGrade+=grade;
    }
    public void CalcAverage(int Ngrades)
    {
    Average=TotalGrade/Ngrades;
    }
    public double getAverage()
    {
    return Average;
    }
    public void Printing()
    {
    System.out.println(name+" Your grade average is = "+Average);
    }
}
