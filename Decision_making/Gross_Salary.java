/*Write a java program to input basic salary of an employee and calculate its Gross     salary according to following:
    Basic Salary <= 10000 : HRA = 20%, DA = 80%
    Basic Salary <= 20000 : HRA = 25%, DA = 90%
    Basic Salary > 20000 : HRA = 30%, DA = 95%*/
import java.util.*;
class Gross_Salary
{
	public static void  main(String a[])
	{
		double sal,gross=0,hra,da;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter salary of an employee");
		sal=s.nextDouble();
		if(sal<=1000)
		{
			hra=sal*0.20;	
			da=sal*0.80;
			gross=sal+hra+da;
		}
		else if(sal<=2000)
		{
			hra=sal*0.25;	
			da=sal*0.90;
			gross=sal+hra+da;
		}
		else if(sal>2000)
		{
			hra=sal*0.30;	
			da=sal*0.95;
			gross=sal+hra+da;
		}	
		
		System.out.println("Gross salary of employee"+gross);
	}
}
		
		

		
		