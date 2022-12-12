class Demo extends Thread
{
  public void run() //inbuilt method
  {
    int i=0;

    for(i=1;i<10;i++)
    {
        System.out.println(Thread.currentThread().getName()+":"+i);
    }
  }

}


class threadDemo1
{
    public  static void main(String a[])
    {

        System.out.println("Inside main mothod");
        Demo obj1=new Demo();
        Demo obj2=new Demo();

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.setName("First");
        t2.setName("Second");

        t1.start();
        t2.start();
    }
}