//program to perform Linear search 
import java.util.Scanner;

public class LinearSearch 
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
    System.out.println("enter the key value to be searched:");
    int key = sc.nextInt();    	
	  int pos=linSearch(arr,n,key);
    if(pos!=-1)
	           	System.out.println("the element "+key +" is found at position "+pos+" \n");
    else
	 		      System.out.println("the element "+key +" is not found \n");
                
    }
    
  public static int linSearch(int narr[],int n,int key)

  {
	
	  for(int i=0;i<n;i++)
	    if (key==narr[i]) return i+1;
       return -1;
        
  }


}