package dbproj;

import java.awt.*;  
import java.awt.event.*;

class TextFieldExample{  
public static void main(String args[]){  
   Frame f1= new Frame("TextFieldExample");  
TextField text1,text2;  
   text1=new TextField("Rajagiri Colllege of Social Sciences");  
   text1.setBounds(60,100, 230,40);  
   text2=new TextField("Department of Computer Science");  
   text2.setBounds(60,150, 230,40);  
f1.add(text1); 
f1.add(text2);  
f1.setSize(500,500);  
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
} 
 