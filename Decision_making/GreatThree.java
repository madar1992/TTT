//ite a java program to find maximum between three numbers
import java.util.*;
class GreatThree
{
	public static void main(String args[])
	{
		int num1,num2,num3;
		Scanner s=new Scanner(System.in);
		System.out.println("enter any three numbers");
		num1=s.nextInt();
		num2=s.nextInt();
		num3=s.nextInt();
		if (num1 == num2&&num2==num3)
      		System.out.println ("Three are Equal\n");
    		else
      		{
			int temp = (num1 > num2 )? (num1 > num3?num1:num3):(num2>num3?num2:num3);
			
			System.out.println (temp + " is largest");
      		}
	}
}