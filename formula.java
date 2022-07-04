import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class formula extends JFrame implements ActionListener
{
    JTextField tf1,tf2,tf3;
    formula()
    {
        super("a^2-b^2");
        JLabel lb1=new JLabel("a : ");
        JLabel lb2=new JLabel("b : ");
        JLabel lb3=new JLabel("result : ");
        tf1=new JTextField(20);
        tf2=new JTextField(20);
        tf3=new JTextField(20);
        JButton b=new JButton("Calculate");
        setLayout(new FlowLayout());
        add(lb1);
        add(tf1);
        add(lb2);
        add(tf2);
        add(b);
        add(lb3);
        add(tf3);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        int a=Integer.parseInt(tf1.getText());
        int b=Integer.parseInt(tf2.getText());
        tf3.setText(Integer.toString((a*a)-(b*b)));
    }
    public static void main(String args[])
    {
        formula c=new formula();
        c.setSize(300,200);
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
