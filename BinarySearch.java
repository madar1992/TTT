//program to perform Binary search 
import java.util.Scanner;

public class BinarySearch 
{
   public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the total number of elements:");
    int n=sc.nextInt();
    int[] arr = new int[n];
    
    //read all the sorted elements using for loop
    System.out.println("enter the "+ n +" elements in sorted order:");
    for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
    System.out.println("enter the key value to be searched:");
    int key = sc.nextInt();    	
	  int pos=binSearch(arr,n,key);
    if(pos!=-1)
	           	System.out.println("the element "+key +" is found at position "+pos+" \n");
    else
	 		      System.out.println("the element "+key +" is not found \n");
                
    }

public static int binSearch(int narr[],int n,int key)

{
	int low=0,mid,high=n-1;
	while(low<=high)
	{
		mid=(low+high)/2;
		if(key>narr[mid])
		   low=mid+1;
		else if(key<narr[mid])
		     high=mid-1;
	       else
		  return mid;
	}
	return -1;
        
}

}