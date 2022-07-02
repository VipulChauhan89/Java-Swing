import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Factorial extends JFrame implements ActionListener
{
    JTextField tf,tf1;
    Factorial()
    {
        super("Factorial");
        JLabel lb=new JLabel("n");
        JLabel lb1=new JLabel("factorial (n!)");
        tf=new JTextField(20);
        tf1=new JTextField(20);
        JButton b=new JButton("Calculate");
        setLayout(new FlowLayout());
        add(lb);
        add(tf);
        add(lb1);
        add(tf1);
        add(b);
        b.addActionListener(this);
        tf.setText("0");
    }
    public void actionPerformed(ActionEvent e)
    {
        long i=Long.parseLong(tf.getText());
        tf1.setText(Long.toString(factorial(i)));
    }
    //only upto 19
    public long factorial(long n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String args[])
    {
        Factorial c=new Factorial();
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
