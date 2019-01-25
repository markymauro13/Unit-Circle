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
		  /*
		   * The Unit Circle Title
	   	   */
				Font titleFont = new Font("Unispace", Font.ITALIC, 35);
				g.setColor(Color.black);
				setFont(titleFont);
				
				g.drawString("The Unit Circle", 50, 100);
				g.drawString("Java Edition", 510, 100);
		
			/*
			 * Red circle and grey circle
			 */
		
			g.setColor(Color.red);
		    g.fillOval(250, 150, 350, 350);
		    
		    
		    g.setColor(getBackground());
		    g.fillArc(275, 175, 300, 300, 0, 360);
		    
		    /*
		     * This Graphics2D class extends the Graphics class to 
		     * provide more sophisticated control over geometry,
		     * coordinate transformations, color management, and text layout. 
		     */
		    
		    Graphics2D g2 = (Graphics2D) g; 
		    g.setColor(Color.black);
		    g2.setStroke(new BasicStroke(5));	// Only thing I'm really using Graphics2D class for
		    
		    
		    /*
		     * X axis
		     */
		    
		    g.drawLine(430, 152 , 430, 498); 	// vertical line, 0 and 180 degrees
		    g.drawLine(253, 340, 597, 340);		// horizontal line , 90 and 270 degrees
		 
		    /*
		     * end of X axis
		     */
		    
		    Font font = new Font("Arial", Font.BOLD, 20);
		    g.setFont(font);
		    g.setColor(Color.DARK_GRAY);
		    
		    g.drawString("0°----- 0 ----- (1,0)", 500, 337);	// the x
		    g.drawString("(-1,0) --- \u03c0 --- 180°", 200, 337); //the x
		    
		    
		    /*
		     * Y axis
		     */
		    
		    		// positive y
		    
		    g.setFont(font);
		    g.drawString("(0,1)", 415, 60);
		    g.drawString("-", 430, 80);
		    g.drawString("\u03c0/2", 420, 100);	
		    g.drawString("-", 430, 120);
		    g.drawString("90°", 420, 140);
		    
		    		// negative y
		    
		    g.drawString("270°", 413, 525);
		    g.drawString("-", 425, 540);
		    g.drawString("3\u03c0/2", 410, 560);
		    g.drawString("-", 425, 580);
		    g.drawString("(0,-1)", 405, 600);
		    
		    /*
		     * Degree labels
		     */
		    
		    Font font1 = new Font("Arial", Font.BOLD, 17);
		    g.setFont(font1);
		    g.drawString("30° --- \u03c0/6 --- (\u221A3/2, 1/2)", 590, 250); // 30 degrees
		    g.drawString("45° --- \u03c0/4 --- (\u221A2/2, 2/2) ", 550, 200); // 45 degrees
		    g.drawString("60° --- \u03c0/3 --- (1/2, \u221A3/2)", 490, 160); // 60 degrees
		    
		    g.drawString("(-1/2,\u221A3/2) --- 2\u03c0/3 --- 120°", 150, 165);	// 120 degrees
		    g.drawString("(-\u221A2/2, \u221A2/2) --- 3\u03c0/4 --- 135°", 60, 215);	// 135 degrees
		    g.drawString("(-\u221A3/2, 1/2) --- 5\u03c0/6 --- 150°", 50, 270); // 150 degrees
		    
		    g.drawString("(-\u221A3/2, -1/2) --- 7\u03c0/6 --- 210°", 60, 440); // 210 degrees
		    g.drawString("(-\u221a2/2, -1/2) --- 5\u03c0/4 --- 225°", 100, 480); // 225 degrees
		    g.drawString("(-1/2, -\u221a3/2) --- 4\u03c0/4 --- 240°", 150, 520); // 240 degrees 
		    
		    g.drawString("300° --- 5\u03c0/3 --- (1/2, -\u221a3/2)", 505, 505); // 300 degrees
		    g.drawString("315° --- 7\u03c0/4 --- (\u221A2/2, -\u221A2/2)", 555, 465); // 315 degrees
		    g.drawString("330° --- 11\u03c0/6 ---(\u221A3/2, -1/2)", 590, 420);
		    
		    
		    /*
		     * Angle lines or whatever they call it  
		     */
		    
		    g.setColor(Color.black);
		    g2.setStroke(new BasicStroke(3)); 
		    g.drawLine(320, 465, 550, 205);		// 45 and 225 degrees	 
		    g.drawLine(290, 215, 550, 447);		// 135 and 315 degrees
		    g.drawLine(370, 490 , 500, 170);    // 60 and 240 degrees
		    
		    g.drawLine(282, 432, 580, 250);		// 30 and 210 degrees
		    g.drawLine(350, 170, 500, 483);		// 120 and 300 degrees
		    g.drawLine(260, 275, 583, 398); 	// 150 and 330 degrees
		    
		    /*
		     * Origin
		     */
		    
		    g.setColor(Color.black);
		    g.fillOval(405, 313, 50, 50);
		    
		    g.setColor(Color.YELLOW);	 
		    g.fillArc(410, 318, 40, 40, 0, 360);
		    
		  
	}
	
}
