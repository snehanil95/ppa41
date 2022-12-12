import java.util.Scanner;

class ArrayUse
{

    public static void main(String atg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the size of aaray=");
        int iSize=sobj.nextInt();

        int Arr1[]=new int[iSize];
        System.out.println("number of elsement in aaray="+Arr1.length);
        System.out.println("enter the numbers=");
        for(int iCnt=0;iCnt<Arr1.length;iCnt++)
        {

            Arr1[iCnt]=sobj.nextInt();
        }

        System.out.println("Your given aaray=");
         for(int iCnt=0;iCnt<iSize;iCnt++)
        {

         System.out.println(Arr1[iCnt]+"\t");   
        }
            int iSum=0;
         for(int i=0;i<iSize;i++)
        {

             iSum=iSum+Arr1[i];
        }
        System.out.println("Addition is="+iSum);


            
    }
}