package dbproj;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class AWTGraphicsDemo1 extends Frame {
       
   public AWTGraphicsDemo1(){
      super("AWT Text Examples");
      prepareGUI();
   }

   public static void main(String[] args){
      AWTGraphicsDemo1  awtGraphicsDemo = new AWTGraphicsDemo1();  
      awtGraphicsDemo.setVisible(true);
   }

   private void prepareGUI(){
      setSize(400,400);
      addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      }); 
   }    

   @Override
   public void paint(Graphics g) {
      
	
	  setBackground(Color.BLACK);  // setting the background color to black
		g.setColor(Color.GREEN);  // setting up the color to green
		
		//Set 1
		/*g.drawLine(30, 40, 100, 200);
		g.drawOval(150, 180, 10, 10);
		g.drawRect(200, 210, 20, 30);
		g.setColor(Color.magenta);
		g.fillOval(300, 310, 30, 50);
		g.fillRect(400, 350, 60, 50);
		g.setColor(Color.WHITE);*/
		
		
			   
		g.setColor(Color.yellow);
		g.fillOval(50,50,200,200);
		g.setColor(Color.BLUE); // Blue left eye
		g.fillOval(100,100,20,10);
		g.setColor(new Color(0,255,255)); // Blue-Green right eye
		g.fillOval(175,100,20,10);
		g.setColor(new Color(255,0,0)); // Red mouth
		g.fillRect(120,200,50,4);
			   
		
		
		
   }
}