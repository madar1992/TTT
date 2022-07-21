//Write a java program to check given number is zero, positive or negative number.
import java.util.*;
class CheckNum
{
	public static void main(String args[])
	{
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("enter any  number");
		num=s.nextInt();
		
		if (num == 0)
      		System.out.println (num+"is  zero");
		else if (num >0)
		System.out.println (num+"is  positive number");
		else
		System.out.println (num+"is negative number");
    		
	}
}