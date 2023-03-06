package dbproj;

import java.awt.*;
import java.awt.event.*;

public class KeyListenerExample extends KeyAdapter {
	Frame f;
	TextArea ta1;
	TextField t1;
	//Label l1;
	KeyListenerExample()
	{
		f = new Frame();
		f.setSize(500,500);
		f.setVisible(true);
		
		ta1=new TextArea();
		ta1.setBounds(50,50,200,200);
		f.add(ta1);
		ta1.addKeyListener(this);
		
		t1=new TextField();
		t1.setBounds(50,300,50,50);
		f.add(t1);
		
		////l1 = new Label();
		//l1.setBounds(50,500,50,50);
		//f.add(l1);
	}
	public void keyReleased(KeyEvent e)
	{
		String txt = ta1.getText();
		t1.setText("No:"+txt.length());
	}
	public static void main(String[] args) {
	new KeyListenerExample();
	}

}