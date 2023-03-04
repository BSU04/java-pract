package dbproj;

import java.awt.*;  
import java.awt.event.*;

public class ChoiceExample
{  
 ChoiceExample()
 {  
   Frame f1 = new Frame("ChoiceExample");  
   Choice obj=new Choice();  
   obj.setBounds(80,80, 130,100);  
   obj.add("Hackathon");  
   obj.add("Coding");  
   obj.add("Best Mangaer");  
   obj.add("Treassure Hunt");  
   obj.add("Web Designing");  
   obj.add("Gaming");
   f1.add(obj);  
   f1.setSize(400,400);  
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
   new ChoiceExample();  
 }  
}