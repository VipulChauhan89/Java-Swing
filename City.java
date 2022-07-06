import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.BorderFactory;
public class City extends JFrame implements ActionListener
{
    JTextField tf1;
    JTextArea ta1;
    City()
    {
        super("Add City names in the Text Area.");
        tf1=new JTextField(15);
        JButton b1=new JButton("ADD>>");
        ta1=new JTextArea(13,20);
        JPanel jp=new JPanel();
        jp.setPreferredSize(new Dimension(400,300));
        jp.setBorder(BorderFactory.createTitledBorder("Adding Name to the List"));
        jp.setLayout(new FlowLayout());
        jp.add(tf1);
        jp.add(b1);
        JScrollPane j=new JScrollPane(ta1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jp.add(j);
        add(jp);
        JButton b2=new JButton("Exit");
        setLayout(new FlowLayout());
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand()=="ADD>>")
        {
            ta1.setText(ta1.getText()+tf1.getText()+"\n");
        }
        else if (e.getActionCommand()=="Exit")
        {
            System.exit(0);
        }
    }
    public static void main(String args[])
    {
        City c=new City();
        c.setSize(600,400);
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
