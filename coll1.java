import java.util.*;

class coll1
{

    public static void main(String a[])
    {
        LinkedList <Integer>lobj=new LinkedList<Integer>();
        
        lobj.add(11);
        lobj.add(21);
        lobj.add(31);
        lobj.add(41);
        lobj.add(51);

        System.out.println("Elements of linklist are:"+lobj);

        lobj.addFirst(1);

        System.out.println("Elements of linklist are:"+lobj);

        lobj.addLast(121);
        System.out.println("Elements of linklist are:"+lobj);

        Iterator iobj=lobj.iterator();

        if(lobj.contains(211))
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

        lobj.set(3,500);
        System.out.println("After insertin specific position:"+lobj);

        lobj.clear();
        System.out.println(lobj);
    }
}