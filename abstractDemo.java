abstract class Arithmatic
{

    public int additon(int No1,int No2)
    {
        return No1+No2;
    }
    public abstract int substraction(int No1,int No2);
} 
class Marv extends Arithmatic
{

public int substraction(int iNo1,int iNo2)
{
    return iNo1-iNo2;
}
}

class abstractDemo
{

    public static void main(String a[])
    {
        int ret=0;
        //Arithmatic aobj=new Arithmatic();
        Marv obj=new Marv();
        ret=obj.substraction(21,11);
        System.out.println(ret);

        ret=obj.additon(11,12);
        System.out.println("Add"+ret);
    }
}