//program to perform Bubble Sort 
import java.util.Scanner;

public class BubbleSort 
{
   public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the total number of elements:");
    int n=sc.nextInt();
    int[] arr = new int[n];
    
    //read all the elements using for loop
    System.out.println("enter the "+ n +" elements:");
    for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
    
	  bubbleSort(arr,n);
    }
    
  public static void bubbleSort(int narr[],int n)
 {
    int i,j,k,temp;
    for(i=0;i<n-1;i++)
    {
    	for(j=0;j<n-i-1;j++)
  	    {
  	    	if(narr[j]>narr[j+1])
  	    	{
  	    		temp=narr[j];
  	    		narr[j]=narr[j+1];
  	    		narr[j+1]=temp;
  	    	}
  	    	
  	    }
  	    System.out.printf("\npass %d\n",i+1);
  	    for(k=0;k<n;k++)
  	     System.out.printf("%d ",narr[k]);
     }
    
 }
}