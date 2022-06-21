import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Robot_face extends Canvas
{
    public void paint(Graphics g)
    {
        g.drawRect(60,60,150,150);
        g.drawRect(85,85,30,30);
        g.drawRect(155,85,30,30);
        g.drawRect(85,140,100,30);
        g.drawRect(45,100,15,40);
        g.drawRect(210,100,15,40);
    }
    public static void main(String args[])
    {
        Robot_face a=new Robot_face();
        JFrame j=new JFrame("Robot");
        j.setSize(300,300);
        j.setVisible(true);
        j.add(a);
        j.addWindowListener(new WindowAdapter()
            {
                public void windowClosing(WindowEvent e)
                {
                    System.exit(0);
                }
            }
        );
    }
}
