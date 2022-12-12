class loop1
{

    public static void main(String arg[])
    {
        int Arr[]={10,20,30,40};

        int iCnt=0;

        System.out.println("traversal of array using for loop");
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {

            System.out.println(Arr[iCnt]);
        }


        System.out.println("traversal of array using while loop");
        iCnt=0;
        while(iCnt!=Arr.length)
        {
        System.out.println(Arr[iCnt]); 
            iCnt++;

    }
    System.out.println("traversal of array using for loop");
    iCnt=0;
      do
      {

        System.out.println(Arr[iCnt]); 
            iCnt++;

      }while(iCnt!=Arr.length);
    

    System.out.println("traversal of array using for each loop");
        for(int iNo:Arr)
            {file:///home/snehanil/1ppa/java/Multi.java


                System.out.println(iNo);
            }

}
}