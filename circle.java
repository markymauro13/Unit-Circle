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
		    
		    // THIS IS THE X AND Y AXIS
		    
		    g.drawLine(430, 152 , 430, 498); 	// vertical line
		    g.drawLine(253, 340, 597, 340);		// horizontal line
		 
		    Font font = new Font("Arial", Font.BOLD, 25);
		    g.setFont(font);
		    g.setColor(Color.black);
		    
		    g.drawString("0°, 0, (1,0)", 610, 350);	
		    g.drawString("(-1,0) , \u03c0 , 180°", 55, 350);
		    
		    // THESE ARE THE 45 DEGREE ANGLES
		    
		    g2.setStroke(new BasicStroke(3)); 
		    g.drawLine(320, 465, 550, 205);		// 45 and 225 degrees	// these numbers are similar but not the same for some reason
		    g.drawLine(290, 215, 550, 447);		// 135 and 315 degrees
		    
		    
		  
	}
	
}
