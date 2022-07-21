//Write a java program to check given number is even or odd number.
import java.util.*;
class EvenOdd
{
	public static void main(String args[])
	{
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("enter any  number");
		num=s.nextInt();
		
		if (num %2==0)
      		System.out.println (num+"is  even number");
		else 
		System.out.println (num+"is odd number");
		
    		
	}
}