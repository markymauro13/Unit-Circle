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
		    
		    
		    g.setColor(getBackground());
		    g.fillArc(275, 175, 300, 300, 0, 360);
		    
	
		    
		    Graphics2D g2 = (Graphics2D) g;
		    g.setColor(Color.black);
		    g2.setStroke(new BasicStroke(5));
		    
		    // THIS IS THE X AND Y AXIS
		    
		    g.drawLine(430, 152 , 430, 498); 	// vertical line, 0 and 180 degrees
		    g.drawLine(253, 340, 597, 340);		// horizontal line , 90 and 270 degrees
		 
		    Font font = new Font("Arial", Font.BOLD, 20);
		    g.setFont(font);
		    g.setColor(Color.DARK_GRAY);
		    
		    g.drawString("0°----- 0 ----- (1,0)", 500, 337);	// the x
		    g.drawString("(-1,0) --- \u03c0 --- 180°", 200, 337); //the x
		    
		    Font font1 = new Font("Arial", Font.BOLD, 17);
		    g.setFont(font1);
		    g.drawString("30° --- \u03c0/6 --- (\u221A3/2, 1/2)", 590, 250); // 30 degrees
		    g.drawString("45° --- \u03c0/4 --- (\u221A2/2, 2/2) ", 550, 200); // 45 degrees
		    g.drawString("60° --- \u03c0/3 --- (1/2, \u221A3/2)", 490, 160);
		    
		    g.setFont(font);
		    g.drawString("(0,1)", 415, 70);
		    g.drawString("-", 430, 85);
		    g.drawString("\u03c0/2", 420, 100);
		    g.drawString("-", 430, 114);
		    g.drawString("90°", 420, 130);
		    
		    
		    g.setColor(Color.black);
		    g2.setStroke(new BasicStroke(3)); 
		    g.drawLine(320, 465, 550, 205);		// 45 and 225 degrees	 
		    g.drawLine(290, 215, 550, 447);		// 135 and 315 degrees
		    g.drawLine(370, 490 , 500, 170);    // 60 and 240 degrees
		    
		    g.drawLine(282, 432, 580, 250);		// 30 and 210 degrees
		    g.drawLine(350, 170, 500, 483);		// 120 and 300 degrees
		    g.drawLine(260, 275, 583, 398); 		// 150 and 330 degrees
		    
		
		    g.setColor(Color.black);
		    g.fillOval(405, 313, 50, 50);
		    
		    g.setColor(Color.YELLOW);	 
		    g.fillArc(410, 318, 40, 40, 0, 360);
	}
	
}
