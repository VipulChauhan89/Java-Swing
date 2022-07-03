import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class counter extends JFrame implements ActionListener
{
    JTextField tf;
    counter()
    {
        super("Counter");
        JLabel lb=new JLabel("Counter");
        tf=new JTextField(20);
        JButton b=new JButton("Down count");
        JButton b1=new JButton("Up count");
        JButton b2=new JButton("Reset");
        setLayout(new FlowLayout());
        add(lb);
        add(tf);
        add(b);
        add(b1);
        add(b2);
        b.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        tf.setText("0");
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand()=="Up count")
        {
            int i=Integer.parseInt(tf.getText());
            tf.setText(Integer.toString(i+1));
        }
        else if(e.getActionCommand()=="Down count")
        {
            int i=Integer.parseInt(tf.getText());
            tf.setText(Integer.toString(i-1));
        }
        else if(e.getActionCommand()=="Reset")
        {
            tf.setText("0");
        }
    }
    public static void main(String args[])
    {
        counter c=new counter();
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
