import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator extends JFrame implements ActionListener
{
    JTextField tf1,tf2,tf3;
    Calculator()
    {
        super("Calculator");
        JLabel l1=new JLabel("First Number ");
        JLabel l2=new JLabel("Second Number ");
        JLabel l3=new JLabel("Result ");
        tf1=new JTextField(20);
        tf2=new JTextField(20);
        tf3=new JTextField(20);
        JButton b1=new JButton("Sum");
        JButton b2=new JButton("Subtract");
        JButton b3=new JButton("Multiply");
        JButton b4=new JButton("Divide");
        JButton b5=new JButton("Exit");
        setLayout(new FlowLayout());
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(l3);
        add(tf3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        String s1=tf1.getText(),s2=tf2.getText();
        if(s1.isEmpty())
        {
            s1="0";
        }
        if(s2.isEmpty())
        {
            s2="0";
        }
        int num1=Integer.parseInt(s1);
        int num2=Integer.parseInt(s2);
        if(!s1.isEmpty() || !s2.isEmpty())
        {
            if(e.getActionCommand()=="Sum")
            {
                tf3.setText(Integer.toString(num1+num2));
            }
            else if(e.getActionCommand()=="Subtract")
            {
                tf3.setText(Integer.toString(num1-num2));
            }
            else if(e.getActionCommand()=="Multiply")
            {
                tf3.setText(Integer.toString(num1*num2));
            }
            else if(e.getActionCommand()=="Divide")
            {
                try
                {
                    tf3.setText(Integer.toString(num1/num2));
                }
                catch(ArithmeticException exception)
                {
                    System.out.println(exception);
                }
            }
        }
        if(e.getActionCommand()=="Exit")
        {
            System.exit(0);
        }
    }
    public static void main(String args[])
    {
        Calculator a=new Calculator();
        a.setSize(400,500);
        a.setVisible(true);
    }
}