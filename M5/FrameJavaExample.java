package dbproj;
import java.awt.*; 
import java.awt.event.*; 
class FrameJavaExample 
{ 
    public static void main (String args[]) 
    { 
             Frame frame = new Frame("This is a Frame"); //Creating a frame
			  Label lb = new Label("RCSS");   //Creating a label
			  frame.add(lb);       //adding label to the frame
             frame.setSize(500,500); //set the size of the frame
             frame.addWindowListener(new WindowAdapter() // event listener to close the window
                          { 
                             public void windowClosing(WindowEvent e) 
                              { 
                                System.exit(0); 
                               } 
                           }); 
                            frame.setVisible(true); 
     } 
} 