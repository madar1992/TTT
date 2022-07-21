//program to find insertion and deletion operation on arrays
import java.util.Scanner;

public class Main3 
{
   public static void main(String[] args) 
  {
    int[] numbers= new int[100];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the total number of elements:");
    int n=sc.nextInt();
    //int[] numbers = new int[n];
    
    //read all the elements using for loop
    System.out.println("enter the "+ n +" elements:");
    for(int i=0;i<n;i++)
      numbers[i]=sc.nextInt();
    while(true)
    {
      System.out.println("\nenter any one choice:");
      System.out.println("1. Inserting an element at beginning \n 2.Inserting an element at the end\n 3. Inserting an element at any position\n4.Delete an element at the beginning\n5.Delete an element at the end\n6.Delete an element at specified index\n7.exit");
      int choice=sc.nextInt();
      switch(choice)
        {
            case 1:
               int pos_beg = 1;
        System.out.print("Enter the element you want to insert:");
        int x_beg = sc.nextInt();
               Insert_Arr_Pos(numbers,n,x_beg,pos_beg);
               break;

            case 2:
               System.out.print("enter the last index where the element is to be inserted:");
            int pos_end=sc.nextInt();
        System.out.print("Enter the element you want to insert:");
        int x_end = sc.nextInt();
               Insert_Arr_Pos(numbers,n,x_end,pos_end);
               break;
                  
          case 3:
               System.out.print("Enter the position where you want to insert element:");
        int pos = sc.nextInt();
        System.out.print("Enter the element you want to insert:");
        int x = sc.nextInt();
               Insert_Arr_Pos(numbers,n,x,pos);
               break;
          
           case 4:

           // System.out.println("Enter Index of Element to be Deleted");
            //int index_beg = 0;
            Delete_Arr_Pos(numbers,n,0);
            break;

            case 5:

           // System.out.println("Enter Index of Element to be Deleted");
            //int index_ = n;
            Delete_Arr_Pos(numbers,n,n);
            break;
            case 6:

            System.out.println("Enter Index of Element to be Deleted");
            int index = sc.nextInt();
            Delete_Arr_Pos(numbers,n,index);
          case 7:
              System.exit(0); 
        }
       
    }
    
    
  }
   
   public static void Insert_Arr_Pos(int arr[],int n,int x, int index)
    {
         for(int i = (n-1); i >= (index-1); i--)
        {
            arr[i+1] = arr[i];
        }
        arr[index-1] = x;
        System.out.print("After inserting:");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.print(arr[n]);
   }
    

   public  static void Delete_Arr_Pos(int arr[],int n,
                                int index)
  {
        
 
        /* Move all elements right of index to left by one position */
        for (int i = index; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
 
        // decrement size of array
        n--;
 
        System.out.println("Final Array");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
  }  
}
//errors need to be corrected
