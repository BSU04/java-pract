package dbproj;

import java.awt.*;  
public class PanelDemo1{  
  PanelDemo1()  
  {  
    Frame panel_f= new Frame("Panel Demo");    
    Panel panel11=new Panel();  
    panel11.setBounds(40,80,200,200);    
    panel11.setBackground(Color.red);  
    Button box1=new Button("On");     
    box1.setBounds(50,100,80,30);    
    box1.setBackground(Color.gray);   
    Button box2=new Button("Off");   
    box2.setBounds(100,100,80,30);    
    box2.setBackground(Color.gray);   
    panel11.add(box1); 
    panel11.add(box2);  
    panel_f.add(panel11);  
    panel_f.setSize(400,400);    
    panel_f.setLayout(null);    
    panel_f.setVisible(true);    
  }  
  public static void main(String args[])  
  {  
    new PanelDemo1();  
  }  
} 
  