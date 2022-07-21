//program to count negative elements of an array
import java.util.Scanner;

public class NegativeEleCount 
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
    int count=negativeCount(numbers,n);
     System.out.println("No.of negative elements of the array are:"+count);
  }
      public static int negativeCount(int arr[], int n)
    {
 
            int count=0;
            for (int j = 0; j < arr.length; j++)
                if (arr[j]<0)
                          count++;
     
            return count;
    }
    
  












  
  
}