//program to find sum and average of array elements
import java.util.Scanner;

public class Main2 
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
    while(true)
    {
      System.out.println("enter any one choice:");
      System.out.println("1. finding sum and average \n 2.finding max and min\n 3. finding unique elements in array");
      int choice=sc.nextInt();
      switch(choice)
        {
            case 1:
               sumAverage(numbers,n);
               break;
            case 2:
               maxMin(numbers,n);
               break;
            case 3:
               printDistinct(numbers,n);
               break;
          case 4:
              System.exit(0); 
        }
       
    }
    
    
  }
   
   public static void sumAverage(int[] numbers, int len)
   {
      int sum = 0;
      Double average; 
      // access all elements using for each loop
      // add each element in sum
     
      for (int number: numbers)
     {
       sum += number;
     }
     // calculate the average
     // convert the average from int to double
     average =  ((double)sum / (double)len);
  
     System.out.println("Sum = " + sum);
     System.out.println("Average = " + average);
     return;
   }   

  public static void maxMin(int[] arr, int n)
   {
      
 
        for(int i=0;i<n;i++)     //Use to hold the element
        {
            for(int j=i+1;j<n;j++)    //Use to compare with the rest of the elements 
            {
                if(arr[i]<arr[j])     //Check and swap
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
 
        System.out.println("The minimum array element is " + arr[n-1]);
        System.out.println("The maximum array element is " + arr[0]);
        System.out.println("Second Largest element is "+arr[1]);   
        System.out.println("Second Smallest element is "+arr[n-2]);
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
