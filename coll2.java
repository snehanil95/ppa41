import java.util.*;

class coll2
{

    public static void main(String a[])
    {
        LinkedList <String>lobj=new LinkedList<String>();
        
        lobj.add("kapil");
        lobj.add("Aditya");
        lobj.add("Rohan");
        lobj.add("Rutik");
        lobj.add("Tejas");

        System.out.println("Elements of linklist are:"+lobj);

        lobj.addFirst("pooja");

        System.out.println("Elements of linklist are:"+lobj);

        lobj.addLast("Sneha");
        System.out.println("Elements of linklist are:"+lobj);

        Iterator iobj=lobj.iterator();

        if(lobj.contains("Rohan"))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        System.out.println("Data using iterator is:");
        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }

        lobj.remove();
        System.out.println("Elements of linklist are:"+lobj);

        lobj.remove(1);
        System.out.println("Elements of linklist are:"+lobj);

        lobj.removeLast();
        System.out.println("Elements of linklist are:"+lobj);

        System.out.println("number of element:"+lobj.size());

        lobj.set(3,"Deepak");
        System.out.println("After insertin specific position:"+lobj);

        lobj.clear();
        System.out.println(lobj);
    }
}