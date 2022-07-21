
//program to perform Quick Sort

import java.util.Scanner;

public class QuickSort 
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
    	quickSort(arr,0,n-1);
      System.out.println("The elements in the sorted order are:\n");
      for(int i=0;i<n;i++)
        System.out.print(arr[i]+"\n");
   }
    
  public static int[] quickSort(int arr[], int low, int high)
{
    int pivot, i, j, temp;
    if (low < high)
    {
        pivot = low;
        i = low;
        j = high;
        while (i < j) 
        {
            while (arr[i] <= arr[pivot] && i <= high)
            {
                i++;
            }
            while (arr[j] > arr[pivot] && j >= low)
            {
                j--;
            }
            if (i < j)
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[j];
        arr[j] = arr[pivot];
        arr[pivot] = temp;
        quickSort(arr, low, j - 1);
        quickSort(arr, j + 1, high);
    }
  return arr;
}
}