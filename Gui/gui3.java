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
//after implementing WindowListener compiling application then
//u ll get multiple abstract method line by line
//if u want write ur own logic then implemets WindowListener
class MarvellousListener implements WindowListener
{

public void windowDeactivated(WindowEvent obj)
{
}
public void windowActivated(WindowEvent obj){}

public void windowDeiconified(WindowEvent obj){}

public void windowIconified(WindowEvent obj)
{}
public void windowClosed(WindowEvent obj){}

public void windowClosing(WindowEvent obj){System.exit(0);}
public void windowOpened(WindowEvent obj){}

}
class gui3
{
    public static void main(String a[])
    {
        MarvellousFrame mobj=new MarvellousFrame("Marvellous ppa41");
    }
}