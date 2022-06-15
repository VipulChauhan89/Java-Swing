import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Student extends JFrame implements ActionListener
{
    JTextArea ta;
    JTextField tf1,tf2,tf3,tf4;
    JRadioButton rb1,rb2;
    Student()
    {
        super("Student Information");
        JLabel l1=new JLabel("Name : ");
        JLabel l2=new JLabel("Student Id : ");
        JLabel l3=new JLabel("Section : ");
        JLabel l4=new JLabel("Gender : ");
        JLabel l5=new JLabel("Course : ");
        tf1=new JTextField(20);
        tf2=new JTextField(20);
        tf3=new JTextField(20);
        tf4=new JTextField(20);
        ta=new JTextArea(15,25);
        rb1=new JRadioButton("Male");
        rb2=new JRadioButton("Female");
        JButton b1=new JButton("Print");
        ButtonGroup b=new ButtonGroup();
        b.add(rb1);
        b.add(rb2);
        setLayout(new FlowLayout());
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(l3);
        add(tf3);
        add(l4);
        add(rb1);
        add(rb2);
        add(l5);
        add(tf4);
        add(b1);
        add(ta);
        b1.addActionListener(this);
        ta.setLineWrap(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(rb1.isSelected())
        {
            ta.setText("Name : "+tf1.getText()+",  Student Id : "+tf2.getText()+",  Section : "+tf3.getText()+",  Gender : Male"+",  Course : "+tf4.getText());
        }
        else if(rb2.isSelected())
        {
            ta.setText("Name : "+tf1.getText()+",  Student Id : "+tf2.getText()+",  Section : "+tf3.getText()+",  Gender : Female"+",  Course : "+tf4.getText());
        }
    }
    public static void main(String args[])
    {
        Student a=new Student();
        a.setSize(340,500);
        a.setVisible(true);
        a.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
}
