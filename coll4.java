import java.util.*;


class coll4
{

    public static void main(String a[])
    {
        ArrayList <Float>aobj=new ArrayList<Float>();
        aobj.add(10.6f);
        aobj.add(120.6f);
        aobj.add(210.6f);
        aobj.add(510.6f);

        aobj.add(1,2.34f);
        aobj.add(4,100.3f);

        Iterator iobj=aobj.iterator();

        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }
        aobj.clear();

    }
}