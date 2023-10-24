import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class forLoopsDrawing extends JPanel{
	
	// Practice using Loops, random #s and 
	// methods
	public void paint(Graphics g) {
		//outermost circle with dimensions taking up the entire 1000 x 650 box
		for(int i = 0; i < 50; i++) {
			g.drawLine(0, 13*i, 1000-20*i, 0);
			g.drawLine(1000, 13*i, 20*i, 0);
			g.drawLine(0, 13*i, 20*i, 650);
			g.drawLine(1000, 650-13*i, 20*i, 650 );
			}
		// drawing the 2nd circle (smaller than initial circle)
		for(int i = 0; i < 26; i++) {
			g.drawLine(240, 160 + 13*i, 750 - 20*i, 160);
			g.drawLine(740, 160 + 13*i, 250 + 20*i, 160);
			g.drawLine(240, 160 + 13*i, 250 + 20*i, 490);
			g.drawLine(740, 160 + 13*i, 750 - 20*i, 490 );
			}
		// drawing the 3rd circle (even smaller than the former)	
		for(int i = 0; i < 13; i++) {
			g.drawLine(375, 250 + 13*i, 625 - 20*i, 243);
			g.drawLine(625, 250 + 13*i, 375 + 20*i, 243);
			g.drawLine(375, 250 + 13*i, 375 + 20*i, 408);
			g.drawLine(625, 250 + 13*i, 625 - 20*i, 408);
			}
			
		//the innermost circle
		for(int i = 0; i < 6; i++) {
			g.drawLine(440, 300 + 13*i, 550 - 20*i, 284);
			g.drawLine(560, 300 + 13*i, 450 + 20*i, 284);
			g.drawLine(440, 300 + 13*i, 450 + 20*i, 367);
			g.drawLine(560, 300 + 13*i, 550 - 20*i, 367);
			}
	//draws the rectangle/outline for this entire drawing
	g.drawRect(0, 0, 1000, 650);	 	
		 
			 
		 
		 
	}
	
	
	
	
	
	
	
	
	//method used to showcase the loop visually
	public static void main(String[] arg) {
		forLoopsDrawing m = new forLoopsDrawing();
	}
	
	public forLoopsDrawing() {
		JFrame f = new JFrame("Method Use");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1000,650);
		f.add(this);
		f.setVisible(true);
		
	}
}
