package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Gui {
    
    
public static void main(String[] args){
    
    
    
}
}
    





//    static JFrame frame = new JFrame ("Using CheckBox");
//    static JPanel Panel1= new JPanel();
//    static JCheckBox cb = new JCheckBox("Show TextBox");
//    static JTextField tb = new JTextField("0", 15);
//    static JButton bt = new JButton("Click Me");
//    
//    
//    public static void main(String[] args){
//        frame.setPreferredSize(new Dimension(500, 100));
//        Panel1.setLayout(new FlowLayout());
//        tb.setEditable(false);
//        
//        
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        cb.addItemListener(new gustavo1 ());
//        bt.addActionListener(new gustavo2());
//        
//        Panel1.add(cb);
//        Panel1.add(tb);
//        Panel1.add(bt);
//        frame.add(Panel1);
//        
//        frame.pack();
//        frame.setResizable(true);
//        frame.setVisible(true);
//        
////    
//    }
//            
//    public static class gustavo1 implements ItemListener{
//        @Override
//                public void itemStateChanged(ItemEvent e)
//                {
//                   if (e.getStateChange()==1)
//                   {
//                       tb.setEditable(true);
//                   }
//                   else
//                   {
//                       tb.setText("0");
//                       tb.setEditable(false);
//                   }
//                }
//                }  
//    public static class gustavo2 implements ActionListener{
//        @Override
//                public void actionPerformed(ActionEvent e)
//                {
//                    JOptionPane.showMessageDialog(frame, "Congratulations!!!!");
//                }
//    }
//}
//        





















    
//        JPanel mainPanel = new JPanel();
//        JPanel Panel1 = new JPanel();
//        JPanel Panel2 = new JPanel();
//        JPanel Panel3 = new JPanel();
//        
//        JMenuBar mb = new JMenuBar();
//        JMenu actions = new JMenu ("Actions");
//        JMenu edit = new JMenu ("Edit");
//        JMenuItem item1 = new JMenuItem ("Click me");
//        item1.addActionListener(new Mohammad());
//        
//        JMenuItem item2 = new JMenuItem("Click ME");
//        
//                JButton btnCount1 = new JButton("Increase");
//        JButton btnCount2 = new JButton("Decrease");
//        
//        actions.add(btnCount1);
//        actions.add(item1);
//        edit.add(item2);
//        mb.add(actions);
//        mb.add(edit);
//        
//        
//        JLabel Title = new JLabel("MultiPanel");
//        JLabel l1 = new JLabel("Line 1");
//        JLabel l2 = new JLabel ("Line 2");
//        
//        
//        JButton b1 = new JButton("1");
//        b1.setPreferredSize(new Dimension(100, 100));
//        JButton b2 = new JButton("2");
//        JButton b3 = new JButton("3");
//        JButton b4 = new JButton("4");
//        JButton b5 = new JButton("5");
//        JButton b6 = new JButton("6");
//        JButton b7 = new JButton("7");
//        
//       mainPanel.setLayout(new BorderLayout());
//       mainPanel.setSize(300, 450);
//       
//       Panel1.setLayout(new BorderLayout());
//       Panel1.setPreferredSize(new Dimension(300, 50));
//       Panel1.setBackground(Color.yellow);
//       
//       
//       
//       
//        tfcount.setEditable(true);
//        Panel3.add(tfcount);
//        Panel3.add(btnCount1);
//        Panel3.add(btnCount2);      
//        frame.add(Panel3);
//        
//        
//        
//       Panel2.setLayout(new BorderLayout());
//       Panel2.setPreferredSize(new Dimension(300, 200));
//       Panel2.setBackground(Color.green);
//        
//       Panel3.setLayout(new GridLayout(2, 3));
//       Panel3.setPreferredSize(new Dimension(300, 200));
//       
//       Panel1.add(Title);
//       
//       Panel2.add(l1, BorderLayout.NORTH);
//       Panel2.add(l2, BorderLayout.SOUTH);
//       
//       Panel3.add(b1);
//       Panel3.add(b2);
//       Panel3.add(b3);
//       Panel3.add(b4);
//       Panel3.add(b5);
//       Panel3.add(b6);
//       Panel3.add(btnCount1);
//       Panel3.add(btnCount2);
//       
//       mainPanel.add(Panel1, BorderLayout.NORTH);
//       mainPanel.add(Panel2, BorderLayout.CENTER);
//       mainPanel.add(Panel3, BorderLayout.SOUTH);
//       
//       frame.add(mainPanel);
//       frame.setJMenuBar(mb);
//       frame.setResizable(true);
//       frame.setVisible(true);
//       frame.pack();
//        btnCount1.addActionListener(new Gustavo());
//        btnCount2.addActionListener(new Gustavo1());
//       