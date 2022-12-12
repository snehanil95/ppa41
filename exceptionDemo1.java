import java.util.*;

class exceptionDemo1
{
    public static void main(String a[])
    {
        Scanner sobj=new Scanner(System.in);

        int iNo1=0,iNo2=0,iAns=0;

        System.out.println("Enter first number:");
        iNo1=sobj.nextInt();

        System.out.println("Enter first second:");
        iNo2=sobj.nextInt();

        try
        {
            System.out.println("Inside try block");
        iAns=iNo1/iNo2;
        }
        catch(ArithmaticException obj)
        {
         System.out.println("Inside catch1 block");  
         System.out.println(obj); 
         System.out.println("Division="+iAns);
        }

        catch(NullPointerException obj)
        {
            System.out.println("Inside catch2 block");
            System.out.println(obj);
        }

        catch(Exception obj)
        {
            System.out.println("Inside catch3 block");
            System.out.println(obj);

        }
        finally
        {
            System.out.println("Inside finally block"); 
            sobj.close();
        }
        
    }
}