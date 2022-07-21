//program to count and print negative elements of an array
import java.util.Scanner;

public class NegativeElement 
{
   public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the total number of elements:");
    int n=sc.nextInt();
    int[] numbers = new int[n];
    
    //read all the elements using for loop
    System.out.println("enter the "+ n +" elements:");
    for(int i=0;i<n;i++)
      numbers[i]=sc.nextInt();
    
    negativeCount(numbers,n);
     
  }
      public static void negativeCount(int arr[], int n)
    {
 
            int count=0;
            System.out.println("The Negative elements of the array are:");    
            for (int j = 0; j < arr.length; j++)
                if (arr[j]<0)
                {
                         System.out.println(arr[j]+"\n");
                          count++;
                }

     
            System.out.println("No.of negative elements of the array are:"+count);
    }  
  
}