class Maths extends Object
{
 public int iNo1;
 public int iNo2;

 public Maths()
 {
    System.out.println("inside default constructor");
    iNo1=0;
    iNo2=0;

 }
  public Maths(int a,int b)
  {
    iNo1=a;
    iNo2=b;
  }

  public int AdditionNum()
  {
    int iAns=0;
    iAns=iNo2+iNo1;
    return iAns;

  }

  public int SubstactionNum()
  {
    int iAns=0;
    iAns=iNo2-iNo1;
    return iAns;

  }
}


class Addiiton
{
    public static void main(String arg[])
    {
        int iRet=0;
        System.out.println("Enter the number=");
        //String str = mobj.nextLine;()
        Maths mobj=new Maths(10,11);
        Maths mobj1=new Maths();
        iRet=mobj.AdditionNum();
        System.out.println("Additon of numbers="+iRet);
        iRet=mobj1.SubstactionNum();
        System.out.println("Substraction is="+iRet);
        iRet=mobj1.AdditionNum();
        System.out.println("Additon of numbers="+iRet);

    }

}
