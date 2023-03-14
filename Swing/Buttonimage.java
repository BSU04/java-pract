import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

class Buttonimage implements ActionListener
{
	static JFrame frame;
        //Driver function
	public static void main(String args[])
	{
		//Create a frame
		frame=new JFrame("Image on Click");
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.white);
		frame.setLayout(new FlowLayout());
		//Create a button
		JButton button=new JButton("Display");
		frame.add(button);
		//Create an object
		Buttonimage obj=new Buttonimage();
		//Associate ActionListener with button
		button.addActionListener(obj);
		//Display the frame
		frame.setVisible(true);
	}
        //Function to display image
	public void actionPerformed(ActionEvent e)
	{
		//Display Image
		BufferedImage img = null;
		try {
			img = ImageIO.read(new URL("https://rajagiri.edu/uploads/programs-offered/2/image.jpg"));
		} catch (MalformedURLException e1) {
			
			e1.printStackTrace();
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		    ImageIcon icon = new ImageIcon(img);
		JLabel label=new JLabel(icon);
		frame.add(label);
		frame.pack();
		frame.setSize(2000,1000);
	}
}