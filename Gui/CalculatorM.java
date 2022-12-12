import javax.swing.*;
import java.awt.event.*;
class Calculatorx extends WindowAdapter implements ActionListener
{
    public JFrame mainframe;
    public JButton b1,b2,b3,b4,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b5;
    public JTextField t1,t2;
    public JLabel l;
    Integer no1=0,no2=0;
  public Calculatorx(int width,int height,String title )
  {
    mainframe=new JFrame(title);
    mainframe.setSize(width,height);
    
    

    mainframe.addWindowListener(this);

    b1=new JButton("+");
    b2=new JButton("*");
    b3=new JButton("-");
    b4=new JButton("/");
    b7=new JButton("1");
    b8=new JButton("2");
    b9=new JButton("3");
    b10=new JButton("4");
    b11=new JButton("5");
    b12=new JButton("6");
    b13=new JButton("7");
    b14=new JButton("8");
    b15=new JButton("9");
    b16=new JButton("=");
    b5=new JButton("0");
    b6=new JButton("%");

    b1.setBounds(50,340,50,50);  //x cordinate,y coordinate,width,height
    b2.setBounds(120,340,50,50);
    b3.setBounds(190,340,50,50);
    b4.setBounds(50,270,50,50);
    b5.setBounds(120,270,50,50);  //x cordinate,y coordinate,width,height
    b6.setBounds(190,270,50,50);
    b7.setBounds(50,200,50,50);
    b8.setBounds(120,200,50,50);
    b9.setBounds(190,200,50,50);  //x cordinate,y coordinate,width,height
    b10.setBounds(50,130,50,50);
    b11.setBounds(120,130,50,50);
    b12.setBounds(190,130,50,50);
    b13.setBounds(50,60,50,50);  //x cordinate,y coordinate,width,height
    b14.setBounds(120,60,50,50);
    b15.setBounds(190,60,50,50);
    b16.setBounds(260,60,50,50);

    mainframe.add(b1);
    mainframe.add(b2);
    mainframe.add(b3);
    mainframe.add(b4);
    mainframe.add(b5);
    mainframe.add(b6);
    mainframe.add(b7);
    mainframe.add(b8);
    mainframe.add(b9);
    mainframe.add(b10);
    mainframe.add(b11);
    mainframe.add(b12);
    mainframe.add(b13);
    mainframe.add(b14);
    mainframe.add(b15);
    mainframe.add(b16);

    t1=new JTextField();
    //t2=new JTextField();

   // t1.setBounds(70,140,70,30);
    //t2.setBounds(180,140,70,30);

    //mainframe.add(t1);
    //mainframe.add(t2);

    l=new JLabel();
    l.setBounds(150,25,200,100);

    mainframe.add(l);

    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);

    mainframe.setLayout(null);
    mainframe.setVisible(true);

  }

  public void windowClosing(WindowEvent obj)
  {
    System.exit(0);
  }

  public void actionPerformed(ActionEvent obj)
  {

    try
    {
        no1=Integer.parseInt(t1.getText());
        no2=Integer.parseInt(t1.getText());

        if(obj.getSource()==b1)
        {
            l.setText("Addition is:"+(no1+no2));
        }

        else if(obj.getSource()==b2)
        {
           l.setText("Multiplication is:"+(no1*no2));
        }

        else if(obj.getSource()==b3)
        {
            l.setText("Substraction is:"+(no1-no2));
        }

        else if(obj.getSource()==b4)
        {
            l.setText("Division is:"+(no1/no2));
        }

    }

    catch(Exception eobj)
    {

    }
  }
}

class CalculatorM
{

    public static void main(String a[])
    {
        Calculatorx cobj=new Calculatorx(600,600,"Marvellous Calculator");
    }
}