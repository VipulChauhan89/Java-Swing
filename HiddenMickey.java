import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class HiddenMickey extends Canvas
{
	public void paint(Graphics g)
	{
		g.fillOval(90,100,200,200);
		g.fillOval(60,50,95,95);
		g.fillOval(230,50,95,95);
	}
	public static void main(String args[])
	{
		HiddenMickey d=new HiddenMickey();
		JFrame f=new JFrame();
		f.setSize(500,500);
		f.setVisible(true);
		f.add(d);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}	
}
