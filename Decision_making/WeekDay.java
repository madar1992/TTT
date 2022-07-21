//Write a java program to input week number and print week day.
import java.util.*;
class WeekDay
{
	public static void main(String args[])
	{
		int weekno;
		Scanner s=new Scanner(System.in);
		System.out.println("enter weekno");
		weekno=s.nextInt();		
		if(weekno==1)
  		   System.out.println("It is Monday");
  	        else if(weekno==2)
  		   System.out.println("It is Tuseday");
		else if(weekno==3)
  		   System.out.println("It is Wendnesday");
		else if(weekno==4)
  		   System.out.println("It is Thrusday");
		else if(weekno==5)
  		   System.out.println("It is Friday");
		else if(weekno==6)
  		   System.out.println("It is Saturday");
    		else if(weekno==7)
			System.out.println("It is Sunday");
		else
			System.out.println("Invalid number");
	}
}