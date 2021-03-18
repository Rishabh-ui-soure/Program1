import java.awt.*;  
import javax.swing.*;  
  
public class Calc{  
JFrame f;  
Calc(){  
   JFrame f=new JFrame("CALCULATOR");  
      
    JButton b1=new JButton("1");  
    JButton b2=new JButton("2");  
    JButton b3=new JButton("3");  
    JButton b4=new JButton("4");  
    JButton b5=new JButton("5");  
    JButton b6=new JButton("6");  
    JButton b7=new JButton("7");  
    JButton b8=new JButton("8");  
    JButton b9=new JButton("9");  
    JButton b10=new JButton("0");
    JButton b11=new JButton("+");
    JButton b12=new JButton("-");
    JButton b13=new JButton("*");
    JButton b14=new JButton("/");
    JButton b15=new JButton("=");
    JButton b16=new JButton("CLEAR");
    JButton b17=new JButton("DELETE");
    JTextField t1=new JTextField("ENTER NUMBER");  
    t1.setBounds(50,100, 200,30);  
          
    f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);  
    f.add(b6);f.add(b7);f.add(b8);f.add(b9); f.add(b10);
    f.add(b11);f.add(b12);f.add(b13);f.add(b14);f.add(b15);
    f.add(b16);f.add(b17);f.add(t1);
  
    f.setLayout(new GridLayout(4,4));  
    
  
    f.setSize(500,500);  
    f.setVisible(true);  
}  
public static void main(String[] args) {  
    new Calc();  
}  
}  
