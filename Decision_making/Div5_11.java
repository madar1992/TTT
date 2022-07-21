//Write a java program to check whether a number is divisible by 5 and 11 or not.
import java.util.*;
class Div5_11
{
	public static void main(String args[])
	{
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("enter any  number");
		num=s.nextInt();
		
		if( (num %5== 0)&&(num%11==0))
      		System.out.println (num+"is  divisible by 5 & 11");
		else
		System.out.println (num+"is not divisible by 5 & 11");
    		
	}
}