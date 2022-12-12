class jagged
{
 public static void main(String asg[])
 {

    int Arr[][]={{10,23},{43,65,78},{12,34,65,76,87}};
    System.out.println(Arr.length);
     System.out.println(Arr[0].length);
   
   System.out.println(Arr[1].length);
   System.out.println(Arr[2].length);
   System.out.println("Element of aaray=");
   
   
   for(int i=0;i<Arr.length;i++)
     {
        
        System.out.println("\t");
      for(int j=0;j<Arr[i].length;j++)
     {
System.out.println("\t");
    System.out.println(Arr[i][j]);
    System.out.println("\t");
    
     }
     
     System.out.println("\n");
 }

}
}