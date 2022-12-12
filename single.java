class Base
{
  public int A,B;

  public Base()
  {
    System.out.println("Base constructor:");
    this.A=10;
    this.B=20;

  }

  public void fun()   //def
  {
    System.out.println("inside Base fun:");
  }

 public void gun()          //def
  {
    System.out.println("inside Base gun:");
  }
 
  public void fun(int no)       //ovwerloadeddefination
  {
    System.out.println("inside Base fun with integer:");
  }



}
class Derived extends Base
{
  public int X,Y;

  public Derived()      
  {

    System.out.println("Derived");
    this.X=30;
    this.Y=40;
  }

  public void sun()         //Def
  {
    System.out.println("inside Derived sun");
  }
 public void gun()          //overrided def
 {
    System.out.println("inside derived gun");
 }
}



class single
{

    public static void main(String arg[])
    {
       // Base bobj1=new Base();
        //Derived dobj1=new Derived();

        Base dobj=new Derived();

        dobj.fun();
        dobj.fun(11);
        dobj.gun();
        //dobj.sun();
    }
}