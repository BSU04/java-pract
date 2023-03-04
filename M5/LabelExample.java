package dbproj;

import java.awt.*;  
import java.awt.event.*;
class LabelExample
{  
 public static void main(String args[])
 {     
   Frame f1= new Frame("Label Example");  
   Label lab1,lab2;  
   lab1=new Label("AWT Control Label");  
   lab1.setBounds(50,100,200,30);  
	/*
		x - the new x-coordinate of this component
		y - the new y-coordinate of this component
		width - the new width of this component
		height - the new height of this component
	*/
   lab2=new Label("Find the X and Y axis on which it is displaying");  
   lab2.setBounds(50,100,300,30);  
	
	f1.add(lab1); 
	f1.add(lab2);  
	f1.setSize(500,500); 
	f1.addWindowListener(new WindowAdapter() // event listener to close the window
                          { 
                             public void windowClosing(WindowEvent e) 
                              { 
                                System.exit(0); 
                               } 
                           }); 

f1.setLayout(null);  
f1.setVisible(true);  
}  
}