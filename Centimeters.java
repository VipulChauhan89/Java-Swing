import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Centimeters extends JFrame implements ActionListener
{
    JTextField tf,tf1;
    Centimeters()
    {
        super("Inches to Centimeters");
        JLabel lb=new JLabel("Inches :    ");
        JLabel lb1=new JLabel("Centimeter :");
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
        double inch=Double.parseDouble(tf.getText());
        double cm=2.54*inch;
        tf1.setText(Double.toString(cm));
    }
    public static void main(String args[])
    {
        Centimeters c=new Centimeters();
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
