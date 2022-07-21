//program to copy all elements of one array to another
import java.util.Scanner;

public class ArrayCopy 
{
   public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the total number of elements:");
    int n=sc.nextInt();
    int[] source = new int[n];
    int[] destination=new int[n];
    
    //read all the elements using for loop
    System.out.println("enter the "+ n +" elements:");
    for(int i=0;i<n;i++)
      source[i]=sc.nextInt();
    
    System.out.println("source array elements are:");
    for(int i=0;i<n;i++)
      System.out.println(source[i]);

       // iterate and copy elements from source to destination
        for ( int j= 0; j < n; j++)
            destination[j] = source[j];

    System.out.println("destination array elements are:");
    for(int k=0;k<n;k++)
      System.out.println(destination[k]);
  
}
    
  












  
  
}