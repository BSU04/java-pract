package dbproj;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class AWTGraphicsDemo extends Frame {
       
   public AWTGraphicsDemo(){
      super("AWT Text Examples");
      prepareGUI();
   }

   public static void main(String[] args){
      AWTGraphicsDemo  awtGraphicsDemo = new AWTGraphicsDemo();  
      awtGraphicsDemo.setVisible(true);
   }

   private void prepareGUI(){
      setSize(600,600);
      addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      }); 
   }    

   @Override
   public void paint(Graphics g) {
      g.setColor(Color.RED);
      Font font = new Font("Serif", Font.PLAIN, 24);
      g.setFont(font);
	  g.drawString("Font Serif is used with size 24", 50, 70); 	  
	
	  g.setColor(Color.BLUE);
	  Font italicFont = new Font("Times New Roman", Font.ITALIC, 34);        
      g.setFont(italicFont);
      g.drawString("Font Times New Roman is Used in Italics with size 34", 50, 120); 
	  
	  g.setColor(Color.GREEN);
      Font boldFont = new Font("Algerian", Font.BOLD, 40);        
      g.setFont(boldFont);
	  g.drawString("Algerian is Used in Bold with size 40", 50, 170); 

	  
      g.setColor(Color.YELLOW);
      Font boldItalicFont = new Font("Castellar", Font.BOLD+Font.ITALIC, 45);        
      g.setFont(boldItalicFont);
	  g.drawString("Castellar is Used in Bold and Itlaics with size 45", 50, 220);
   }
}