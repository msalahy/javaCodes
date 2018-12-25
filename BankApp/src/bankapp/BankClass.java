
package bankapp;

import javax.swing.JOptionPane;

public class BankClass {
    private String Name;
    private double Balance;
    BankClass(String a, double b)
    {
    this.Name=a;
    this.Balance=b;
    }
    BankClass()
    {
    this.Name="Superman";
    this.Balance=0.5;
    }
    BankClass(String a)
    {
    this.Name=a;
    this.Balance=1000.50;
    }
    public String getName()
    {
    return this.Name;
    }
    public double getBalance()
    {
    return this.Balance;
    }
    public void withDraw(double x)
    {
    if (x>this.Balance)
    {
    JOptionPane.showMessageDialog(null,"sorry you need more Balance");
    }
    else
    {
    this.Balance=this.Balance-x;
    JOptionPane.showMessageDialog(null, "Take your money -- new Balance = "+this.Balance);
    }
    }
    
    
}
