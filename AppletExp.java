package Java_programs;

import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class AppletExp extends Applet implements ActionListener{

	Label l1;
	TextField f1;
	public void init()
	{
		l1=new Label("Welcome to Applets ...");
		f1=new TextField(10);
		
		add(l1);
		add(f1);
		
		f1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		repaint();
	}
	
	public void paint(Graphics g)
	{
		g.drawString("Nice to meet you, "+f1.getText(),10,150);
	}
	
}
