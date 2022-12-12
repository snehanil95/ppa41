class Demo implements Runnable
{
  public void run() //inbuilt method
  {
    int i=0;

    for(i=1;i<10;i++)
    {
        try{
        System.out.println(Thread.currentThread().getName()+":"+i);
        Thread.sleep(500);
        }
        catch(InterruptedException obj)
        {

        }
    }
  }

}


class threadDemo
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
try{
        t1.start();
       
       

        t1.join();

         t2.start();
        t2.join();
}
 catch(InterruptedException obj)
        {

        }
    
        System.out.println("End of main thread");
    }
}