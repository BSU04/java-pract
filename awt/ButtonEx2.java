package dbproj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ButtonEx2 implements ActionListener
{
Frame jf;
Button button1, button2;
Label label;


ButtonEx2()
{
jf= new Frame("Button click events");
button1= new Button("Yes");
button2= new Button("No");
label = new Label();

jf.add(button1);
jf.add(button2);
jf.add(label);

button1.addActionListener(this);
button2.addActionListener(this);

jf.setLayout(new FlowLayout(FlowLayout.CENTER,60,10));
jf.setSize(250,150);
jf.setVisible(true);

jf.addWindowListener(new WindowAdapter() // event listener to close the window
                           { 
                              public void windowClosing(WindowEvent e) 
                               { 
                                 System.exit(0); 
                                } 
                            }); 


}


public void actionPerformed(ActionEvent ae)
{
if(ae.getActionCommand().equals("Yes"))
{
label.setText("You've clicked Yes");
jf.add(label);
jf.setVisible(true);
}

if(ae.getActionCommand().equals("No"))
{
label.setText("You've clicked No");
jf.add(label);
jf.setVisible(true);
}
}

public static void main(String... ar)
{
new ButtonEx2();
}

}