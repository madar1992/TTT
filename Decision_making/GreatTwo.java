//Write a java program to find maximum between two numbers.
import java.util.*;
class GreatTwo
{
	public static void main(String args[])
	{
		int num1,num2;
		Scanner s=new Scanner(System.in);
		System.out.println("enter any two numbers");
		num1=s.nextInt();
		num2=s.nextInt();
		if (num1 == num2)
      		System.out.println ("Both are Equal\n");
    		else
      		{
			int temp = num1 > num2 ? num1 : num2;
			System.out.println (temp + " is largest");
      		}
	}
}