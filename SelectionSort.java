
//program to perform Selection Sort
/*
Selection sort is a simple sorting algorithm. This sorting algorithm is an 
in-place comparison-based algorithm in which the list is divided into two parts,
 the sorted part at the left end and the unsorted part at the right end. 
Initially, the sorted part is empty and the unsorted part is the entire list.

The smallest element is selected from the unsorted array and swapped 
with the leftmost element, and that element becomes a part of the sorted array.
This process continues moving unsorted array boundary from one element to the right. 

1.Set MIN to location 0
2.Search the minimum element in the list
3.Swap with value at location MIN
4.Increment MIN to point to next element
5.Repeat until the list is sorted

*/
import java.util.Scanner;

public class SelectionSort 
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
    	selectionSort(arr,n);
   }
    
  public static void selectionSort(int narr[],int n)
  {
    for (int i = 0 ;i< n-1; i++)
    {
         int min = i;

         for (int j = i+1; j<n; j++)
	 {
            if (narr[j] < narr[min])
	    {
            min = j;
            }
         }
         int temp = narr[min];
         narr[min] = narr[i];
         narr[i] = temp;
    }
    for (int i = 0 ;i< n; i++)
    {
         System.out.print(" "+narr[i]);
    }
    
  }

}