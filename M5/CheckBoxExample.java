package dbproj;

import java.awt.*;  
import java.awt.event.*;

public class CheckBoxExample 
{  
 CheckBoxExample(){
   Frame f1 = new Frame("CheckBoxExample");  
   Checkbox ckbox1 = new Checkbox("Yes");  
   ckbox1.setBounds(100,100, 60,60);  
   Checkbox ckbox2 = new Checkbox("No");  
   ckbox2.setBounds(100,150, 60,60);  
   f1.add(ckbox1);  
   f1.add(ckbox2);  
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
   new CheckBoxExample();  
	
 }  
}   
