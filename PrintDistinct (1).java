//program to find distinct elements of  the array
import java.util.Scanner;

public class PrintDistinct 
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
    printDistinct(numbers,n);
       
    }
    
    
  
  
      public static void printDistinct(int arr[], int n)
    {
        
       System.out.println("distinct elements of the array are:");
      // Pick all elements one by one
        for (int i = 0; i < n; i++)
        {
            // Check if the picked element
            // is already printed
            int j;
            for (j = 0; j < i; j++)
            if (arr[i] == arr[j])
                break;
     
            // If not printed earlier,
            // then print it
            if (i == j)
            System.out.println( arr[i] + " ");
            
        }
    }
 
}