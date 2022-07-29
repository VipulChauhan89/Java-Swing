//Program to find the area and circumference of the Circle
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Circle extends JFrame implements ActionListener
{
    JTextField tf1,tf2,tf3;
    Circle()
    {
        super("Area and Circumference of the Circle");
        JLabel lb1=new JLabel("Radius");
        JLabel lb2=new JLabel("Area");
        JLabel lb3=new JLabel("Circumference");
        
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
        double r=Double.parseDouble(tf1.getText());
        tf2.setText(Double.toString(3.14159*r*r));
        tf3.setText(Double.toString(2*3.14159*r));
    }
    public static void main(String args[])
    {
        Circle c=new Circle();
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
