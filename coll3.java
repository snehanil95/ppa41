import java.util.*;

class Book
{

    public String Name;
    public int Price;

    public Book(String s,int i)
    {
        this.Name=s;
        this.Price=i;
    }

    public void Display()
    {
        System.out.println(this.Name+"\t"+this.Price);
    }
}

class coll3
{

    public static void main(String a[])
    {
            //Book obj=new Book("C programming",500);

            LinkedList <Book>lobj=new LinkedList<Book>();

            lobj.add(new Book("Let us c",400));
            lobj.add(new Book(" c programming",420));
            lobj.add(new Book("Angular",230));
            lobj.add(new Book("Data structure",500));

            Iterator iobj=lobj.iterator();  //iterator() method returns object 
            //of Iterator class
            Book bref=null;

            while(iobj.hasNext())
            {
                bref=(Book)iobj.next();
                bref.Display();
            }
            lobj.clear();
    }
}