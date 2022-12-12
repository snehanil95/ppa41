import java.util.*;
class input
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        int iNo1=0,iNo2=0;
        int iAns=0;

        System.out.println("Enter the first number=");
        iNo1=sobj.nextInt();

        System.out.println("Enter the second number=");
        iNo2=sobj.nextInt();

        iAns=iNo1+iNo1;

        System.out.println("Additon is="+iAns);
    }

}