//program to count negative elements of an array
import java.util.Scanner;

public class Count 
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
    EvenOddCount(numbers,n);
    
  }
      public static void EvenOddCount(int arr[], int n)
    {
 
            int even_count=0,odd_count=0;
            for (int j = 0; j < arr.length; j++)
                if (arr[j]%2==0)
                          even_count++;
                else 
                      odd_count++;
     
             System.out.println("No.of even elements of the array are:"+even_count);
      System.out.println("No.of odd elements of the array are:"+odd_count);
    }
    
  












  
  
}