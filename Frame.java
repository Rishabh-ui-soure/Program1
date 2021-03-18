import java.awt.*;
import java.awt.event.*;
class frame extends Frame
{
frame()
{
addWindowListener(new WindowAdapter()
{
public void WindowClosing(WindowEvent e)
{
System.out.print("EXIT");
dispose();
}
});
}
 public static void main(String args[])
{
frame f=new frame();
f.setSize(300,300);
f.setVisible(true);
f.setTitle("frame");
//f.addWindowListener(new close());
}
}
