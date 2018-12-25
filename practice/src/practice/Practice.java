package practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;


public class Practice {
        

    static JFrame f = new JFrame ("Using Text Area");
    static JPanel MainPanel = new JPanel();
              
    static JPanel P1 = new JPanel();
    static JPanel P2 = new JPanel();
    static JPanel P3 = new JPanel();
    
    static JMenuBar mb = new JMenuBar();
    static JMenu men = new JMenu ("File");
    static JMenuItem item = new JMenuItem("Open");
    
    static JLabel lb = new JLabel ("Enter a Phrase: ");
    static JTextField tb = new JTextField(25);
    static JTextArea ta = new JTextArea(50, 35);
    static JButton bt = new JButton ("Click Me");
    
    
    public static void main(String[] args){
        item.addActionListener(new OpenFile());
        men.add(item);
        mb.add(men);
        
        f.setLocation(300, 400);
        bt.addActionListener(new AppendTota());
        
        f.setPreferredSize(new Dimension(500, 420));
        ta.setText("Here will be some phrases");
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        JScrollPane sc = new JScrollPane(ta);
        
        MainPanel.setPreferredSize(new Dimension(500, 320));
        MainPanel.setLayout(new FlowLayout());
        
        P1.setPreferredSize(new Dimension(500, 50));
        P1.setLayout(new FlowLayout());

        P2.setPreferredSize(new Dimension(500, 200));
        P2.setLayout(new GridLayout());
        
                
        P3.setPreferredSize(new Dimension(500, 50));
        P3.setLayout(new FlowLayout());

        
        P1.add(lb);
        P1.add(tb);
        
        P2.add(sc);
        
        P3.add(bt);
        
        MainPanel.add(P1);
        MainPanel.add(P2);
        MainPanel.add(P3);
        
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setJMenuBar(mb);
        f.pack();
        f.setResizable(true);
        f.setVisible(true);
    }
    public static class AppendTota implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            String texto = tb.getText();
            ta.append("\n"+texto);
        }
        
        
    }
    public static class OpenFile implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ae)
        {
           JFileChooser jfc = new JFileChooser (FileSystemView.getFileSystemView().getHomeDirectory()); 
           int returnValue = jfc.showSaveDialog(null);
           if (returnValue == JFileChooser.APPROVE_OPTION)
           {
               File selctedFile = jfc.getSelectedFile();
               try
               {
               FileReader reader = new FileReader (selctedFile.getAbsolutePath());
               BufferedReader br = new BufferedReader (reader);
               ta.read(br, null);
               br.close();
               ta.requestFocus();
               }
               catch(Exception e2){ System.out.println(e2);}
           }
        }
    }
}
                 
                 
//        frame.setSize(300, 450);
//        
//        
//        frame.setLocation(100, 100);
//
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        
//  
//        JPanel Panel1 = new JPanel();
//        JPanel Panel2 = new JPanel();
//        JPanel Panel3 = new JPanel();
//        
//  
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
//    }
//
//    public static class Mohammad implements ActionListener{
//        @Override
//                public void actionPerformed(ActionEvent e)
//                {
//                    JOptionPane.showMessageDialog(frame, "It is working!");
//                }
//    }
//        
//    public static class Gustavo implements ActionListener{
//        @Override
//                public void actionPerformed(ActionEvent e)
//                {
//                    ++count;
//                    tfcount.setText(count+"");
//                }
//    }
//        
//    public static class Gustavo1 implements ActionListener{
//        @Override
//                public void actionPerformed(ActionEvent e)
//                {
//                    --count;
//                    tfcount.setText(count+"");
//                }
//    }
//}
//       
//       
//       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
  
//    static int count =0;
//    static JFrame f = new JFrame();
//    static JPanel p = new JPanel();
//    static JTextField tfcount = new JTextField("0", 10);
//    static JButton btnCount1 = new JButton("Increase");
//    static JButton btnCount2 = new JButton("Decrease");
//    static JLabel lb = new JLabel("Counter: ");
//    public static void main(String[] args){
//        p.setLayout(new FlowLayout());
//        p.add(lb);
//        tfcount.setEditable(true);
//        p.add(tfcount);
//        p.add(btnCount1);
//        p.add(btnCount2);      
//        f.add(p);
//        f.setTitle("The Counter");
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.setResizable(true);
//        f.setSize(600, 100);
//        f.setVisible(true);
//    }
//    
//    public static class Gustavo implements ActionListener{
//        @Override
//                public void actionPerformed(ActionEvent e)
//                {
//                    ++count;
//                    tfcount.setText(count+"");
//                }
//    }
//        
//    public static class Gustavo1 implements ActionListener{
//        @Override
//                public void actionPerformed(ActionEvent e)
//                {
//                    --count;
//                    tfcount.setText(count+"");
//                }
//    }
//}
//
//        
//        
//        frame.setSize(300, 220);
//        frame.setLocation(100, 100);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        
//        JPanel MainPanel = new JPanel();
//        MainPanel.setLayout(null);
//        
//        JLabel Title = new JLabel ("Calculation");
//        Title.setBounds(100, 10, 100, 25);
//        
//        JLabel HLabel = new JLabel("Hours WOrked: ");
//        HLabel.setBounds(30, 40, 100, 25);
//        
//    }
//}
        
