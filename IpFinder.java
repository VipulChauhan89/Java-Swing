import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpFinder extends JFrame implements ActionListener
{
    JTextField tf;
    IpFinder()
    {
        super("Ip finder");
        JLabel lb=new JLabel("Enter the URL : ");
        
        tf=new JTextField(20);
        JButton b=new JButton("Find IP");
        setLayout(new FlowLayout());
        add(lb);
        add(tf);
        add(b);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        String url=tf.getText();
        try
        {
            InetAddress ia=InetAddress.getByName(url);
            String ip=ia.getHostAddress();
            JOptionPane.showMessageDialog(this,ip);
        }
        catch(UnknownHostException e1)
        {
            JOptionPane.showMessageDialog(this,e1.toString());
        }
    }
    public static void main(String args[])
    {
        IpFinder c=new IpFinder();
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
