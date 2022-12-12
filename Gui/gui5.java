
//by using swing

import java.awt.event.*;
//import java.awt.*;
import javax.swing.*;
class MarvellousFrame
{
    public MarvellousFrame(String title)
    {
    JFrame fobj=new JFrame(title);

        fobj.setSize(500,500);
        
        fobj.setVisible(true);
        fobj.addWindowListener(new MarvellousListener());




    }
}
                   
class MarvellousListener extends WindowAdapter
{

public void windowClosing(WindowEvent obj)
{System.exit(0);}

}
class gui5
{
    public static void main(String a[])
    {
        MarvellousFrame mobj=new MarvellousFrame("Marvellous ppa41");
    }
}