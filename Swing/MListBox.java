import java.io.*;
import java.awt.*;
import java.awt.event.*;
class CList extends Frame implements ActionListener {
List l1,l2;
TextField t1;
Button b1,b2,b3,b4;
CList() {
super("List Box");
l1= new List();
l2= new List();
t1=new TextField(15);
b1=new Button(" >> ");
b2=new Button(" << ");
b3 = new Button(" ADD ");
b4=new Button(" EXIT ");
setLayout(new GridLayout(2,4,100,100));

add(l1);
add(b1);
add(b2);
add(l2);
add(t1);
add(b3);
add(b4);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
setSize(900,500);
setVisible(true);
}

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1) {
int i;
i= l1.getSelectedIndex();
if(i>=0)
l2.add(l1.getSelectedItem());
l1.remove(i);
}
else if(ae.getSource()==b2) {
int i;
i= l2.getSelectedIndex();
if(i>=0)
l1.add(l2.getSelectedItem());
l2.remove(i);
}
else if(ae.getSource()==b3) {
l1.add(t1.getText());
t1.setText(" ");
}
else if(ae.getSource()==b4) {
System.exit(0);
}
}
}
class MListBox {
public static void main(String args[])
{
CList obj = new CList();
}
}