import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Hospital extends JFrame implements ActionListener
{
    JTextArea ta;   //For the text area
    String S="";    //For Saving the values
    JTextField tf,tf1;  //For the input
    JComboBox<String> tf2;      // For the drop down
    String s[]={"1 Years","2 Years","3 Years","4 Years","5 Years"}; // For the drop down 
    int count=1;    // For counting the 5 inspections
    Hospital()
    {
        // Create the title of the Window
        super("Hospital Inspections");

        // Declare the menubar
        JMenuBar mb=new JMenuBar();

        // Create the two menus
        JMenu x=new JMenu("File");
        JMenu x1=new JMenu("Tools");

        // Create the menu items for the menus
        JMenuItem m=new JMenuItem("Exit");
        JMenuItem m1=new JMenuItem("Save");
        JMenuItem m2=new JMenuItem("Print");
        JMenuItem m3=new JMenuItem("Clear");

        // Adding the menu items in the respective menu
        x.add(m);
        x1.add(m1);
        x1.add(m2);
        x1.add(m3);

        // Adding the menus to the menubar
        mb.add(x);
        mb.add(x1);

        // Adding the menubar to the frame
        setJMenuBar(mb);

        // Declaring the labels
        JLabel lb=new JLabel("Hospital Name : ");
        JLabel lb1=new JLabel("Hospital Location : ");
        JLabel lb2=new JLabel("Year since inspection : ");

        // setting the text fields
        ta=new JTextArea(20,30);
        tf=new JTextField(20);
        tf1=new JTextField(20);
        tf2=new JComboBox<String>(s);

        // setting the buttons
        JButton b=new JButton("Save");
        JButton b1=new JButton("Print");
        JButton b2=new JButton("Clear");

        // For setting the width of the buttons
        b.setPreferredSize(new Dimension(220,20));
        b1.setPreferredSize(new Dimension(220,20));
        b2.setPreferredSize(new Dimension(220,20));

        // Set the layout and the maximum width and height of the layout
        setLayout(new FlowLayout());
        setMaximumSize(new Dimension(450,700));

        // For the text area to provide the scroll view
        JScrollPane p=new JScrollPane(ta);
        getContentPane().add(p,BorderLayout.CENTER);

        //adding all the fields in the window
        add(lb);
        add(tf);
        add(lb1);
        add(tf1);
        add(lb2);
        add(tf2);
        add(b);
        add(p);
        add(b1);
        add(b2);

        // Adding the action listeners to all the buttons
        b.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        m.addActionListener(this);
        m1.addActionListener(this);
        m2.addActionListener(this);
        m3.addActionListener(this);
    }
    // For the functionality of the buttons
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand()=="Save")
        {
            if(count<=5)
            {
                S+="Hospital Name : "+tf.getText()+"\nHospital Location : "+tf1.getText()+"\nYear since inspection : "+tf2.getSelectedItem()+"\n************************\n";
                count++;
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Maximum inspection count reached!","Message",JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(e.getActionCommand()=="Print")
        {
            ta.setText(S);
        }
        else if(e.getActionCommand()=="Clear")
        {
            S="";
            ta.setText(S);
            count=1;
        }
        else if(e.getActionCommand()=="Exit")
        {
            System.exit(0);
        }
    }
    public static void main(String args[])
    {
        Hospital c=new Hospital();
        c.setSize(450,700);
        c.setVisible(true);

        // To close the program on clicking the close button on the window that is the button with minimize and maximize of window
        c.addWindowListener(new WindowAdapter()
            {
                public void windowClosing(WindowEvent e)
                {
                    System.exit(0);
                }
        });
    }
}
