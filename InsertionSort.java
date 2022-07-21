//program to perform Insertion Sort 
import java.util.Scanner;

public class InsertionSort 
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
    
	  insertionSort(arr,n);
    }
    
  public static void insertionSort(int narr[],int n)
{
	int i,j,temp,k;
	for(i=0;i<n;i++)
	{
		temp=narr[i];
		for(j=i;j>0&&narr[j-1]>temp;j--)
		{
			narr[j]=narr[j-1];
		}
		narr[j]=temp;
		System.out.printf("\npass %d\n",i);
		for(k=0;k<n;k++)
		   System.out.printf("%d ",narr[k]);
	}
}

}