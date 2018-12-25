package lab5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab5
{
    static JFrame frame = new JFrame("PAYROLL SYSTEM");
    static JPanel MainPanel = new JPanel();
    static JPanel panel1 = new JPanel();
    static JPanel panel2 = new JPanel();
    static JPanel panel3= new JPanel();
    
    static JLabel title = new JLabel ("Payroll Calculator");
    
    static JLabel fnlabel = new JLabel ("First Name : ");
    static JLabel lnlabel = new JLabel ("Last Name : ");
    static JLabel hoursWorked = new JLabel ("Hours Worked: ");
    static JLabel plabel = new JLabel ("Pay Rate: ");
    
    static JTextField fntext = new JTextField(25);
    static JTextField lntext = new JTextField(25);
    static JTextField hoursWorkedText = new JTextField(25);
    static JTextField PayRate = new JTextField(8);
    
    static Checkbox SpendingAccount = new Checkbox("Spending Account");  
    static JTextField SpendingA = new JTextField(15);
    
    static JButton submit = new JButton ("SUBMIT");
    static JButton clear = new JButton ("CLEAR");
   
        
    static JLabel Result = new JLabel (" ");
    static JLabel Result1 = new JLabel ();
    
    public static void main(String[] args)
    {
        title.setBounds(150, 20, 130, 25);
        fnlabel.setBounds(80, 40, 100, 25);
        lnlabel.setBounds(80, 70, 100, 25);
        hoursWorked.setBounds(80, 110, 100, 25);
        plabel.setBounds(295, 110, 100, 25); 
        fntext.setBounds(180, 40, 100, 25);
        lntext.setBounds(180, 70, 100, 25); 
        hoursWorkedText.setBounds(180, 110, 100, 25);  
        PayRate.setBounds(350, 110, 100, 25); 
//      submit.setPreferredSize(new Dimension(100, 50));
        submit.setBounds(100, 150, 80, 25);
        clear.setBounds(200, 150, 80, 25);
      
        SpendingAccount.setBounds(100,200,150,25);
     
        SpendingA.setBounds(250,200,150,25);
        SpendingA.setEditable(true);
      
        SpendingAccount.addItemListener(new Gustavo1());
        clear.addActionListener(new resetAction());  
    
        panel1.add(title);        
        panel2.add(fnlabel);
        panel2.add(lnlabel);
        panel2.add(hoursWorked);
        panel2.add(fntext);
        panel2.add(lntext);
        panel2.add(hoursWorkedText);
        panel2.add(submit);
        panel2.add(clear);
        panel2.add(SpendingAccount);
        panel2.add(SpendingA);
        panel2.add(plabel);
        panel2.add(PayRate);

        Result.setFont(new Font(null, Font.BOLD, 15));

        MainPanel.setLayout(new FlowLayout());
        MainPanel.setBackground(Color.red);
        MainPanel.setPreferredSize(new Dimension(500, 500));
        MainPanel.setLayout(new FlowLayout());

        panel1.setPreferredSize(new Dimension(500, 50));
        panel1.setLayout(null);

       panel2.setPreferredSize(new Dimension(500, 300));
       panel2.setLayout(null);

       panel3.setPreferredSize(new Dimension(500, 150));
       panel3.setLayout(null);

       frame.add(MainPanel);
       MainPanel.add(panel1);
       MainPanel.add(panel2);
       MainPanel.add(panel3);
       panel3.add(Result);
       panel3.add(Result1); 

       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.pack();
       frame.setResizable(true);
       frame.setVisible(true);

       submit.addActionListener(new ActionListener()
       {
            @Override
            public void actionPerformed (ActionEvent e)
            {
                double hours;
                double prate = 0;
                double result1;
                double result2;
                double spending;
                double net;
                spending=Double.parseDouble(SpendingA.getText());
                hours=Double.parseDouble(hoursWorkedText.getText());
                prate=Double.parseDouble(PayRate.getText());
                result1 = ((hours*prate))-spending;
                if (hours<=40)
                {
                    Result.setText(fntext.getText()+""+lntext.getText()+" your net paycheck is "+result1);
                }
                else if (hours>40)
                {
                    result2=((result1+(hours-40)*0.5*prate));
                    Result.setText(fntext.getText()+" "+lntext.getText()+" Your bet Paycheck is "+result2);
                    Result1.setText("You contributed = "+spending+"$ into your spending account.");
                }
            }
        });
    }
    public static class Gustavo1 implements ItemListener
    {
        @Override
        public void itemStateChanged (ItemEvent e)
        {
            if (e.getStateChange()==1)
            {
                SpendingA.setEditable(true);
            }
            else
            {
                SpendingA.setEditable(false);
                SpendingA.setText("0");
            }
        }
    }
    public static class resetAction implements ActionListener
    {
        @Override
        public void actionPerformed (ActionEvent ae )
        {
            fntext.setText("");
            lntext.setText("");
            hoursWorkedText.setText("");
            PayRate.setText(" ");
            Result.setText(" ");
            Result1.setText(" ");
            SpendingA.setText("0");
        } 
    } 
}
