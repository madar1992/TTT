// Java program to all unique elements
import java.util.*;

class Unique
{
// Function that counts the frequency of elements 
    // and prints unique elements
   public static void unique(int arr[], int freq[])
    {
        int count;
        for(int i = 0; i<arr.length; i++)
        {
            // Resets count to 1 after each element
            count=1;
            for(int j = i + 1; j<arr.length;j++)
            {
                // If another occurence of the current element is found 
                // in the array then increments the counter
                if(arr[i]==arr[j])
                {
                    count++;
                    freq[j] = 0;
                }
            }
            // Stores the frequency of each element
            if(freq[i]!=0)
            {
                freq[i] = count;
            }
        }
        
        // Prints the unique elements
        System.out.print("The unique elements in the array are: ");
        for(int i = 0; i<arr.length;i++)
        {
            if(freq[i]==1)
                System.out.print(arr[i]+" ");
        }
    }

public static void main(String []args)
{
	  Scanner sc=new Scanner(System.in);
    System.out.println("enter the total number of elements:");
    int n=sc.nextInt();
    int[] source = new int[n];
    int[] freq=new int[n];
    Arrays.fill(freq,-1);
    
    
    //read all the elements using for loop
    System.out.println("enter the "+ n +" elements:");
    for(int i=0;i<n;i++)
      source[i]=sc.nextInt();
  	unique(source, freq);
}
}


