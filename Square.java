//Program to find the area and parameter of the square
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Square extends JFrame implements ActionListener
{
    JTextField tf1,tf2,tf3;
    Square()
    {
        super("Area and parameter of the square");
        JLabel lb1=new JLabel("Side");
        JLabel lb2=new JLabel("Area");
        JLabel lb3=new JLabel("Parameter");
        
        tf1=new JTextField(20);
        tf2=new JTextField(20);
        tf3=new JTextField(20);
        JButton b=new JButton("Calculate");
        setLayout(new FlowLayout());
        add(lb1);
        add(tf1);
        add(lb2);
        add(tf2);
        add(lb3);
        add(tf3);
        add(b);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        int s=Integer.parseInt(tf1.getText());
        tf2.setText(Integer.toString(s*s));
        tf3.setText(Integer.toString(4*s));
    }
    public static void main(String args[])
    {
        Square c=new Square();
        c.setSize(280,300);
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
