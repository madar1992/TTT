//Write a java program to check whether a year is leap year or not
import java.util.*;
class LeapYear
{
	public static void main(String args[])
	{
		int year;
		Scanner s=new Scanner(System.in);
		System.out.println("enter any  year number");
		year=s.nextInt();
		
		if (((year % 4 == 0) && (year % 100 != 0)) ||(year % 400 == 0))
      		System.out.println (year+"is leap Year");
		else 
		System.out.println (year+"is not leap Year");
		
    		
	}
}