// Java program to count frequencies of array items
import java.util.*;

class ArrayFrequency
{
public static void countFreq(int arr[], int n)
{
	boolean visited[] = new boolean[n];
	
	Arrays.fill(visited, false);

	// Traverse through array elements and
	// count frequencies
  System.out.println("element\tcount");
	for (int i = 0; i < n; i++)
  {

		// Skip this element if already processed
		if (visited[i] == true)
			continue;
    		
    // Count frequency
    
		int count = 1;
		for (int j = i + 1; j < n; j++) 
    {
			if (arr[i] == arr[j]) 
      {
				visited[j] = true;
				count++;
			}
		}
    
		System.out.println(arr[i] + "\t" + count);
	}
}


public static void main(String []args)
{
	  Scanner sc=new Scanner(System.in);
    System.out.println("enter the total number of elements:");
    int n=sc.nextInt();
    int[] source = new int[n];
    
    
    //read all the elements using for loop
    System.out.println("enter the "+ n +" elements:");
    for(int i=0;i<n;i++)
      source[i]=sc.nextInt();
  	countFreq(source, n);
}
}

