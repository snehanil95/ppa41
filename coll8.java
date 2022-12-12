import java.util.*;


class coll8
{

    public static void main(String a[])
    {
      Hashtable <String,Integer>hobj=new Hashtable<String,Integer>();

        hobj.put("PPA",18000);
        hobj.put("Python",18000);
        hobj.put("LB",18000);
        hobj.put("Angular",18000);

        System.out.println(hobj);

        Enumeration eobj=hobj.keys();
       
        while(eobj.hasMoreElements())
        {

           System.out.println(eobj.nextElement()); 
        }
    }
}