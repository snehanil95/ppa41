import java.util.*;   //inbuilt package
import Marvellous.Arithmatic;   //UserDefined package
import Marvellous.PPA.loop;
class DemoPackage
{
    public static void main(String arg[])
    {

        Scanner sobj= new Scanner(System.in);
        System.out.println("Enter thefirst number:");
        int iNo1=sobj.nextInt();

        System.out.println("Enter the Second number:");
        int iNo2=sobj.nextInt();
    
        Arithmatic aobj=new Arithmatic(iNo1,iNo2);

        
        int Rel=aobj.Addition();
        System.out.println("Addition is:"+Rel);

        int Rel1=aobj.Substraction();
        System.out.println("Substraction is:"+Rel1);


        loop lobj=new loop();
        lobj.Display();
        
    }
}