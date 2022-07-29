//Program to find the area and parameter of the Rectangle
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Rectangle extends JFrame implements ActionListener
{
    JTextField tf1,tf2,tf3,tf4;
    Rectangle()
    {
        super("Area and parameter of the Rectangle");
        JLabel lb1=new JLabel("Length");
        JLabel lb2=new JLabel("Breadth");
        JLabel lb3=new JLabel("Area");
        JLabel lb4=new JLabel("Parameter");
        
        tf1=new JTextField(20);
        tf2=new JTextField(20);
        tf3=new JTextField(20);
        tf4=new JTextField(20);
        JButton b=new JButton("Calculate");
        setLayout(new FlowLayout());
        add(lb1);
        add(tf1);
        add(lb2);
        add(tf2);
        add(lb3);
        add(tf3);
        add(lb4);
        add(tf4);
        add(b);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        int l=Integer.parseInt(tf1.getText());
        int b=Integer.parseInt(tf2.getText());
        tf3.setText(Integer.toString(l*b));
        tf4.setText(Integer.toString(2*(l+b)));
    }
    public static void main(String args[])
    {
        Rectangle c=new Rectangle();
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
