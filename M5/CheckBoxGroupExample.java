package dbproj;

import java.awt.*;  
import java.awt.event.*;
 
public class CheckBoxGroupExample
{    
 CheckBoxGroupExample(){    
   Frame f1 = new Frame("CheckBoxGroupExample");    
   CheckboxGroup obj = new CheckboxGroup();  
   Checkbox ckBox1 = new Checkbox("Male", obj, true);    
   ckBox1.setBounds(100,100, 50,50);    
   Checkbox ckBox2 = new Checkbox("Female", obj, false);    
   ckBox2.setBounds(100,150, 70,50);    
   f1.add(ckBox1);    
   f1.add(ckBox2);    
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
   new CheckBoxGroupExample();    
 }    
 
 
 
}
 