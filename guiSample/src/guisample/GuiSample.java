


package guisample;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GuiSample {
        static JFrame frame = new JFrame("PAYROLL SYSTEM");
    static JPanel MainPanel = new JPanel();
    static JPanel panel1 = new JPanel();
    static JPanel panel2 = new JPanel();
    static JPanel panel3= new JPanel();
    
    
    static JLabel title = new JLabel ("GUI SAMPLE");
    static JLabel fnlabel = new JLabel ("First Name : ");
    static JLabel lnlabel = new JLabel ("Last Name : ");
    static JLabel yearDOB = new JLabel ("Year of born : ");
    static JTextField fntext = new JTextField(25);
    static JTextField lntext = new JTextField(25);
    static JTextField yeartext = new JTextField(25);
    
    static JButton b1 = new JButton ("CLICK ME");
    static JButton b2 = new JButton ("RESET");
    
    static JLabel result = new JLabel ("Here the result ");
    static JButton b3= new JButton ("Your Idear?");
    
    static JLabel wow = new JLabel ("");
    
    public static void main(String[] args) {
       title.setFont(new Font(null, Font.BOLD, 30));
       fnlabel.setBounds(80, 40, 100, 25);
       lnlabel.setBounds(80, 70, 100, 25);
       yearDOB.setBounds(80, 100, 100, 25);
       
       b1.addActionListener(new CalcYear());
       b2.addActionListener(new resetAction());
       b3.addActionListener(new calc());
       
       fntext.setBounds(180, 40, 100, 25);
       lntext.setBounds(180, 70, 100, 25); 
       yeartext.setBounds(180, 100, 100, 25);  
        
      b1.setBounds(100, 150, 100, 25);
      b2.setBounds(220, 150, 100, 25);
      b3.setBounds(320, 150, 100, 25);
      result.setFont(new Font(null, Font.BOLD, 15));
      
      
      wow.setFont(new Font(null, Font.BOLD, 15));
      
      panel1.add(title);
      
      panel2.add(fnlabel);
      panel2.add(lnlabel);
      panel2.add(yearDOB);
      panel2.add(fntext);
      panel2.add(lntext);
      panel2.add(yeartext);
      panel2.add(b1);
      panel2.add(b2);
      panel2.add(b3);
      panel3.add(result);
      panel3.add(wow);
      
      MainPanel.setPreferredSize(new Dimension(500, 400));
      MainPanel.setLayout(new FlowLayout());
      
      panel1.setPreferredSize(new Dimension(500, 50));
      panel1.setLayout(new FlowLayout());
      
     panel2.setPreferredSize(new Dimension(500, 250));
     panel2.setLayout(null);
      
     panel3.setPreferredSize(new Dimension(500, 100));
     panel3.setLayout(new FlowLayout());
      
      frame.add(MainPanel);
      MainPanel.add(panel1);
      MainPanel.add(panel2);
      MainPanel.add(panel3);
      
      
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(true);
        frame.setVisible(true);
    }
    
    public static class CalcYear implements ActionListener{
    @Override
    public void actionPerformed (ActionEvent ae){
        int y;
        int Ycalc;
        y=Integer.parseInt(yeartext.getText());
        Ycalc=2018-y;
        result.setText(fntext.getText()+" "+lntext.getText()+ " is "+Ycalc+" years old.");
    }
    }
    
    public static class resetAction implements ActionListener{
    @Override
    public void actionPerformed (ActionEvent ae )
    {
    fntext.setText("");
    lntext.setText("");
    yeartext.setText("");
    wow.setText(" ");
    result.setText(" ");
    } 
    }
    
    public static class calc implements ActionListener{
    @Override
    public void actionPerformed (ActionEvent ae )
    {
        int y;
        int out;
        y = Integer.parseInt(yeartext.getText());
        if(y<1990)
        {
 result.setText(fntext.getText()+" is an adult. ");
        }
        else 
        {
        wow.setText(" he is a child. ");
        }
    } 
    }
}
    








