class Base
{
    public int A,B;

    public Base(int iNo1,int iNo2)
    {
        this.A=iNo1;
        this.B=iNo2;
    }

  public void fun()
  {
    System.out.println("inside base fun");
    System.out.println("value of A inside fun:"+this.A);
  }

}

class Derived extends Base
{
    public int X,Y;
    public Derived(int No1,int No2,int k,int l)
    {
        super(k,l);
        this.X=No1;
        this.Y=No2;
    }

    public void gun()
    {
        System.out.println("A from gun:"+super.A);
        super.fun();
    }
}





class supperDemo
{

    public static void main(String arg[])
    {
       Derived obj=new Derived(12,11,12,12);
       obj.gun();
    }
}