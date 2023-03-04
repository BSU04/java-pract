package dbproj;

import java.awt.*;  
import java.awt.event.*;

public class ListExample
{  
 ListExample()
 {  
   Frame f1 = new Frame("Coordinators");   
   List obj=new List(5);  // 6 means no of list items
   obj.setBounds(80,80, 100,100);  
   obj.add("Hari");  
   obj.add("Balu");  
   obj.add("Jino");  
   obj.add("Akshaya");  
   obj.add("Abhilash");  
   f1.add(obj);  
   f1.setSize(400,400);  
	
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
 public static void main(String args[])  
 {  
   new ListExample();  
 }  
} 
 