////        JTextField Hours = new JTextField(25);
////        Hours.setBounds(130,40 , 100, 25);
////        
////        JLabel PLabel = new JLabel("Pay Rate ........:");
////        PLabel.setBounds(30, 70, 100, 25);
////        
////        
////        JTextField Prate = new JTextField(25);
////        Prate.setBounds(130, 70, 100, 25);
////        
////        JButton CalcButton = new JButton("Caculate");
////        CalcButton.setBounds(100, 110, 100, 25);
////        
////        JLabel Result = new JLabel ("Here is the result");
////        Result.setBounds(100, 150, 150, 25);
////        
////        
////        
////        CalcButton.addActionListener(new ActionListener ()
////        {
////            @Override
////            public void actionPerformed(ActionEvent e)
////            {
////                double hours;
////                double prate;
////                double result;
////                hours=Double.parseDouble(Hours.getText());
////                prate=Double.parseDouble(Prate.getText());
////                result=hours*prate;
////                
////                Result.setText("Your Paycheck = "+result);
////            }
////        }
////        );
////        
////     MainPanel.add(Title);
////     MainPanel.add(HLabel);
////     MainPanel.add(Hours);
////     MainPanel.add(PLabel);
////     MainPanel.add(Prate);
////     MainPanel.add(CalcButton);
////     MainPanel.add(Result);
////     
////     frame.add(MainPanel);
////     frame.setResizable(false);
////     frame.setVisible(true);
////        
////        
////        
//
////        System.out.println("plese enter the number");
////        Scanner input = new Scanner(System.in); 
////      int value= input.nextInt();
////      int total = 1;
////      while(value!=0)
////      {
////      total=total*value;
////      value=value-1;
////      }
////        System.out.println(total);
////    }
////    
////   
////    
////   
////    
////}
//    public static void main(String[] args) {
//        
//        canPack(-2,2,12);
//        
//    }
//
//    public static void canPack(int bigCount, int smallCount, int goal)
//    {
//    if(bigCount+smallCount>=goal)
//    {
//    System.out.println("True");
//    }
//    else
//    {   System.out.println("false");}
//    
//    }
//}
//
//
//
//
//
////        
////        String numberAsString = "2018.1";
////        System.out.println("number As String = "+numberAsString);
////        
////        double number = Double.parseDouble(numberAsString);
////        System.out.println("number = "+ number);
////        numberAsString+=1;
////        number+=1;
////        System.out.println(numberAsString);
////        System.out.println(number);
////        
////    }
////    }
//
//

