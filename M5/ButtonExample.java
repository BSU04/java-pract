package dbproj;

import java.awt.*;  
import java.awt.event.*;

public class ButtonExample
{  
public static void main(String[] args) 
{  
   Frame f1=new Frame("Button Example");  
   Button b1=new Button("Click");  
   b1.setBounds(80,200,200,50);  
   f1.add(b1);  
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