//package guisample;
//
//
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//
//
//public class GuiSample {
//    static JFrame frame = new JFrame("Gui Sample");
//    static JPanel MainPanel = new JPanel();
//    static JPanel panel1 = new JPanel();
//    static JPanel panel2 = new JPanel();
//    static JPanel panel3= new JPanel();
//    static JLabel title = new JLabel ("GUI SAMPLE");
//    static JLabel fnlabel = new JLabel ("First Name : ");
//    static JLabel lnlabel = new JLabel ("Last Name : ");
//    static JLabel yearDOB = new JLabel ("Year of born : ");
//    static JTextField fntext = new JTextField(25);
//    static JTextField lntext = new JTextField(25);
//    static JTextField yeartext = new JTextField(25);
//    
//    static JButton b1 = new JButton ("CLICK ME");
//    static JButton b2 = new JButton ("RESET");
//    
//    static JLabel result = new JLabel ("Here the result ");
//    static JButton b3= new JButton ("Your Idear?");
//    
//    static JLabel wow = new JLabel ("");
//    
//    public static void main(String[] args) {
//       title.setFont(new Font(null, Font.BOLD, 30));
//       fnlabel.setBounds(80, 40, 100, 25);
//       lnlabel.setBounds(80, 70, 100, 25);
//       yearDOB.setBounds(80, 100, 100, 25);
//       
//       b1.addActionListener(new CalcYear());
//       b2.addActionListener(new resetAction());
//       b3.addActionListener(new calc());
//       
//       fntext.setBounds(180, 40, 100, 25);
//       lntext.setBounds(180, 70, 100, 25); 
//       yeartext.setBounds(180, 100, 100, 25);  
//        
//      b1.setBounds(100, 150, 100, 25);
//      b2.setBounds(220, 150, 100, 25);
//       b3.setBounds(320, 150, 100, 25);
//      result.setFont(new Font(null, Font.BOLD, 15));
//      
//      
//      wow.setFont(new Font(null, Font.BOLD, 15));
//      
//      panel1.add(title);
//      
//      panel2.add(fnlabel);
//      panel2.add(lnlabel);
//      panel2.add(yearDOB);
//      panel2.add(fntext);
//      panel2.add(lntext);
//      panel2.add(yeartext);
//      panel2.add(b1);
//      panel2.add(b2);
//       panel2.add(b3);
//      panel3.add(result);
//        panel3.add(wow);
//      
//      MainPanel.setPreferredSize(new Dimension(500, 400));
//      MainPanel.setLayout(new FlowLayout());
//      
//      panel1.setPreferredSize(new Dimension(500, 50));
//      panel1.setLayout(new FlowLayout());
//      
//     panel2.setPreferredSize(new Dimension(500, 250));
//     panel2.setLayout(null);
//      
//     panel3.setPreferredSize(new Dimension(500, 100));
//     panel3.setLayout(new FlowLayout());
//      
//      frame.add(MainPanel);
//      MainPanel.add(panel1);
//      MainPanel.add(panel2);
//      MainPanel.add(panel3);
//      
//      
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
//        frame.setResizable(true);
//        frame.setVisible(true);
//    }
//    
//    public static class CalcYear implements ActionListener{
//    @Override
//    public void actionPerformed (ActionEvent ae){
//        int y;
//        int Ycalc;
//        y=Integer.parseInt(yeartext.getText());
//        Ycalc=2018-y;
//        result.setText(fntext.getText()+" "+lntext.getText()+ " is "+Ycalc+" years old.");
//    }
//    }
//    
//    public static class resetAction implements ActionListener{
//    @Override
//    public void actionPerformed (ActionEvent ae )
//    {
//    fntext.setText("");
//    lntext.setText("");
//    yeartext.setText("");
//    wow.setText(" ");
//    result.setText(" ");
//    } 
//    }
//    
//    public static class calc implements ActionListener{
//    @Override
//    public void actionPerformed (ActionEvent ae )
//    {
//        int y;
//        int out;
//        y = Integer.parseInt(yeartext.getText());
//        if(y<1990)
//        {
// result.setText(fntext.getText()+" is an adult. ");
//        }
//        else 
//        {
//        wow.setText(" he is a child. ");
//        }
//    } 
//    }
//}
//    
