/*Write a java program to input electricity unit charges and calculate total     electricity bill according to the given condition:
    For first 50 units Rs. 0.50/unit
    For next 100 units Rs. 0.75/unit
    For next 100 units Rs. 1.20/unit
     For unit above 250 Rs. 1.50/unit
     An additional surcharge of 20% is added to the bill*/
import java.util.*;
class Electrycity
{
	public static void  main(String a[])
	{
		double units,price=0,t;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of units");
		units=s.nextDouble();
		if(units<=50)
		{
			t=units*0.5;	
			price=t+(t*0.20);
			
		}
		else if(units<=150)
		{
			t=units*0.75;	
			price=t+(t*0.20);
		}
		else if(units<=250)
		{
			t=units*1.20;	
			price=t+(t*0.20);
		}
		else
		{
			t=units*1.50;	
			price=t+(t*0.20);	
		}
		System.out.println("Total electrycity bill"+price);
	}
}
		
		

		
		