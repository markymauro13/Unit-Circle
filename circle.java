import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;

public class circle extends JFrame{

	

	
	public circle()
	{
		super("The Unit Circle");
		setLayout(new FlowLayout());
		
	}
	
	public void paint(Graphics g)
	{
		    g.setColor(Color.red);
		    g.fillOval(250, 150, 350, 350);
		    
		    
		    g.setColor(Color.LIGHT_GRAY);
		    g.fillArc(275, 175, 300, 300, 0, 360);
		    
		    Graphics2D g2 = (Graphics2D) g;
		    g.setColor(Color.black);
		    g2.setStroke(new BasicStroke(5));
		    g.drawLine(430, 152 , 430, 498);
		    
		    Font font = new Font("Unispace", Font.BOLD, 25);
		    g.setFont(font);
		    g.setColor(Color.black);
		    g.drawString("0° ------ 0------#", 500, 350);
	}
	
}
