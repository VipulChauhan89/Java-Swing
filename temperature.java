import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class temperature extends JFrame implements ActionListener
{
    JTextField tf,tf1;
    temperature()
    {
        super("Celsius to Fahrenheit");
        JLabel lb=new JLabel("Celsius :    ");
        JLabel lb1=new JLabel("Fahrenheit :");
        tf=new JTextField(20);
        tf1=new JTextField(20);
        JButton b=new JButton("Convert");
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
        double i=Double.parseDouble(tf.getText());
        i=((i*9)/5)+32;
        tf1.setText(Double.toString(i));
    }
    public static void main(String args[])
    {
        temperature c=new temperature();
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
