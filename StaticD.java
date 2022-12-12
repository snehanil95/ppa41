class StaticD
{
    static
    {

        System.out.println("inside static block in main00");
    }

    public StaticD()
    {
       System.out.println("*****"); 
    }

    public static void main(String atg[])
    {
        System.out.println("inside main");
    
    
    System.out.println("static no3="+Demo.no3);
    System.out.println(" static no3="+Demo.no4);
   
   
    Demo obj=new Demo();
    Demo obj1=new Demo();
     Demo.gun();
    obj.fun();
    }
}

class Demo
{
   public int no1;
   public int no2;

   public static int no3;
   public static int no4;

   static
   {
    System.out.println("inside Demo Static");
    no3=51;
    no4=121;
   } 

   public Demo()
   {
    System.out.println("inside Demo constructor");
    no1=11;
    no2=21;
   }

   public void fun()
   {
    System.out.println("inside Demo fun");
    
     System.out.println(this.no1);
    System.out.println(this.no2);
    System.out.println(this.no3);
    System.out.println(this.no4);
    
   }
public static void gun()
{
    System.out.println("inside static Demo gun");
   
   
    //System.out.println(no1);
    //System.out.println(no2);
    System.out.println(no3);
    System.out.println(no4);
   }
}

