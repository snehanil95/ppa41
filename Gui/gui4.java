import java.awt.event.*;
import java.awt.*;
class MarvellousFrame
{
    public MarvellousFrame(String title)
    {
    Frame fobj=new Frame(title);

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
class gui4
{
    public static void main(String a[])
    {
        MarvellousFrame mobj=new MarvellousFrame("Marvellous ppa41");
    }
}