class Array1
{
public int Arr[];
public int iSize=0;

public Array1(int no)
{
 iSize=no;
 Arr[]=new int[iSize];

}
public void Accept()
{

    Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the size of aaray=");
        int iSize=sobj.nextInt();

        System.out.println("enter the numbers=");
        for(int iCnt=0;iCnt<Arr1.length;iCnt++)
        {

            Arr1[iCnt]=sobj.nextInt();
        }


 public void Display()
 {
  System.out.println("Your given aaray=");
         for(int iCnt=0;iCnt<iSize;iCnt++)
        {

         System.out.println(Arr1[iCnt]+"\t");   
        }

public int Addition()
{

    int iSum=0;
         for(int i=0;i<iSize;i++)
        {

             iSum=iSum+Arr1[i];
             
        }
        return iSum;
}
 }
}


}


class ArrayUseX
{

    public static void main(String agr[])
    Array1 obj
    int iRet=

}