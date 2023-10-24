import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class WhileLoops extends JPanel{
	
	// Practice using Loops, random #s and 
	// methods
	public void paint(Graphics g) {
		 
		//1) draw a concentric rectangle that's 10pixels from all sides of the "gray"
		//portion of the GUI
		g.drawRect(10, 10, 760, 540);
		
		//2) Draw a horizontal line to bisect the Rectangle
		g.drawLine(10, 270, 770, 270);
		
		
		//3) Draw a vertical line to bisect the shape again
		g.drawLine(760/2, 10, 760/2, 550);
		
		//4) Draw small rectangle on top left
		g.drawLine(760/4, 10, 760/4, 540/2);
		
		//5) print "Hello World" 10 times
		
		int var = 0; //control var
		  while (var < 10){
		  System.out.println("Hello World");
		  var++;
		  }
		
		 //6 line drawn many times in a row
		 int count = 0;
		 	while (count <= 10) {
		 	g.drawLine(40, 20, 140, ((10*count)+20));
		 	count++;
		 	}
		 //7)) random line dash
		 	for(int countLine = 0; countLine <= 8; countLine++) {
		 		g.drawLine(150, (240-countLine *10), 50, (240-countLine *10) );
		 	
		 	}
		 //8 concentric circles
		 	for(int circleCount = 0; circleCount <= 4; circleCount++) {
		 		g.drawOval((260 + circleCount*10), (10 + circleCount*10), (120 - (circleCount*20)), (120 - (circleCount*20)) );
		 	}
		 //9 squares list
		 	int squareCount = 1;
		 	while(squareCount <= 10) {
		 		g.drawRect(220 + 5*squareCount, 100 + 5*squareCount, 20 + 5 * squareCount, 20 + 5 * squareCount);
		 		squareCount++;
		 	}
		 //10 5-31 g.drawString with 2+3+4+5+...+31
		 	int sum = 0;
		 	String showSum = "";
		 	for(int numSum = 2; numSum <= 31; numSum++) {
		 		sum += numSum;
		 		if (numSum == 31){
			 		showSum += numSum + " = " + sum;
			 	}else {
			 		showSum += numSum + " + ";
			 	}
	
		 	}
		 g.drawString(showSum.substring(0, 66), 400, 30);
		 g.drawString(showSum.substring(66, showSum.length()-10), 400, 55);
		 g.drawString(showSum.substring(showSum.length()-10, showSum.length()), 400, 80);
		 System.out.print(sum);
		 	
		 //11 n! where n is a rand # between
		 //5 and 10 and must be written with
		 //g.drawString
		 int rand =(int) ((Math.random()*6) +5);
		 int product = 1;
		 String equation = "";
		 while(rand >= 2) {
			product = product * rand;
			equation += rand + " * ";
			rand--; 
		 }
		 if (rand == 1) {
			 equation += rand + " = " + product;
		 }
		 g.drawString(equation, 40, 320);
		 //12 whole bunch of random circles	
		 int repetition = 0;
		
		 while (repetition <=57) {
			 int randomSize = (int) (Math.random()*50 + 60);
			 g.drawOval( (int) ((Math.random()*300) + 375), (int) ((Math.random()*180) + 275), randomSize, randomSize);
			 repetition++;
		 }
			 
		 
		 
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] arg) {
		WhileLoops m = new WhileLoops();
	}
	
	public WhileLoops() {
		JFrame f = new JFrame("Method Use");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800,600);
		f.add(this);
		f.setVisible(true);
		
	}
}
