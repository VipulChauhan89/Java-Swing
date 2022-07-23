import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class NumberGuessingGame extends JFrame implements ActionListener
{
    JTextField tf;
    NumberGuessingGame()
    {
        super("Number Guessing Game");
        JLabel lb=new JLabel("Enter the number from 1 to 100: ");
        
        tf=new JTextField(20);
        JButton b=new JButton("Guess");
        setLayout(new FlowLayout());
        add(lb);
        add(tf);
        add(b);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        Random r=new Random();
        String s;
        int num=Integer.parseInt(tf.getText());
        int random=r.nextInt(100-1)+1;
        if(num==random)
        {
            s="You guessed the Right number i.e."+random;
        }
        else
        {
            s="You didn't guessed the Right number i.e."+random;
        }
        JOptionPane.showMessageDialog(this,s);
    }
    public static void main(String args[])
    {
        NumberGuessingGame c=new NumberGuessingGame();
        c.setSize(340,200);
        c.setVisible(true);
        c.addWindowListener(new WindowAdapter()
            {
                public void windowClosing(WindowEvent e)
                {
                    System.exit(0);
                }
        });
    }
}