//  public static void printFactors(int number){
// }}
//   }
//        int sum=0;
//        
//    if (number<0)
//    {
//      System.out.println("invalid");
//    }
//    else{
//        for(int i = 1; i < number; i++)
//        {
//            if(number % i == 0)
//            {
//                sum = sum + i;
//            }
//        }
//        if(sum == number)
//        {
//            System.out.println("Given number is Perfect");
//        }
//        else
//        {
//            System.out.println("Given number is not Perfect");
//        }
//    }
//    }
//}
//        
//        int sum1=0;
//        Scanner input = new Scanner (System.in);
//        System.out.println("How many numebrs will you enter?");
//        int y = input.nextInt();
//        int [] x = new int [y];
//        for (int mohammad =0; mohammad <x.length; mohammad++)
//        {
//            System.out.println("Enter the value for x {"+(mohammad+1)+"} = ");
//            x[mohammad]=input.nextInt();
//        }
//        for (int pablo=0; pablo<x.length; pablo++)
//        {
//            System.out.println(x[pablo]);
//            sum1=sum1+x[pablo];
//        }
//        System.out.println("The total is = "+sum1);
//        
//    }}
//        
//        
//getGreatestCommonDivisor(9,18);  
//    
//}
//public static void getGreatestCommonDivisor(int first, int second)
//{
//    if(first<10 || second<10)
//    {
//    System.out.println(-1);
//    }
//    else{
//        if (second == 0) {
//            System.out.println(first);
//        }
//        else{
//getGreatestCommonDivisor(second, first%second);
//}
//    }
//    
//}
//}
//
//}
//     int number = 0;
//    while(first >0 && second>0){
//    if(first%number==0&& second %number==0){
// 
//        if (first == second) 
//   System.out.println(first);
//        
//        if (first < second && second%first>0 ) 
//            System.out.println(second%first);
//        
//        if (second <first && first%second>0) 
//            System.out.println(first%second);
//      if (first%second==0)
//            System.out.println(second);
//if (second %first==0)
//           System.out.println(first);
//        
//}
//    else
//
//     System.out.println("-1");
//   first=first/10;
//   second=second/10;
//}
//}
//}
//
//        {
//            s=r;
//               System.out.println("true");
//        }
//        else{  
//        System.out.println("false");
//        }
//        b=b/10;
//        a=a/10;
//        
//        
//     hasSharedDigit(-9,99,99);
//    }
//    
//    public static void hasSharedDigit (int a, int b, int c){
//        if ((b<10 || b>999) || (a<10 || a>999)||(c<10 || c>999)){
//            System.out.println("false");
//        }
//        else{
//            int r=0;
//            int rr=0;
//            int s=0;
//            int rrr=0;
//        while((a>=10 && a<=99) && (b>=10 && b<=99)&&(c>=10 && c<=99))
//        {
//        r = a % 10;
//        rr=b % 10;
//        rrr=c%10;
//        if((r==rr)||(r==rrr)||(rr==rrr))
//        {
//            s=r;
//               System.out.println("true");
//        }
//        else{  
//        System.out.println("false");
//        }
//        b=b/10;
//        a=a/10;
//        c=c/10;
//        }
//          
//    }
//    }
//}
//    
//// I will practice here the first and last digit
//public class Practice {
//    public static void main(String[] args) {
//getSum(123456789);
//    }
//    public static void getSum(int n){
//        if(n<0){
//        System.out.println("-1");
//        }
//        else{
//        int r=0;
//        int s = 0;
//        while (n > 0) {
//            r = n % 10;
//            if (r % 2 == 0) {
//                s = s + r;
//            }
//            n = n / 10;
//        }
//      System.out.println(" The Sum of Odd Digits :  " + s);
//    }
//    }
//}
//            



        
        
        /*
        sumFirstAndLast(23);
    }

    // making new method to give me the sume of first and last digit entered
    public static void sumFirstAndLast(int number){
        // declearing variables first and last digit
        if (number<0){
            System.out.println("-1");
        }
       else if (number>=0&& number<=10){
            System.out.println(number*2);
        }
        else{
            int first_digit = number;
            while(first_digit >= 10){
                    first_digit = first_digit / 10;
	int last_digit;
	last_digit = number % 10;
        System.out.println(first_digit+last_digit);
        }
     
    }
}
}   
      
      
      
      /*
  }
    }
    public static boolean isPalindrome(int number){
        int r = 0;
        int sum = 0;
        int temp;
        temp=number;
        while(number>0){
        r=number%10;
        sum=(sum*10)+r;
        number=number/10;
        }
        if(temp==sum){
            return true;
//            System.out.println("Palindreom");
        }
        else
       //     System.out.println("not palindorom");
        return false;
    

    }
}
































/*
       System.out.println("Multiplication Table");
        for(int y=1; y<=10; y++)
        {
            System.out.println("Table of "+y);
            System.out.println("------------");
            for(int x=1; x<=12; x++)
            {
                System.out.println(y+" x "+x+" = "+ (y*x));
            }
             System.out.println("               ");
        }
    }}










/*
        int x=0;
        boolean option = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an interger not bigger than 50 = ");
        x=input.nextInt();
        
        option=Evaluate(x);
        if (option)
        {
        System.out.println("The number you entered meet the requirmetns");
        }
        else 
        {
        System.out.println("The number your entered is bigger than 50");
        }
    }
    
      public static boolean Evaluate(int a){
      if (a>50)
      {
          return false;
      }
      else
      {
          return true;
      }
      }
      
}   
        
      
        
        
    
/*

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        // Create a method called displayHighScorePosition
        // it should a players name as a parameter, and a 2nd parameter as a position in the high score table
        // You should display the players name along with a message like " managed to get into position " and the
        // position they got and a further message " on the high score table".
        //
        // Create a 2nd method called calculateHighScorePosition
        // it should be sent one argument only, the player score
        // it should return an in
        // the return data should be
        // 1 if the score is >=1000
        // 2 if the score is >=500 and < 1000
        // 3 if the score is >=100 and < 500
        // 4 in all other cases
        // call both methods and display the results of the following
        // a score of 1500, 900, 400 and 50
        //

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Louise", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Carol", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Frank", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {

//        if(playerScore >= 1000) {
////            return 1;
////        } else if(playerScore >= 500) {
////            return 2;
////        } else if(playerScore >= 100) {
////            return 3;
////        }
////
////        return 4;
        int position = 4;  // assuming position 4 will be returned

        if(playerScore >= 1000) {
            position = 1;
        } else if(playerScore >= 500) {
            position = 2;
        } else if(playerScore >= 100) {
            position = 3;
        }

        return position;
    }

    public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;

    }

}

*/
