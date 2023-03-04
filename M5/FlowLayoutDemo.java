package dbproj;

import java.awt.*;
public class FlowLayoutDemo
{
    Frame f;
    FlowLayoutDemo ()
    {
        f = new Frame ();
        Label l1 = new Label ("Enter Name");
        TextField tf1 = new TextField (30);
        Button b1 = new Button ("SUBMIT");

        f.add (l1);
        f.add (tf1);
        f.add (b1);
        f.setLayout (new FlowLayout (FlowLayout.LEFT));
        
        //setting flow layout of LEFT alignment  
        f.setSize (300, 300);
        f.setVisible (true);
    }
    public static void main (String[]args)
    {
        new FlowLayoutDemo ();
    }
}