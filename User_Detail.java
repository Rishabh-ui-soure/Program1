import java.awt.*;
import java.awt.event.*;
class userdetail extends frame
{
userdetail()
{
addWindowListener(new WindowAdapter()
{
public void windorClosing(WindowEvent e)
{
dispose();
System.out.println("Bye!!");
}
});
}
public void paint(Graphics g)
{
this.setBackground(new Color(100,20,20));
g.setColor(Color.yellow);
Font f=new Font("Time New Roman",Font.BOLD,30);
g.setFont(f);
g.drawString("Name: Vishal Sarver",100,100);
g.setColor(Color.yellow);

Font f1=new Font("Calibri",Font.BOLD,30);
g.setFont(f1);
g.drawString("Enollment No.: 19100BTIT06638",100,200);
g.setColor(Color.yellow);

Font f2=new Font("Arial",Font.ITALIC,30);
g.setFont(f2);
g.drawString("Course: B.TECH",100,300);
g.setColor(Color.yellow);

Font f4=new Font("Clarendon BIK",Font.BOLD,30);
g.setFont(f4);
g.drawString("Section: IT-B",100,500);
g.setColor(Color.yellow);

Font f3=new Font("Comic sans MS",Font.BOLD,30);
g.setFont(f3);
g.drawString("Semster: IV",100,400);
g.setColor(Color.yellow);
}
public static void main(String[] args)
{
userdetail m = new userdetail();
m.setSize(1500,1500);
m.setTitle("userdetail");
m.setVisible(true);
}
}
