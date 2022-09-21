import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Smiley extends Canvas
{
	public void paint(Graphics g)
	{
		g.setColor(Color.yellow);
		g.fillOval(90,100,200,200);
		g.setColor(Color.black);
		g.fillOval(140,165,30,30);
		g.fillOval(210,165,30,30);
		for(int i=165;i<170;i++)
		{
			g.drawArc(145,i,90,90,-30,-120);
		}
	}
	public static void main(String args[])
	{
		Smiley d=new Smiley();
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
