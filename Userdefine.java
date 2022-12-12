import java.util.*;

class AgeInvalide extends Exception
{


}

class UserDefine
{

    public static void main(String a[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter yor age:");
        int age=sobj.nextInt();

        try
        {
            if(age<15)
            {
                throw new AgeInvalide("age less than 15")
            }
            else
            {
                System.out.println("Age valid");
            }
        }
        catch(AgeInvalide obj)
        {
            System.out.println(obj);
        }

    }
}