//hashcode and clone ,equals,finalize(Warning/note arrise while compiling ignore int )

class Employee implements Cloneable
{

    public int E_id;
    public String Name;
    public int Salary;
    public int Arr[];

    public Employee(int A,String c,int B)
    {
        this.E_id=A;
        this.Name=c;
        this.Salary=B;
        Arr=new int[4];
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    
    protected void finalize()
    {
        System.out.println("Inside finalize method");
        Arr=null;
    }
}                      


class cloane1
{
    public static void main(String a[])
    {

        
        
        try{
        Employee eobj1=new Employee(101,"Rahul",12120);
         Employee eobj2=(Employee)eobj1.clone();
         System.out.println("first emploree details:\n"+eobj1.Name+"\t"+eobj1.Salary+eobj1.E_id);
         System.out.println("second emploree details:\n"+eobj2.Name+"\t"+eobj2.Salary+eobj2.E_id);
         eobj1.Name="Sagar";
         System.out.println("first emploree details:\n"+eobj1.Name+"\t"+eobj1.Salary+eobj1.E_id);
         System.out.println("second emploree details:\n"+eobj2.Name+"\t"+eobj2.Salary+eobj2.E_id);
         System.out.println("hash code of obj1:"+eobj1.hashCode());
        //it shows cloned object is deep copy
        System.out.println("hash code of obj2:"+eobj2.hashCode());


        String s1="hello";
        String s2="hard";

        if(s1.equals(s2))
        {

            System.out.println("Obects are same:");
        }
        else{
        System.out.println("Obects are different:");
        }


        if(s1 == (s2))
        {

            System.out.println("Obects are same:");
        }
        else{
        System.out.println("Obects are different:");
        }

        System.out.println("hash code of s1:"+s1.hashCode());
        System.out.println("hash code of s2:"+s2.hashCode());
        }
        catch(CloneNotSupportedException obj)
        {}
    }
}