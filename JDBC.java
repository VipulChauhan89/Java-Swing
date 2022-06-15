import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;
public class JDBC extends JFrame implements ActionListener
{
	Connection con=null;
	PreparedStatement ps1=null,ps2=null,ps3=null,ps4=null;
	JTextField tf1,tf2;
	JDBC()
	{
		super("Database");
		tf1=new JTextField(20);
		tf2=new JTextField(20);
		JLabel l1=new JLabel("ID");
		JLabel l2=new JLabel("NAME");
		JButton b1=new JButton("Insert");
		JButton b2=new JButton("Show Table");
		JButton b3=new JButton("Update");
		JButton b4=new JButton("Delete");
		JButton b5=new JButton("Exit");
		setLayout(new FlowLayout());
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand()=="Insert")
		{
			System.out.println("Submit");
			submit();
		}
		else if(e.getActionCommand()=="Show Table")
		{
			System.out.println("Display");
			display();
		}
		else if(e.getActionCommand()=="Update")
		{
			System.out.println("Update");
			update();
		}
		else if(e.getActionCommand()=="Delete")
		{
			System.out.println("Delete");
			delete();
		}
		else
		{
			System.exit(0);
		}
	}
	public void submit()
	{
		try
		{
			ps1=con.prepareStatement("insert into emp(id,name)values(?,?)");
			ps1.setInt(1,Integer.parseInt(tf1.getText()));
			ps1.setString(2,tf2.getText());
			ps1.executeUpdate();
			System.out.println("Submited");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void display()
	{
		String col[]={"id","name"};
		DefaultTableModel tbModel=new DefaultTableModel();
		tbModel.setColumnIdentifiers(col);
		JTable tb=new JTable(tbModel);
		tb.setModel(tbModel);
		JScrollPane scroll=new JScrollPane(tb);
		try
		{
			ps2=con.prepareStatement("select * from emp");
			ResultSet rs=ps2.executeQuery();
			System.out.println("Fetching table from Database");
			String tr[]={"id","name"};
			tbModel.addRow(tr);
			while(rs.next())
			{
				String id=String.valueOf(rs.getInt(1));
				String name=rs.getString(2);
				String tbData[]={id,name};
				tbModel.addRow(tbData);
			}
			JFrame n=new JFrame("Database Content");
			n.setSize(700,500);
			n.setVisible(true);
			n.setLayout(new FlowLayout());
			n.add(scroll);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void update()
	{
		try
		{
			ps3=con.prepareStatement("update emp set name='"+tf2.getText()+"' where id='"+Integer.parseInt(tf1.getText())+"'");
			ps3.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void delete()
	{
		try
		{
			ps4=con.prepareStatement("delete from emp where id='"+Integer.parseInt(tf1.getText())+"'");
			ps4.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String args[])
	{
		JDBC a=new JDBC();
		a.setSize(300,400);
		a.setVisible(true);
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Success");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		try
		{
			a.con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cse1?autoReconnect=true&useSSL=false","root","VipulChauhan");
			System.out.println("connection established");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	} 	
}
