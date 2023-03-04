package dbproj;

import java.awt.*;  
import java.awt.event.*;

public class TextAreaExample 
{  
 TextAreaExample()
 {  
   Frame f1= new Frame("TextArea Example");  
   TextArea area=new TextArea("You can write your Description");  
   area.setBounds(30,40, 450,450);  
   f1.add(area);  
   f1.setSize(600,600);  
   f1.setLayout(null);  
   f1.setVisible(true);  
	
	f1.addWindowListener(new WindowAdapter() // event listener to close the window
                          { 
                             public void windowClosing(WindowEvent e) 
                              { 
                                System.exit(0); 
                               } 
                           }); 
	
 }  
 public static void main(String args[])  
 {  
   new TextAreaExample();  
 }  
}  
 