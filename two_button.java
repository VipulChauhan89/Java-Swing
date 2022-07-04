import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class two_button extends JFrame implements ActionListener
{
    JTextField tf1;
    
    two_button()
    {
        tf1=new JTextField(20);
        JButton b1=new JButton("one");
        JButton b2=new JButton("two");
        setLayout(new FlowLayout());
        add(tf1);
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand()=="one")
        {
            tf1.setText("Button one is pressed.");
        }
        else if (e.getActionCommand()=="two")
        {
            tf1.setText("Button two is pressed.");
        }
    }
    public static void main(String args[])
    {
        two_button c=new two_button();
        c.setSize(300,120);
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
