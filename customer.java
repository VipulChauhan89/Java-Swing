import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.BorderFactory;
public class customer extends JFrame implements ActionListener
{
    JTextField tf1,tf2;
    JRadioButton rb1,rb2;
    JCheckBox cb1;
    customer()
    {
        JLabel lb1=new JLabel("Order : ");
        JLabel lb2=new JLabel("Total Cost : ");
        tf1=new JTextField(15);
        tf2=new JTextField(15);
        JPanel jp=new JPanel();
        jp.setLayout(new FlowLayout());
        ButtonGroup b=new ButtonGroup();
        rb1=new JRadioButton("Wholesalers");
        rb2=new JRadioButton("Retailers");
        cb1=new JCheckBox("Special Discount");
        JButton b1=new JButton("Calculate");
        b.add(rb1);
        b.add(rb2);
        jp.setBorder(BorderFactory.createTitledBorder("Customer Types"));
        jp.add(rb1);
        jp.add(rb2);
        setLayout(new FlowLayout());
        add(lb1);
        add(tf1);
        add(jp);
        add(cb1);
        add(b1);
        add(lb2);
        add(tf2);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        double total=0;
        int p=Integer.parseInt(tf1.getText());
        if(rb1.isSelected())
        {
            if(p>0 && p<16)
            {
                total=p*50;
            }
            else if(p>15 && p<21)
            {
                total=p*45;
            }
            else if(p>20 && p<31)
            {
                total=p*40;
            }
            else if(p>30 && p<51)
            {
                total=p*35;
            }
            else if(p>50)
            {
                total=p*30;
            }
        }
        else if(rb2.isSelected())
        {
            if(p>0 && p<16)
            {
                total=p*60;
            }
            else if(p>15 && p<21)
            {
                total=p*55;
            }
            else if(p>20 && p<31)
            {
                total=p*50;
            }
            else if(p>30 && p<51)
            {
                total=p*45;
            }
            else if(p>50)
            {
                total=p*40;
            }
        }
        if(cb1.isSelected())
        {
            total-=total*0.1;
        }
        tf2.setText(Double.toString(total));
    }
    public static void main(String args[])
    {
        customer c=new customer();
        c.setSize(300,400);
        c.setVisible(true);
        c.addWindowListener(new WindowAdapter()
            {
                public void windowClosing(WindowEvent e)
                {
                    System.exit(0);
                }
            }
        );
    }
}
