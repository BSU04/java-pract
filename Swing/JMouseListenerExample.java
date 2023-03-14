import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class JMouseListenerExample extends Frame implements MouseListener
{
public JMouseListenerExample( )
{
addMouseListener(this);
setSize(350,350);
setVisible(true);
}

public void mousePressed(MouseEvent ev)
{
setBackground(Color.green);
System.out.println("Pressing Mouse");
}


public void mouseReleased(MouseEvent ev)
{
setBackground(Color.blue);
System.out.println("Released the mouse");
}

public void mouseClicked(MouseEvent ev)
{

setBackground(Color.yellow);
System.out.println("Clicked");
}

public void mouseEntered(MouseEvent ev)
{
setBackground(Color.red);
System.out.println("Entered the window");
}

public void mouseExited(MouseEvent ev)
{
setBackground(Color.white);
System.out.println("Mouse left the window");
}

public static void main(String args[])
{
new JMouseListenerExample();
}
}